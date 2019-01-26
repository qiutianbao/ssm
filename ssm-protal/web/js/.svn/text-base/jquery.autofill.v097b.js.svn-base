/*
 * AutoFill: a jQuery plugin, version: 0.98beta (2012-5-23)
 * @requires jQuery v1.2.3 or later
 *
 * AutoFill is a jQuery plugin that makes it easy to fill text-input.
 *
 * For usage and examples, visit:
 * http://crazyhr.com/af/index.html
 * Licensed under the MIT:
 * http://www.opensource.org/licenses/mit-license.php
 *
 * Copyright (c) 2012
 */
(function($){
    $.fn.autoFill = function(options){
        var defaults = {
            getData: "",
			defaultSelect:false,
			maxRow:10,
			keyboardEnable:true,
			autoFill:true,
			callBack:null,
			fillDisplay:"",
			listDisplay:"",
			forceSelect:false,
			filter: /\\/,
			pageable:false,
			pageParam:'page',
			tip:false,
			tipHtml:null,
			width:'auto',
			debug:false
        },_this=this;
		this.AF = $.extend(defaults, options);
		this.AF.af_focusItem = 0;
		this.AF.clickStatus = false;
		this.AF.displayHasDone = false;
        var  afListBox = '',$t=$(this); 
		
		this.fixLayOut=function(){
			
			var af_ml = this.position().left - this.parent().position().left;
			var af_ml_css = af_ml+"px";
			var af_twidth = (-$t.width()-6) + "px";
			var af_theight = ($t.height()+8) + "px";
			
			var iCal_obj=$t[0];
			var iCal_d_top = iCal_obj.getBoundingClientRect().top;
			var iCal_d_bottom = document.documentElement.clientHeight - iCal_d_top - $t.height();
			
			if(this.AF.width == 'auto')this.next(".afListBox").css("width",(_this.width()+6));else this.next(".afListBox").css("width",parseInt(this.AF.width));
			this.next(".afListBox").css("left",($t.position().left));
			var iCal_current_height = this.next(".afListBox").height();
			if(iCal_d_bottom < iCal_current_height && iCal_d_bottom <= iCal_d_top){
				this.next(".afListBox").css("top",($t.position().top - parseInt($t.css('borderBottomWidth')) - iCal_current_height ));
			} else {
				this.next(".afListBox").css("top",($t.position().top+$t.height()+parseInt($t.css('borderTopWidth'))+parseInt($t.css('borderBottomWidth'))+2));
			}
		}
		
		//iniBox
		this.iniBox=function(){
			var rowHtml= "";
			if(this.AF.tip)rowHtml="<div class='afTip'></div>"
			for(var i = 0; i < _this.AF.maxRow; i += 1){
				rowHtml +="<div class='afRow' style='display:none'></div>";
			}
			afListBox ='<div class="afListBox" style="display:none">'+rowHtml+'</div>';
			this.after(afListBox);
			_this.fixLayOut();
		}
		
		//doCallBack
		this.doCallBack=this.AF.callBack;
		
		//doTiphrml
		this.tipHtml=this.AF.tipHtml;
		
		//callback
		this.callBack=function(rowJson){
			if(this.AF.callBack != null){
				_this.doCallBack(rowJson);
			}
		}
		
		//nextPage
		this.nextPage=function(){
			if(_this.AF.pageInfo == null)return false;
			var af_current_pageCount = _this.AF.pageInfo.pageCount;
			var af_current_dataCount = _this.AF.pageInfo.dataCount;
			var af_current_pageNumber = _this.AF.pageInfo.pageNumber;
			if(af_current_pageNumber < af_current_pageCount){
				_this.getData(parseInt(af_current_pageNumber)+1,'next');
			} else {
				_this.getData(1,'next');
			}
		}
		
		//backPage
		this.backPage=function(){
			if(_this.AF.pageInfo == null)return false;
			var af_current_pageCount = _this.AF.pageInfo.pageCount;
			var af_current_dataCount = _this.AF.pageInfo.dataCount;
			var af_current_pageNumber = _this.AF.pageInfo.pageNumber;
			if(af_current_pageNumber > 1){
				_this.getData(parseInt(af_current_pageNumber)-1,'back');
			} else {
				_this.getData(af_current_pageCount,'back');
			}
		}
		
		//displayBox
		this.displayBox=function(json,onItem,flag){
			if(json == null || json.length == 0){
				return false;
			}
			if(this.AF.defaultSelect == false){
				var stItem = -1;
			} else if(this.AF.defaultSelect == true){
				var stItem = 0;
			}
			
			if(onItem > json.length - 1){
				if(this.AF.pageable){
					_this.nextPage();
					return false;
				} else {
					if(this.AF.defaultSelect == false){
						this.AF.af_focusItem = -1;
						onItem = -1;
					} else if(this.AF.defaultSelect == true){
						this.AF.af_focusItem = 0;
						onItem = 0;
					}
				}
				
			} else if(onItem < stItem){
				if(this.AF.pageable){
					_this.backPage();
					return false;
				} else {
					this.AF.af_focusItem = json.length - 1;
					onItem = json.length - 1;
				}
			}
			var rowInnerHtml = "";
			for(var c = 0; c < json.length; c += 1){
				var afFocusClass = "";
				if(onItem == c){
					this.next(".afListBox").children(".afRow:eq("+c+")").addClass("afFocusOn");
				} else{
					this.next(".afListBox").children(".afRow:eq("+c+")").removeClass("afFocusOn");
				}
				json[c].af_sort = c;
				
				var listDisplay = this.AF.listDisplay;
				if(listDisplay == ''){
					for(var loopKey in this.AF.listData[c]){
						listDisplay+=loopKey+",";
					}
				}
				var keyName = listDisplay.split(',');
				
				var currentRowHtml = "";
				for(var lDc = 0; lDc < keyName.length; lDc += 1){
					if(keyName[lDc] != ''){
						if(keyName[lDc] == 'af_sort'){break;}
						var cValue = "this.AF.listData[c]."+keyName[lDc];
						currentRowHtml += eval(cValue)+" ";
					}
				}
				currentRowHtml = currentRowHtml.substring(0,currentRowHtml.length-1);
				
				this.next(".afListBox").children(".afRow:eq("+c+")").html(currentRowHtml).show();
			}
			
			for(var d = json.length; d < this.AF.maxRow; d += 1){
				this.next(".afListBox").children(".afRow:eq("+d+")").hide();
			}
			_this.fixLayOut();
			
			if(this.AF.listData != null && this.AF.listData.length > 0){
				this.next(".afListBox").css("display","inline");
			}
			
		}
		
		//getInputType
		this.getInputType=function (){
			af_input = $t.val();
			if(af_input.length == 0){return ""}
			var af_re_n = /^\d+$/;
			var af_re_c = /^[\u4e00-\u9fa5]+$/;
			var af_re_e = /^[A-Za-z]+$/;
			if(af_re_n.test(af_input)){
				return "numbers";
			} else if(af_re_c.test(af_input)){
				return "chinese";
			} else if(af_re_e.test(af_input)){
				return "english";
			} else{
				return "words";
			}
		}
		
		//checkAjaxType
		this.checkAjaxType=function(){
			var af_getData = this.AF.getData;
			for(i = 0; i < af_getData.length; i += 1){
				if(af_getData[i].type != null && af_getData[i].type != "" && af_getData[i].url != null && af_getData[i].url != "" && af_getData[i].param != null && af_getData[i].param != ""){
					if(af_getData[i].type == "all"){
						
						this.AF.topAjaxType = "all";
						eval('this.AF.ajaxTypeAll = {url:"'+af_getData[i].url+'",param:"'+af_getData[i].param+'"}');
					} else if(af_getData[i].type == "words"){
						eval('this.AF.ajaxTypeWords = {url:"'+af_getData[i].url+'",param:"'+af_getData[i].param+'"}');
						if(af_getData[i].type != "all"){
							this.AF.topAjaxType = "words";
						}
					} else if(af_getData[i].type == "numbers"){
						eval('this.AF.ajaxTypeNumbers = {url:"'+af_getData[i].url+'",param:"'+af_getData[i].param+'"}');
					} else if(af_getData[i].type == "chinese"){
						eval('this.AF.ajaxTypeChinese = {url:"'+af_getData[i].url+'",param:"'+af_getData[i].param+'"}');
					} else if(af_getData[i].type == "english"){
						eval('this.AF.ajaxTypeEnglish = {url:"'+af_getData[i].url+'",param:"'+af_getData[i].param+'"}');
					}
				}
			}
		}
		
		_this.checkAjaxType();
		
		//renderTipHtml
		this.renderTipHtml=function(obj){
			_this.next(".afListBox").show();
			if(_this.AF.tipHtml != null){
				var t_af_tip_html = _this.AF.tipHtml(obj);
				if(t_af_tip_html != null)_this.next(".afListBox").find(".afTip").html(t_af_tip_html);else _this.next(".afListBox").find(".afTip").html("");
			}
		}
		
		//getData
        this.getData=function (pageNumber,af_flag){
			this.AF.listData = "";
			this.AF.pageInfo = "";
			
			var ajax_url = "";
			var dataObj;
			
			if(this.AF.pageable && this.AF.pageParam != null && this.AF.pageParam != '' && pageNumber != null && pageNumber != ''){
				dataObj = this.AF.old_dataObj;
				ajax_url = this.AF.old_ajax_url;
				eval('dataObj.'+this.AF.pageParam+'='+pageNumber);
			} else {
				if(this.AF.getData == ''){
				var listData = '[{"key":"1","value":"Test","code":"c001"},{"key":"2","value":"测试","code":"c002"},{"key":"3","value":"測試","code":"c003"},{"key":"4","value":"テスト","code":"c004"},{"key":"5","value":"시험","code":"c005"},{"key":"6","value":"тест","code":"c006"}]';
				var listJson = eval('(' + listData + ')');
				this.afterGetData(listJson);
				} else{
					if(_this.getInputType() == ""){_this.next(".afListBox").find(".afRow").hide();return false;}
					
					if(/[\\]/.test($t.val())){
						$t.val($t.val().replace(/[\\]/g,''));
					}
					var b_test = _this.AF.filter;
					while(b_test.test($t.val())){
						$t.val($t.val().replace(b_test,''));
					}
					
					if(this.AF.topAjaxType == "all"){
						if(null == this.AF.ajaxTypeAll){_this.next(".afListBox").find(".afRow").hide();_this.renderTipHtml(null);return false;}
						ajax_url = this.AF.ajaxTypeAll.url;
						eval('dataObj = {'+this.AF.ajaxTypeAll.param+':"'+$t.val()+'"}');
					} else if(this.AF.topAjaxType == "words"){
						if(this.getInputType() == "words" || this.getInputType() == "english" || this.getInputType() == "chinese"){
							if(null == this.AF.ajaxTypeWords){_this.next(".afListBox").find(".afRow").hide();_this.renderTipHtml(null);return false;}
							ajax_url = this.AF.ajaxTypeWords.url;
							eval('dataObj = {'+this.AF.ajaxTypeWords.param+':"'+$t.val()+'"}');
							
						} else{
							if(this.getInputType() == "numbers"){
								if(null == this.AF.ajaxTypeNumbers){_this.next(".afListBox").find(".afRow").hide();_this.renderTipHtml(null);return false;}
								ajax_url = this.AF.ajaxTypeNumbers.url;
								eval('dataObj = {'+this.AF.ajaxTypeNumbers.param+':"'+$t.val()+'"}');
							}
						}
					} else{
						if(this.getInputType() == "numbers"){
							if(null == this.AF.ajaxTypeNumbers){_this.next(".afListBox").find(".afRow").hide();_this.renderTipHtml(null);return false;}
							ajax_url = this.AF.ajaxTypeNumbers.url;
							eval('dataObj = {'+this.AF.ajaxTypeNumbers.param+':"'+$t.val()+'"}');
						} else if(this.getInputType() == "chinese"){
							if(null == this.AF.ajaxTypeChinese){_this.next(".afListBox").find(".afRow").hide();_this.renderTipHtml(null);return false;}
							ajax_url = this.AF.ajaxTypeChinese.url;
							eval('dataObj = {'+this.AF.ajaxTypeChinese.param+':"'+$t.val()+'"}');
						} else if(this.getInputType() == "english"){
							if(null == this.AF.ajaxTypeEnglish){_this.next(".afListBox").find(".afRow").hide();_this.renderTipHtml(null);return false;}
							ajax_url = this.AF.ajaxTypeEnglish.url;
							eval('dataObj = {'+this.AF.ajaxTypeEnglish.param+':"'+$t.val()+'"}');
						} else{
							_this.next(".afListBox").find(".afRow").hide();
							_this.renderTipHtml(null);
							return false;
						}
					}
	
					if(dataObj == null || ajax_url == null || ajax_url == ""){
						return false;
					}
					
					this.AF.old_dataObj = dataObj;
					this.AF.old_ajax_url = ajax_url;
					
					if(this.AF.pageable && this.AF.pageParam != null && this.AF.pageParam != ''){	
						eval('dataObj.'+this.AF.pageParam+'=1');
					}
				}
			}
		
			$.ajax({
			type: "GET",
			data: dataObj,
			dataType:"json",
			url: ajax_url,
			cache: false,
			success: function(obj){
				if(obj == null){
					_this.renderTipHtml(obj);
					_this.next(".afListBox").find(".afRow").hide();
				}
				var af_pageInfo = null;
				var af_listobj = null;
				if(obj.pageInfo != null){
					af_pageInfo = obj.pageInfo;
				}
				if(obj.listInfo != null){
					af_listobj = obj.listInfo;
				} else {
					af_listobj = obj;
				}
				if(af_listobj == null || af_listobj.length == 0){
					_this.renderTipHtml(obj);
					_this.next(".afListBox").find(".afRow").hide();
				}
				_this.renderTipHtml(obj);
				_this.afterGetData(af_listobj,af_pageInfo,af_flag);
			},error:function(err){
				}
			});
			
        }
		
		//afterGetData
		this.afterGetData=function(listJson,pageInfo,flag){
			if(listJson == null){
				return false
			}
			if(flag == 'back'){
				var onItem = listJson.length-1;
				this.AF.af_focusItem = listJson.length-1;
			} else if(flag == 'next'){
				var onItem = 0;
				this.AF.af_focusItem = 0;
			} else {
				if(this.AF.defaultSelect == false){
					var onItem = -1;
					this.AF.af_focusItem = -1;
				} else if(this.AF.defaultSelect == true){
					var onItem = 0;
					this.AF.af_focusItem = 0;
				}
			}
			
			
			this.AF.listData = listJson;
			this.AF.pageInfo = pageInfo;
			
			if(this.AF.maxRow < listJson.length){
				listJson.length = this.AF.maxRow;
			}
			this.displayBox(this.AF.listData,onItem,flag);
		}
		

		//$t on focus
		$t.focus(function(){
			_this.AF.clickStatus = false;
			_this.AF.displayHasDone = false;
			if($t.val() == ""){return false}
			_this.getData();
			if(_this.AF.defaultSelect == false){
				var onItem = -1;
				_this.AF.af_focusItem = -1;
			} else if(_this.AF.defaultSelect == true){
				var onItem = 0;
				_this.AF.af_focusItem = 0;
			}
			_this.displayBox(_this.AF.listData,onItem);
		});
		_this.iniBox();
		$t.keyup(function(event){
			if(event.which == 40 && _this.AF.keyboardEnable){
				_this.af_focusDown();
			} else if(event.which == 38 && _this.AF.keyboardEnable){
				_this.af_focusUp();
			} else if(event.which == 13 && _this.AF.keyboardEnable){
				_this.fillDisplay(_this.AF.af_focusItem,true,"enterKey");
				$t.blur();
			} else if(event.which == 37 || event.which == 39){
				return false;
			} else{
				if(/[\\]/.test($t.val())){
					$t.val($t.val().replace(/[\\]/g,''));
				}
				var b_test = _this.AF.filter;
				while(b_test.test($t.val())){
					$t.val($t.val().replace(b_test,''));
				}
				_this.next(".afListBox").hide();
				_this.getData();
			}
		});
		
		//mouseover
		$t.next(".afListBox").children(".afRow").mouseover(function(){
			_this.AF.clickStatus = true;
			if(_this.next().attr("class") == "afListBox"){
				_this.AF.af_focusItem = $(this).parent(".afListBox").find("div").index($(this));
				$(this).parent(".afListBox").find("div").removeClass("afFocusOn");
				$(this).addClass("afFocusOn");
			}
		});
		
		//mouseout
		$t.next(".afListBox").children(".afRow").mouseout(function(){
			_this.AF.clickStatus = false;
		});
 
		//click
		$t.next(".afListBox").children(".afRow").click(function(){
			_this.AF.af_focusItem = $(this).parent().find("div.afRow").index(this);
			_this.fillDisplay(_this.AF.af_focusItem,true,"leftClick");
			_this.next(".afListBox").hide();
		});
		
		//blur
		$t.blur(function(){
			if(!_this.AF.clickStatus){
				if(!_this.AF.displayHasDone && _this.AF.forceSelect && _this.AF.listData != null && _this.AF.listData.length > 0 && $t.val() != null && $t.val() != ''){
					_this.fillDisplay(0,true,"blur");
					_this.next(".afListBox").hide();
					return this;
				} else {
					if($t.val() == null || $t.val() == ""){
						var af_callBackParam = '{"action":"blur","rowData":""}';
						var af_callBackJson = eval('(' + af_callBackParam + ')');
						_this.callBack(af_callBackJson);
					}
					_this.next(".afListBox").hide();
					return this;
				}
			} else {
				if(_this.AF.displayHasDone){
					_this.next(".afListBox").hide();
				}
			}
			
		});
		
		
		//down Key
		this.af_focusDown=function (){
			this.AF.af_focusItem +=1;
			_this.displayBox(this.AF.listData,this.AF.af_focusItem);
			_this.fillDisplay(this.AF.af_focusItem,false,"downKey");
		}
		
		//Up key
		this.af_focusUp=function (){
			this.AF.af_focusItem -=1;
			if(this.AF.pageable && this.AF.af_focusItem == -1){
				_this.backPage();
			}
			_this.displayBox(this.AF.listData,this.AF.af_focusItem);
			_this.fillDisplay(this.AF.af_focusItem,false,"upKey");
		}
		
		//get getFill
		this.fillDisplay=function(getSort,directMethod,action){
			if( getSort >= 0 && getSort <= this.AF.listData.length && (this.AF.autoFill || directMethod)){
				var fillDisplay = this.AF.fillDisplay;
				if(fillDisplay == ''){
					for(var loopKey in this.AF.listData[getSort]){
						fillDisplay+=loopKey+",";
					}
				}
				var keyName = fillDisplay.split(',');
				var display = "";
				for(var fDc = 0; fDc < keyName.length; fDc += 1){
					if(keyName[fDc] != ''){
						if(keyName[fDc] == 'af_sort'){break;}
						var cValue = "this.AF.listData[getSort]."+keyName[fDc];
						display += eval(cValue)+" ";
					}
				}
				display = display.substring(0,display.length-1);
				$t.val(display);
				this.AF.displayHasDone=true;
				var af_callBackParam = '{"action":"'+action+'"}';
				var af_callBackJson = eval('(' + af_callBackParam + ')');
				af_callBackJson.rowData = this.AF.listData[getSort];
				this.callBack(af_callBackJson);
			}
		}
		return this;
    };
})(jQuery);

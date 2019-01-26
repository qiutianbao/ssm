//打开遮罩
function blockWindow(msg){
	if(msg==null){
		msg = '正在加载请稍等……';
	}
	var subMsgBox='<div style="text-align:center;color:#666;padding:8px 0px;line-height:35px"><div>'+msg+'</div><div><img src="img/loading_1.gif" alt=""/></div></div>';
	$.blockUI({
		 message: subMsgBox, 
         fadeIn: 0, 
         fadeOut: 0, 
         showOverlay: true,
         centerY: true, 
         css: { 
             width: '300px', 
             padding: '2px', 
             '-webkit-border-radius': '5px', 
             '-moz-border-radius': '5px', 
             color: '#ddd',
             border: '2px solid #aaa',
             left: '50%',
             'margin-left':'-150px'
         },
         overlayCSS:{opacity:.3,backgroundColor:'#eee',cursor:"default"
         }
	});
}

function blockElement(obj,msg){
	if(msg==null){
		msg = '正在加载请稍等……';
	}
	var subMsgBox='<div style="text-align:center;color:#666;padding:8px 0px;line-height:35px"><div>'+msg+'</div><div><img src="img/loading_1.gif" alt=""/></div></div>';
	$(obj).block({
		 message: subMsgBox, 
         fadeIn: 0, 
         fadeOut: 0, 
         showOverlay: true,
         centerY: true, 
         css: { 
             width: '300px', 
             padding: '2px', 
             '-webkit-border-radius': '5px', 
             '-moz-border-radius': '5px', 
             color: '#ddd',
             border: '2px solid #aaa',
             left: '50%',
             'margin-left':'-150px'
         },
         overlayCSS:{opacity:.3,backgroundColor:'#eee',cursor:"default"
         }
	});
}

//关闭遮罩
function unblockWindow(){
	$.unblockUI();
}

function unblockElement(obj){
	$(obj).unblock();
}

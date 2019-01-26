$(function () {
	$(".page5-2>ul>li").bind("click",function(obj){
		var type=$(this).attr("val");
		$(".page5-2>ul>li").removeClass("selected");
		$(this).addClass("selected");
		//alert(type);
		var pageSize = $("#pageSize").val();
		getData(1,pageSize,type);
	});
	
});

function getData(pageNo,pageSize,impact){
	$.ajax({
		type : 'POST',
		url : 'newsMakerData.do',
		data : {'pageNo' : pageNo,'pageSize' : pageSize,'impact' : impact},
		beforeSend : function(xhr){
			$("#dataspace").html("数据加载中...");
			$('html, body, .content').animate({scrollTop: $(".top").height()}, 300);
		},
		success : function(data){
			var jsonData = eval( "(" + data + ")" );
			$("#dataspace").html("");
			$("div.scrollpage").html("");
			$(jsonData.recorddata).appendTo("#dataspace");
			$(jsonData.pagedata).appendTo("div.scrollpage");
		},
		error : function(xhr,err){
			alert("error");
		}
	});
}

function changePageSize(pageNo,pageSize){
	//alert(pageNo+"  "+pageSize);
	var impact = $(".page5-2 li.selected").attr("val");
	getData(pageNo,pageSize,impact);
}

function changePage(pageNo){
	//alert(pageNo);
	var pageSize = document.getElementById('pageSize').value;
	var impact = $(".page5-2 li.selected").attr("val");
	getData(pageNo,pageSize,impact);
}
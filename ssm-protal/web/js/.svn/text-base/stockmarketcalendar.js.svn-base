$(function () {
	$($(".tab .all a").get(7)).addClass("selected");
	
	if($(".all .selected").length > 0)
        $($(".cont .item").get($(".all .selected").attr("val"))).fadeIn();
	
	$(".all a").bind("click",function(obj){ 
        $(".all a").removeClass("selected");
        $(this).addClass("selected");
        $(".cont .item").hide();
        $($(".cont .item").get($(this).attr("val"))).fadeIn();
    });
    
	$(".start").bind("click",function(){
        var leftsize = 101;
        var currentsize = parseInt($(".tab .all").css("left").replace("px"));

        if(currentsize < 0)
        {
            var pyl = currentsize + leftsize;
            if(pyl % leftsize != 0) pyl = parseInt(pyl/leftsize) * leftsize;

            $(".tab .all").animate({"left": pyl + "px"});
        }
        else
        {
            //$(".tab .all").animate({"left":"0px"});
        }
    });
   
	$(".end").bind("click",function(){
        var leftsize = 101;
        var currentsize = parseInt($(".tab .all").css("left").replace("px"));
        var width = $(".tab .all").width() - $(".container").width();

        if(currentsize >= 0 - width + leftsize)
        {
            var pyl = currentsize - leftsize;
            if(pyl % leftsize != 0) pyl = parseInt(pyl/leftsize) * leftsize;

            $(".tab .all").animate({"left": pyl + "px"});
        }
        else
        {
            //$(".tab .all").animate({"left":0 - width + "px"});
        }
    });
});
package com.jxtb.common.page;

public class PageHtmlUpdate {
	public static String getHtml(int intPageNo,int pageSize,int count){
		int totalPages=1;
		if (count % pageSize > 0) {
			totalPages = count / pageSize + 1;
		} else {
			totalPages = count / pageSize;
		}
		if(intPageNo>totalPages){
			intPageNo = totalPages;
		}
		if(intPageNo<1){
			intPageNo = 1;
		}
		StringBuffer reStr = new StringBuffer();
		reStr.append("<form name='splitPageForm' id='splitPageForm' method='post' ");
		reStr.append(">");
		
		reStr.append("<ul class='pagination'>");
		
		if (totalPages < 2) {
			reStr.append("<li class='paginate_button'><a href='javascript:void(0)'>首页</a></li>");
			reStr.append("<li class='paginate_button'><a href='javascript:void(0)'>上一页</a></li>");
			reStr.append("<li><span>"+intPageNo+"/"+totalPages+"</span></li>");
			reStr.append("<li class='paginate_button'><a href='javascript:void(0)'>下一页</a></li>");
			reStr.append("<li class='paginate_button'><a href='javascript:void(0)'>尾页</a></li>");
		} else {
			if (intPageNo < 2) {
				reStr.append("<li class='paginate_button'><a href='javascript:void(0)'>首页</a></li>");
				reStr.append("<li class='paginate_button'><a href='javascript:void(0)'>上一页</a></li>");
				reStr.append("<li><span>"+intPageNo+"/"+totalPages+"</span></li>");
				reStr.append(getUrl(intPageNo + 1, "next"));
				reStr.append(getUrl(totalPages, "end"));
			} else if (intPageNo == totalPages) {
				reStr.append(getUrl(1, "ini"));
				reStr.append(getUrl(intPageNo - 1, "pre"));
				reStr.append("<li><span>"+intPageNo+"/"+totalPages+"</span></li>");
				reStr.append("<li class='paginate_button'><a href='javascript:void(0)'>下一页</a></li>");
				reStr.append("<li class='paginate_button'><a href='javascript:void(0)'>尾页</a></li>");
			} else {
				reStr.append(getUrl(1, "ini"));
				reStr.append(getUrl(intPageNo - 1, "pre"));
				reStr.append("<li><span>"+intPageNo+"/"+totalPages+"</span></li>");
				reStr.append(getUrl(intPageNo + 1, "next"));
				reStr.append(getUrl(totalPages, "end"));
			}
		}
		reStr.append("</ul>");
		
		reStr.append("<ul class='page_num'>");
		reStr.append("<li><a href='javascript:void(0)' onclick=\"changePageSize(document.getElementById('pageNo').value,document.getElementById('pageSize').value);\" >Go</a></li>");
		reStr.append("<li><span>跳转至</span></li><li><input size='2' name='pageNo' id='pageNo' type='text' /></li>");
		reStr.append("<li><span>页&nbsp;&nbsp;每页</span></li><li><input size='2' name='pageSize' id='pageSize' type='text' value='"+pageSize+"' onblur='changePage(1)'/></li><li><span>条&nbsp;&nbsp;共"+count+"条匹配记录</span></li>");
		reStr.append("</ul");
	
		reStr.append("</form>");
		return reStr.toString();
	}
	
	private static String getUrl(int pageNo, String name) {
		String pageName = "";
		if(name=="ini"){
			pageName = "首页";
		}else if(name=="pre"){
			pageName = "上一页";
		}
		else if(name=="next"){
			pageName = "下一页";
		}else if(name=="end"){
			pageName = "尾页";
		}
		return "<li class='paginate_button'><a href='javascript:changePage("+pageNo+")'>"+pageName+"</a></li>";
	}
}

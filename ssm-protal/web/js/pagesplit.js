function changePageSize(pageNo,pageSize){
	getData(pageNo,pageSize);
}

function changePage(pageNo){
	var pageSize = document.getElementById('pageSize').value;
	getData(pageNo,pageSize);
}
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색창</title>
  <script type="text/javascript">
	function frm_add() {
		var frmPro = document.frm;
		frmPro.method = "post";
		frmPro.action = "${contextPath}/hm/p0003/searchInsert.do"; 
		frmPro.submit();
	}
   </script>
</head>
<body>
 <form name="frm" method="post" action="${contextPath}/hm/p0003/searchList.do">   
	   id:<input type="text" name="cust_id"><br>
	   <input type ="submit"  value="조회하기"><br>
	   <input type = "button" value = "제품추가" onclick = "frm_add()">
   </form>
</body>
</html>
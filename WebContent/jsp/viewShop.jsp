<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/include.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/transitional.dtd">
<html>
<head>
<base href="<%=basePath%>">  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人网</title>
<script type='text/javascript' src="js/jquery.min.js"></script>
 <link href="css/common.css" rel="stylesheet" type="text/css" />
 <link href="css/headerFooter.css" rel="stylesheet" type="text/css" />
 <link href="css/buttons.css" rel="stylesheet" type="text/css" />
<style>
</style>
<script type="text/javascript">	
$(function(){
	$("html, body").scrollTop(0).animate({scrollTop: $("#scroll").offset().top});
})
</script>
</head>
<body>
	<div id="webHeader" style="width:1366px;height:80px">
	<div style="float:left; width:70px;height:20px; padding-top: 20px;padding-left: 20px;">
		<h1 >Personal</h1>
	</div>
	<div style="float:right; width:70px;height:20px; padding-top: 20px;padding-left: 20px;">
	<a  href="login">退出</a>
	</div>
	<div  style="padding-top:63px;">
  		<ul id="menu" class="menu">
  			<c:forEach items="${personMenu}" var="thisMenu">
  				<c:if test="${thisMenu.menuId == '0'}" var="hehe">
  					<li><a class="button button-primary button-rounded button-small" href="<%=basePath%>${thisMenu.menuAddr}">${thisMenu.menuName}</a></li>
  				</c:if>
  			</c:forEach>
  		</ul>
  		</div>
  		
  	</div>
  	<div style="background-color:#cc6600; height:100px;"></div>
		<div id="scroll" style="height:1000px;">
			该配合你演出的我尽力在表演
		</div>
</body>
</html>
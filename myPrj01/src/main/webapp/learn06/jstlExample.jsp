<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	<%--taglib 지시어를 통해서 커스텀태그 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 예제</title>
</head>
<body>
	<h2>JSTL</h2>
	<h3>set,out</h3>
	<c:set var="Product1" value="<h2>애플폰<h2>" />
	<c:set var="Product2" value="삼성갤럭시" />
	<c:set var="intArray" value="${[ 1,2,3,4,5 ]}" />
	<p>
		productI(jstl):
		<c:out value="${Product1}" default="Not registered" escapeXml="true"/>
	</p>
	<p>product1 (e1):${product1 }</p>
	<p>intArray[2]:${intArray[2] }</p>
	<hr>
	<h3>forEach 배열출력</h3>
	<ul>
		<c:forEach var="num" varStatus="i" items="${intArray }">
			<li>${i.count }: ${num }</li>
		</c:forEach>
	</ul>
	<hr>
	<h3>if</h3>
	<c:set var="checkout" value="true" />
	<c:if test="${checkout }">
		<p>주문제품: ${product2 }</p>
	</c:if>
	<c:if test="${!checkout }">
		<p>체크아웃 상태가 아님</p>
	</c:if>
	<h3>choose, when, otherwise</h3>
	<c:choose>
		<c:when test="${checkout }">
			<p>주문제품: ${product2 }</p>
			</c:when>
		<c:otherwise>
			<p>체크아웃 상태가 아님</p>
		</c:otherwise>
	</c:choose>
</body>
</html>
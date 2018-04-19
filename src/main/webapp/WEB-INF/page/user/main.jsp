<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>User main page</title>
	</head>
	<body>
	
		<form action="MainServlet" method="get" >
			<input type="hidden" name="action" value="model_view">						
			<input type="submit" value="model">													
		</form>
		
		<c:out value="${msg_success}"/>
		<c:forEach var="val" items="${carlist}">
			${val.getModel()} ${val.getBrand()}<br>
			<input type="hidden" name="car_id" value="${val.getId()}"> 
			<input type="hidden" name="car_model" value="${val.getModel()}">
			<input type="hidden" name="car_brand" value="${val.getBrand()}">
			<input type="hidden" name="car_order_start_date" value="${val.getStartDate()}">
			<input type="hidden" name="car_order_end_date" value="${val.getEndDate()}">
			status: ${val.getStatus()}<br>
			start: ${val.getStartDate()}<br>
			end: ${val.getEndDate()}<br>
			Order:<br>
			<form action="MainServlet" method="get" >
				start order
				<input type="date" name="start_date" required>
				end order				
				<input type="date" name="end_date" required>				
				
				<input type="hidden" name="action" value="car_order">						
				<input type="submit" value="order">													
			</form>					
		</c:forEach>
	</body>
</html>
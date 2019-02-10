<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<html>
    <head>
    </head>
    <body>
	    <c:choose>
	    	<c:when test="${isCustomerFound=='true'}">
		      	<table>  
			        <tr>
			            <td><b>Customer classification :</b></td>
			            <td>${cr1.customerClassification}</td>
			        </tr>   
			        <tr>    
			            <td><b>Current balance :</b></td>
			            <td>${cr1.balance}</td>           
			        </tr>
		      	</table>  
				</br>
				<table border="1">
		        	<tr>
		        		<th>Transaction description</th>
		        		<th>Amount</th>
		        		<th>Timestamp</th>
		        	</tr>
			        <c:forEach items="${cr1.transactions}" var="transaction" varStatus="loopStatus">
			        	<tr> 
			         		<td><c:out value="${transaction.description}" /></td>
			         		<td><c:out value="${transaction.amount}" /></td>
			         		<td><c:out value="${transaction.timestamp}" /></td>
			         	</tr> 	
			        </c:forEach>     	
		    	</table>
			</c:when>    
	    	<c:otherwise>	
	    		<b>Customer with 'ID: ${crForm.customerId}' could not be found.</b>
	    	</c:otherwise>
		</c:choose>
    </body>
</html>
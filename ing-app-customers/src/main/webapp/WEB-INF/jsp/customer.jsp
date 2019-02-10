<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
		<form:form method="POST" action="/customer" modelAttribute="crForm">
             <table>
                <tr>
                    <td><form:label path="customerId">Customer ID: </form:label></td>
                    <td><form:input path="customerId"/></td>
                </tr>
                <tr>
                    <td><form:label path="monthDate">Date: </form:label></td>
                    <td><form:input path="monthDate" type="month"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
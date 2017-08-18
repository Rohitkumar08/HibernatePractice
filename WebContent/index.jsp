<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://struts.apache.org/tags-html" prefix ="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>REGISTRATION FORM</h2>
 <html:form action="/register" >
       Name :<html:text  property="name" /><html:errors property="name"/><br>
        password :<html:password  property="password" /><html:errors property="pwd"/><br>
         Email :<html:text  property="email" /><html:errors property="email"/><br>
        <html:submit value="register" />
    </html:form>

</body>
</html>
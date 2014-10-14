<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h4>Book Info</h4>
    <s:form>
    	<s:textfield name="j1.isbn" label="ISBN" />
   	 	<s:textfield name="j1.title" label="Title" />
   		<s:textfield name="j2.name" label="Author"/>
    	<s:textfield name="j1.publisher" label="Publisher" />
   	 	<s:textfield name="j1.publishdata" label="PublishDate" />
    	<s:textfield name="j1.price" label="Price" />
    </s:form>
    <h4>Author Info</h4>
    <s:form>
    	<s:textfield name="j2.authorid" label="AuthorId" />
    	<s:textfield name="j2.name" label="Name" />
    	<s:textfield name="j2.age" label="Age" />
    	<s:textfield name="j2.country" label="Country" />
    </s:form>
    <a href='<s:url action="10"></s:url>'>Back</a>
</body>
</html>
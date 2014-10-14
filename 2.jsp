<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>result</title>
</head>
<body>
    <h4><s:property value="name"/> 's Work</h4>
    <table cellspacing="0">
        <thead>
            <tr>
                <th>ISBN</th>
                <th>Title</th>
                <th>Author</th>

                <th></th>
            </tr>
        </thead>
        <tbody>
            <s:iterator value="j">
                <tr>
                    <td><s:property value="isbn" /></td>
                    <td>
                    	<a href='<s:url action="8"><s:param name="isbn" value="isbn" /></s:url>'>
                    		<s:property value="title" />
                    	</a>
                    </td>
                    <td><s:property value="name"/></td>
                    <td>
                        <a href='<s:url action="7"><s:param name="isbn" value="isbn" /></s:url>'>
                            Delete
                        </a>
                    </td>
                </tr>
            </s:iterator>
        </tbody>
    </table>
    <a href='<s:url action="10"></s:url>'>Back</a>
</body>
</html>
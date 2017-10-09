<%--
  Created by IntelliJ IDEA.
  User: TDKBG57
  Date: 9/10/2017
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo</title>
</head>
<body>
<h1>Hello</h1>
<%
    String v = "Hello";
    out.println(v);
%>

${param['name']}
${5*8}

</body>
</html>

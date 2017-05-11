<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Creation Inscription</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/style/style.css" rel="stylesheet" type="text/css"/>
</head>
<body>

<%--<jsp:include page="inc/menu.jsp"></jsp:include>--%>
<c:import url="index.jsp"/>
<%
    String attribut = (String) request.getAttribute("message");
    out.println( attribut );
%>

<p class="info"></p>
<p>Nom : <c:out value="${member.nom}" /></p>
<p>Prénom : <c:out value="${member.prenom}" /></p>
<p>Email : <c:out value="${member.email}" /></p>
<p>Date de naissance : <c:out value="${member.dateNaissance}" /></p>
<p>Téléphone : <c:out value="${member.telephone}" /></p>
<p>Sexe : <c:out value="${member.sexe}" /></p>
<p>Password : <c:out value="${member.password}" /></p>
<p>Pays : <c:out value="${member.pays}" /></p>
</body>
</html>
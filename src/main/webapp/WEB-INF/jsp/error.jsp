<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <link rel="shortcut icon" href="<c:url value="/image/favicon.png"/>" />
    <link rel="stylesheet" href="<c:url value="/css/styles.css"/>"/>
    <title>
        <c:out value="${sessionScope.properties['error.head']}"/>
    </title>
</head>
<body>
<div id="wrapper">
    <div id="fixed">
        <p>
        <form>
            <jsp:include page="extensions/language.jsp"/>
        </form>
    </div>
    <div id="container">
        <h1>
            <c:out value="${sessionScope.properties['error.title']}"/>
        </h1>
        <h3>
            <jsp:include page="extensions/message.jsp"/>
            <c:if test="${empty sessionScope.message}">
                <c:out value="${sessionScope.properties['error.defaultMessage']}"/>
            </c:if>
        </h3>
    </div>
</div>
<jsp:include page="extensions/copyright.jsp"/>
</body>
</html>
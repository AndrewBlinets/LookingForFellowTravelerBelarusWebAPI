<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="home" value="${pageContext.request.contextPath}/" scope="application"/>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><tiles:insertAttribute name="title"/></title>
    <link rel="stylesheet" href="<c:url value="/resources/css/main/main.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/font-awesome/css/font-awesome.min.css"/>">
    <script src="<c:url value="/resources/javascript/jquery-3.1.1.min.js" />"></script>
</head>
<body>
<div id="body">
    <div id="header">
        <div id="logo"></div>
        <div id="nav">
            <tiles:insertAttribute name="menu"/>
        </div>
    </div>
    <div id="leftblock" style=" width: 100px; background-color: #0e5279">
    </div>
    <div id="content">
        <tiles:insertAttribute name="content"/>
    </div>
</div>
</body>
</html>

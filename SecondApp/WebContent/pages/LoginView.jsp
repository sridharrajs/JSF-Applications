<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
  <f:loadBundle basename="starter.messages" var="msg" />
  <h:form>
  <h:panelGrid columns="2" >
  <h:outputLabel value="#{msg.user}" ></h:outputLabel>
  <h:inputText tabindex="1" value="#{user.name}">
  <f:validator validatorId="LoginValidator"/>
  </h:inputText>
  <h:outputText value="#{msg.password}"> </h:outputText>
  <h:inputSecret tabindex="2" value="#{user.password}"></h:inputSecret>
  </h:panelGrid>
  <h:commandButton action="#{user.login}" value="#{msg.login}"></h:commandButton>
    <h:messages layout="table"></h:messages>
  </h:form>
</f:view>
</body>
</html>
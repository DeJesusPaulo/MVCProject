<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="respuesta" modelAttribute="usuario1">

Nombre:<form:input path="name"/> <form:errors path="name" style="color:red"/>
<br/><br/>
Apellido:<form:input path="surname"/>  <form:errors path="surname" style="color:red"/>
<br/><br/>
Edad:<form:input path="age"/> <form:errors path="age" style="color:red"/>
<br/><br/>
E-mail:<form:input path="email"/> <form:errors path="email" style="color:red"/>
<br/><br/>
Codigo postal:<form:input path="postalcode"/> <form:errors path="postalcode" style="color:red"/>
<br/><br/>
Categoria:<form:select path="category">


	<form:option value="Junior" label="Junior"/>
	<form:option value="SemiSr" label="SemiSr"/>
	<form:option value="Senior" label="Senior"/>

</form:select>
<br/><br/>
Jornada:

	Mañana<form:radiobutton path="workingDay" value="Mañana"/>
	Tarde<form:radiobutton path="workingDay" value="Tarde"/>
	Noche<form:radiobutton path="workingDay" value="Noche"/>
	
	
<br/><br/>


<input type="Submit" value="Enviar">



</form:form>


</body>
</html>
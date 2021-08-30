<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Regritro</title>
</head>
<body>

El usuario <strong> ${usuario1.name} ${usuario1.surname}</strong>, se ha registrado con exito!!
<br>
Edad:<strong>${usuario1.age}</strong>
<br>
E-mail:<strong>${usuario1.email}</strong>
<br>
Codigo Postal:<strong>${usuario1.postalcode}</strong>
<br>
Categoria: ${usuario1.category}
<br>
Jornada: ${usuario1.workingDay}
</body>
</html>
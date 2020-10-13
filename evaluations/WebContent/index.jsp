<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Générale</title>
</head>
<body>
<form action="ParametreServ" method="post">
Nom:<input type="text" required name="nom"><br>
Prenom:<input type="text" required name="prenom"><br>
Age:<input type="number" min="1" required name="age"><br>
<input type="submit" value="envoyer"><br>
<a href="poids.jsp">Evaluer poid</a>

<a href="rythme.jsp">Evaluer le rythme cardiaque</a>
<a href="course.jsp">Evaluer la vitesse</a>

</form>

</body>
</html>
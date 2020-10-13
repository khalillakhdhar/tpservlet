<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PGCD/PPCM</title>
</head>
<body>
<form action="Calculeserv" method="post">
<h2>PGCD</h2><br>

Valeur1:<input type="number" required name="v1"><br>
Valeur2:<input type="number" required name="v2"><br>
<input type="submit" value="envoyer">
</form>
<form action="Calculeserv" method="get">
<h2>PPCM</h2><br>
Valeur1:<input type="number" required name="v1"><br>
Valeur2:<input type="number" required name="v2"><br>
<input type="submit" value="envoyer">
</form>
</body>
</html>
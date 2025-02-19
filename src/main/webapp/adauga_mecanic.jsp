<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!doctype html>
<html lang="en">

<head>
<title>Mecanic</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="stilpiesa.css">
<script src="https://kit.fontawesome.com/332a215f17.js"
	crossorigin="anonymous"></script>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="stil.css">
<script src="https://kit.fontawesome.com/332a215f17.js"
	crossorigin="anonymous"></script>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="style.css">
<script src="https://kit.fontawesome.com/332a215f17.js"
	crossorigin="anonymous"></script>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link
	href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap"
	rel="stylesheet">
</head>

<body>
	<nav class="navbar navbar-expand-lg nav-back fixed-top" id="mainNav">
		<div class="container">
			<a class="navbar-brand" href="#">Auto OSV</a>
			<button class="navbar-toggler navbar-toggler-right" type="button"
				data-toggle="collapse" data-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false"
				aria-label="Toggle navigation">
				<i class="fas fa-syringe fa-2x"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="index.jsp">Acasa</a></li>
					<li class="nav-item  mecanici-nav"><a class="nav-link"
						href="afiseaza_mecanic.jsp">Mecanic</a>
						<ul class="dropdown-content">
						
						</ul></li>
					<li class="nav-item mecanici-nav"><a class="nav-link"
						href="afiseaza_piesa.jsp">Piesa</a>
						<ul class="dropdown-content">
							
						</ul></li>
					<li class="nav-item mecanici-nav"><a class="nav-link"
						href="afiseaza_client.jsp">Client</a>
						<ul class="dropdown-content">
							
						</ul></li>
					<li class="nav-item"><a class="nav-link" href="login.jsp">Login</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div id="container">
		<header>Mecanic</header>
		 <br/><br/><br/><br/>
		<form action="adaugaMecanic.jsp" method="post">
			<fieldset>
				<input type="text" name="Nume" id="Nume" placeholder="Nume" required>
				<br />
				<br /> <input type="text" name="Prenume" id="Prenume"
					placeholder="Prenume" required> <br />
				<br /> <input type="text" name="CNP" id="CNP" placeholder="CNP"
					required> <br /> <br /> <input type="text"
					name="Adresa"  id="Adresa" placeholder="Adresa"
					required> <br /> <br /><input type="text"
					name=" Nr_Tel"  id="Nr_Tel" placeholder="Nr_Tel"
					required> <br /> <br /> <label for="submit"></label> <br>
				<input type="submit" name="submit" id="submit"
					value="Adauga Mecanic">

			</fieldset>
		</form>
	</div>
</body>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!doctype html>
<html lang="en">

<head>
<title>Client</title>
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
						href="mecanic.jsp">Mecanic</a>
						<ul class="dropdown-content">
							
						</ul></li>
					<li class="nav-item mecanici-nav"><a class="nav-link"
						href="piesa.jsp">Piesa</a>
						<ul class="dropdown-content">
							
						</ul></li>
					<li class="nav-item mecanici-nav"><a class="nav-link"
						href="client.jsp">Client</a>
						<ul class="dropdown-content">
							
						</ul></li>
					<li class="nav-item"><a class="nav-link" href="login.jsp">Login</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container">
		<div class="table-responsive">
			<table class="table table-bordered   table-striped"
				style="margin-top: 200px">
				<thead class="table__head">
					<tr class="winner__table">

						<th><i class="fa fa-user" aria-hidden="true"></i> ID</th>
						<th><i class="fa fa-map-user" aria-hidden="true"></i> Nume</th>
						<th><i class="fa fa-map-user" aria-hidden="true"></i> Prenume</th>
						<th><i class="fa fa-map-marker" aria-hidden="true"></i>
							CNP</th>
						<th><i class="fa fa-map-marker" aria-hidden="true"></i>
							Adresa</th>
						<th><i class="fa fa-phone" aria-hidden="true"></i> Nr_Tel</th>
					</tr>
				</thead>
				<tbody>
					<%
					try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiune_auto", "root", "");
						Statement st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT * FROM client");
						while (rs.next()) {
					%>

					<tr>
						<td><%=rs.getInt("ID_CLIENT")%></td>
						<td><%=rs.getString("Nume")%></td>
						<td><%=rs.getString("Prenume")%></td>
						<td><%=rs.getString("CNP")%></td>
						<td><%=rs.getString("Adresa")%></td>
						<td><%=rs.getString("Nr_Tel")%></td>


					</tr>


					<%
					}
					} catch (Exception e) {
					out.println(e);
					}
					%>

				</tbody>
			</table>
		</div>
	</div>
</body>
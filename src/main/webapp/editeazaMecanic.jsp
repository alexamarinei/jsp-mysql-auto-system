<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%
String nume = request.getParameter("Nume");
String prenume = request.getParameter("Prenume");
String cnp = request.getParameter("CNP");
String adresa = request.getParameter("Adresa");
String nr_tel = request.getParameter("Nr_Tel");
String id_mecanic= request.getParameter("id_mecanic");


try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiune_auto","root","");
    PreparedStatement ps=conn.prepareStatement("UPDATE Mecanic SET Nume = ?,Prenume =?,CNP=? ,Adresa = ? ,Nr_tel = ?   WHERE id_mecanic = ?");
    ps.setString(1, nume);
	ps.setString(2, prenume);
	ps.setString(3, cnp);
	ps.setString(4, adresa);
	ps.setString(5, nr_tel);
    ps.setString(6, id_mecanic);
    int x=ps.executeUpdate();
    if(x>0){
        out.println("Complete");
    }else{
        out.println("failed");
    }
}catch(Exception e){
    out.println(e);
}
 %>
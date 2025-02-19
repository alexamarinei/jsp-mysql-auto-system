<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%
String cantitate = request.getParameter("Cantitate");
String denumire = request.getParameter("Denumire");
String pret = request.getParameter("Pret");
String gramaj = request.getParameter("Gramaj");
String id_piesa= request.getParameter("id_piesa");


try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiune_auto","root","");
    PreparedStatement ps=conn.prepareStatement("UPDATE piesa SET Cantitate = ?,Denumire =?,Pret=? ,Gramaj = ?    WHERE id_piesa = ?");
    ps.setString(1, cantitate);
	ps.setString(2, denumire);
	ps.setString(3, pret);
	ps.setString(4, gramaj);
	ps.setString(5, id_piesa);
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
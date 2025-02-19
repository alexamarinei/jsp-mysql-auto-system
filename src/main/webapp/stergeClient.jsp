<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%
String id_client=request.getParameter("id_client");



try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestiune_auto","root","");
    PreparedStatement ps=conn.prepareStatement("DELETE FROM Client  WHERE id_client= ?");
    ps.setString(1,id_client);
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
package puntoventa;
import java.sql.*;

public class DB_connection{
    Connection con0=null;
    Statement st0;
    ResultSet rsDatos;
    PreparedStatement psSentenciasPreparadas;
    
    public DB_connection() throws ClassNotFoundException, SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/rapiditoDB";
            con0=DriverManager.getConnection(url,"root","rapidito");
            st0=con0.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        }catch(ClassCastException | SQLException ex){
            System.out.println("changos!");
            throw ex;
        }
    }
    public ResultSet consulta(String sql) throws SQLException{
        System.out.println("exe read: "+sql);
        try{
            return st0.executeQuery(sql);
        }catch(SQLException ex){
            throw ex;
        }
    }
    public boolean consultaModif(String sql) throws SQLException{
        System.out.println("exe write: "+sql);
        try{
            return st0.execute(sql);
        }catch(SQLException ex){
            throw ex;
        }
    }
}

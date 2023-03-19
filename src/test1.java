import Conexion.ConexionOracle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test1 {
    
    public static void main(String[] args){
        
        String sSQL = "";
        ConexionOracle conexion = new ConexionOracle();
        
    }try{
    sSQL = "SELECT * FROM CLIENTES";
    Connection con = conexion.conectar();
    Statement cn = con.createStatement();
    ResultSet res = cn.executeQuery(sSQL);
    
    while (res.next()){
        System.out.println("-----------------");
        System.out.println(res.getInt("IDCLIENTE"));
        System.out.println(res.getString("NOMBRE"));
        System.out.println(res.getString("APELLIDO"));
    }
    
}catch (SQLException e){
    System.out.println(e);
}
    
}

IDCLIENTE
NOMBRE
APELLIDO
TELEFONO
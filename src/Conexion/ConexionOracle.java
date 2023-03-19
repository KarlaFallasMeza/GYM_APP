package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionOracle {

    private final String Driver = "oracle.jdbc.driver.OracleDriver"; //ERROR
    private final String URL = "jdbc:oracle:thin:@//localhost:1521/orcl";
    private final String USER = "GYM";
    private final String PW = "123";
    public Connection cadena;

    public ConexionOracle() {
        this.cadena = null;
    }

    public Connection conectar() {
        try {
            Class.forName(Driver);
            this.cadena = DriverManager.getConnection(URL, USER, PW);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.cadena;
    }

    public void desconectar() {
        try {
            this.cadena.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

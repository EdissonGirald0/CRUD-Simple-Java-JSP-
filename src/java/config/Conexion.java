package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    public Connection getConexion() {
        String url = "jdbc:mysql://localhost:3306/almacen";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "Tirolo.6");
            System.out.println("Conexion Establecida");
            return conexion;
        } catch (SQLException e) {
            System.out.println(e + " ERROR ENCONTRADO");
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}

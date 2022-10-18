package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductosDAO {

    Connection conexion;

    public ProductosDAO() {
        Conexion conn = new Conexion();
        conexion = conn.getConexion();
    }

    public List<Productos> listarProductos() {
        PreparedStatement ps;
        ResultSet rs;

        List<Productos> lista = new ArrayList<>();
        try {
            ps = conexion.prepareStatement("SELECT id, codigo, nombre, precio, existencia FROM productos");
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                Double precio = rs.getDouble("precio");
                int existencia = rs.getInt("existencia");

                Productos producto = new Productos(id, codigo, nombre, precio, existencia);
                lista.add(producto);

            }
            System.out.println("se cargo informacion correctamente");
            return lista;
        } catch (SQLException e) {
            System.out.println(e.toString() + " ERRROR");
            return null;
        }
    }
    public Productos mostrarProductos(int _id) {
        PreparedStatement ps;
        ResultSet rs;

        Productos producto = null;
        try {
            ps = conexion.prepareStatement("SELECT id, codigo, nombre, precio, existencia FROM productos WHERE id=?");
            ps.setInt(1, _id);
            rs = ps.executeQuery();
            System.out.println("se cargo informacion correctamente");
            while (rs.next()) {
                int id = rs.getInt("id");
                String codigo = rs.getString("codigo");
                String nombre = rs.getString("nombre");
                Double precio = rs.getDouble("precio");
                int existencia = rs.getInt("existencia");

                producto = new Productos(id, codigo, nombre, precio, existencia);
               

            }
            return producto;
        } catch (SQLException e) {
            System.out.println(e.toString() + " ERRROR");
            return null;
        }
    }
    public boolean insertar(Productos producto) {
        PreparedStatement ps;
        
        try {
            ps = conexion.prepareStatement("insert into productos (codigo, nombre, precio, existencia )VALUES (?,?,?,?)");
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getExistencia());
            ps.execute();
            System.out.println("se inserto producto satifactoriamente ");
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString() + " ERRROR");
            return false;
        }
    }
    public boolean actualizar (Productos producto) {
        PreparedStatement ps;
        
        try {
            ps = conexion.prepareStatement("UPDATE productos SET codigo=?, nombre=?, precio=?, existencia=? WHERE id=?");
            ps.setString(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getExistencia());
            ps.setInt(5, producto.getId());
           
            ps.execute();
            System.out.println("Se actualizo producto satifactoriamente ");
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString() + " ERRROR");
            return false;
        }
    }
    public boolean eliminar (int _id) {
        PreparedStatement ps;
        
        try {
            ps = conexion.prepareStatement("DELETE FROM productos WHERE id=?");
            ps.setInt(1, _id);
            ps.execute();
            System.out.println("Se Elimino producto satifactoriamente ");
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString() + " ERRROR");
            return false;
        }
    }
}

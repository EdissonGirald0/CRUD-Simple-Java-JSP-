
package modelo;

public class Productos {
    private int id, existencia;
    private String codigo, nombre;
    private Double precio;

    public Productos(int id, String codigo, String nombre, Double precio, int existencia) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public int getExistencia() {
        return existencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }
    
}

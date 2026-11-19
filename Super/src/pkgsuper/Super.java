/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgsuper;

/**
 *
 * @author mevad
 */
public class Super {

    public int id;
    private String nombre;
    private String codigo;
    private String[] producto;

    public Super(String nombre, String codigo, String[] producto) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.producto = producto;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String[] getProducto() {
        return producto;
    }

    public void setProducto(String[] producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Super{" + "nombre=" + nombre + ", codigo=" + codigo + ", producto=" + producto + '}';
    }

}

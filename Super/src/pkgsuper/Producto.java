/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgsuper;

/**
 *
 * @author mevad
 */
public class Producto {

    private String nombre;
    private String codigoProducto;
    private String empleado;
    private String cedula;
    private String cantidadProducto;
    public String tipo;  //Alimentos, bebidas,Higiene y limpieza
    private String precioBase;

    public Producto(String nombre, String codigoProducto, String empleado, String cedula, String cantidadProducto, String tipo, String precioBase) {
        this.nombre = nombre;
        this.codigoProducto = codigoProducto;
        this.empleado = empleado;
        this.cedula = cedula;
        this.cantidadProducto = cantidadProducto;
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(String cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(String precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigoProducto=" + codigoProducto + ", empleado=" + empleado + ", cedula=" + cedula + ", cantidadProducto=" + cantidadProducto + ", tipo=" + tipo + ", precioBase=" + precioBase + '}';
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgsuper;

import javax.swing.JOptionPane;

/**
 *
 * @author mevad
 */
  

    public class Main {

        public static void main(String[] args) {
            Super datos[] = new Super[2];
            llenaSuper(datos);
            imprimeSuper(datos);

        }

        public static void llenaSuper(Super datos[]) {
            for (int i = 0; i < datos.length; i++) {
                String nombre = JOptionPane.showInputDialog("Escribe el nombre del super " + (i + 1));
                String codigo = JOptionPane.showInputDialog("Escribe el codigo de la bebida " + (i + 1));
                datos[i] = new Super(nombre, codigo, null);
            }
        }

        public static void imprimeSuper(Super datos[]) {
            String resultado = "";
            for (int i = 0; i < datos.length; i++) {
                resultado += datos[i].toString() + "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);

        }
    }

    public static void main(String[] args) {
        Producto datos[] = new Producto[3];
        llenaProducto(datos);
        imprimeProducto(datos);
        analizaAlimento(datos);
    }

    public static void llenaProducto(Producto datos[]) {
        for (int i = 0; i < datos.length; i++) {
            String nombre = JOptionPane.showInputDialog("Escribe el nombre del producto " + (i + 1));
            String codigoProducto = JOptionPane.showInputDialog("Escribe el codigo de la producto " + (i + 1));
            String empleado = JOptionPane.showInputDialog("Escribe el nombre del empleado que agrego el producto " + (i + 1));
            String cedula = JOptionPane.showInputDialog("Escribe la cedula del empleador que agrego el producto " + (i + 1));
            String cantidadProducto = JOptionPane.showInputDialog("Ingrese la cantidad de productos " + (i + 1));
            String precioBase = JOptionPane.showInputDialog("Ingretipo de producto (Alimentos, bebidas,Higiene y limpieza)" + (i + 1));
            datos[i] = new Producto(nombre, codigoProducto, empleado, cedula, cantidadProducto, precioBase, null);
        }
    }

    public static void imprimeProducto(Producto datos[]) {
        String resultado = "";
        for (int i = 0; i < datos.length; i++) {
            resultado += datos[i].toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);

    }

    public static void analizaAlimento(Producto datos[]) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i].tipo.equals("Alimento")) {
                datos[i] = precioBase datos; =  * 0.2 + precioBase;
                JOptionPane.showMessageDialog(null, "El precio de alimento es " + datos.toString());

            }
        }
    }

    public static void analizaBebida(Producto datos[]) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i].tipo.equals("Bebida")) {
                datos[i].getPrecioBase()precioBase datos[i] =  * 0.3 + precioBase;
                JOptionPane.showMessageDialog(null, "El precio de bebida es " + datos.toString());
            }
        }
    }

    public static void analizaHigiene(Producto datos[]) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i].tipo.equals("Higiene")) {
                datos[i] = precioBase datos[i] =  * 0.25 + precioBase + 500;
                JOptionPane.showMessageDialog(null, "El precio de el producto de higiene es " + datos.toString());

            }

        }
    }

    public static void analizaLimpieza(Producto datos[]) {
        for (int i = 0; i < datos.length; i++) {
            if (datos[i].tipo.equals("Limpieza")) {
                datos[i] = precioBase datos[i] =  * 0.19 + precioBase * 0.04 + 1000;
                JOptionPane.showMessageDialog(null, "El precio de el producto de limpieza es " + datos.toString());
            }
        }
    
}

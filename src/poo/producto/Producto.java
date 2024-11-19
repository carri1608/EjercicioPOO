package poo.producto;

public class Producto {

    /*
    * Diseñar una clase Producto con atributos (nombre, precio, cantidad) y métodos (calcularTotal).
    Crear varios objetos Producto y calcular el precio total de un carrito de compras.
    * */

    //Definimos los atributos
    String nombre;
    double precio;
    int cantidad;

    //Hacemos el método para calcular tota
    public double calcularTotal() {

        return this.precio*this.cantidad;
    }

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}

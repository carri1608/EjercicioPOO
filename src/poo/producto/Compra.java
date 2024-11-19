package poo.producto;

public class Compra {

    public static void main(String[] args) {


        Producto naranja = new Producto("naranja",1.2,5);
        Producto peras = new Producto("peras",1.2,5);
        Producto sandias = new Producto("sandias",2,2);


        double carritoCompra = naranja.calcularTotal()+peras.calcularTotal()+sandias.calcularTotal();


        System.out.println(carritoCompra);

    }

}

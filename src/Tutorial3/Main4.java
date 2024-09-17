package Tutorial3;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        // Crear un ArrayList que almacene objetos de tipo Producto
        ArrayList<Producto> productos = new ArrayList<>();

        // Agregar al menos tres productos a la lista
        productos.add(new Producto("Laptop", 999.99));
        productos.add(new Producto("Mouse", 25.50));
        productos.add(new Producto("Teclado", 45.75));

        // Recorrer el ArrayList y mostrar el nombre y el precio de cada producto
        System.out.println("Lista de productos:");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }

        // Calcular el costo total de todos los productos en la lista
        double costoTotal = 0.0;
        for (Producto producto : productos) {
            costoTotal += producto.precio;
            System.out.println("Costo total de todos los productos: $" + costoTotal);
        }
    }

}


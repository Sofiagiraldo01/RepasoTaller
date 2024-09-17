package Tutorial3;

public class Producto {
    String nombre;
    double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para mostrar información del producto
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Precio: $" + precio);
    }
}


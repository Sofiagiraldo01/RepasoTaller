package Tutorial1;

public class LibroMain {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes");
        Libro libro2 = new Libro("Libro sin Autor");
        Libro libro3 = new Libro();

        // Mostrar información de los libros
        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();
    }
}



package Tutorial4;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> libros;

    // Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para imprimir la lista de títulos de libros
    public void imprimirListaDeTitulos() {
        System.out.println("Lista de títulos de libros:");
        for (Libro libro : libros) {
            System.out.println(libro.titulo);
        }
    }
}


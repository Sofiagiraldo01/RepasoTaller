package Tutorial4;

public class Libro {
    String titulo;
    String autor;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Método para mostrar información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }

}

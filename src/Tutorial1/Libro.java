package Tutorial1;

public class Libro {
    String titulo;
    String autor;
    int paginas;

    // Constructor 1: acepta título y autor, asigna valor por defecto a páginas
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 100; // Valor por defecto
    }

    // Constructor 2: acepta solo título, asigna valores por defecto a autor y páginas
    public Libro(String titulo) {
        this.titulo = titulo;
        this.autor = "Anónimo"; // Valor por defecto
        this.paginas = 100; // Valor por defecto
    }

    // Constructor 3: Constructor por defecto con valores genéricos para todos los atributos
    public Libro() {
        this.titulo = "Desconocido"; // Valor genérico
        this.autor = "Desconocido";  // Valor genérico
        this.paginas = 100; // Valor genérico
    }

    // Método para mostrar información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginas);
    }
}

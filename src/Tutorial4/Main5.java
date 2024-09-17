package Tutorial4;

public class Main5 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Agregar varios libros a la biblioteca
        biblioteca.agregarLibro(new Libro("1984", "George Orwell"));
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez"));
        biblioteca.agregarLibro(new Libro("Matar a un ruiseñor", "Harper Lee"));

        // Imprimir la lista de títulos de libros
        biblioteca.imprimirListaDeTitulos();

        // Crear una instancia de Departamento
        Departamento departamento = new Departamento();

        // Agregar varios profesores al departamento
        departamento.agregarProfesor(new Profesor("Dr. Juan Pérez", "Matemáticas"));
        departamento.agregarProfesor(new Profesor("Dra. María López", "Literatura"));
        departamento.agregarProfesor(new Profesor("Dr. Carlos Gómez", "Física"));

        // Imprimir la lista de todos los profesores
        departamento.imprimirListaDeProfesores();
    }

    }


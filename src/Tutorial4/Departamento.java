package Tutorial4;

import java.util.ArrayList;

public class Departamento {
    ArrayList<Profesor> profesores;

    // Constructor
    public Departamento() {
        profesores = new ArrayList<>();
    }

    // Método para agregar un profesor al departamento
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    // Método para imprimir la lista de todos los profesores
    public void imprimirListaDeProfesores() {
        System.out.println("Lista de profesores:");
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }

}

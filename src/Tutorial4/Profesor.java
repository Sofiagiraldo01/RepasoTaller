package Tutorial4;

public class Profesor {
    String nombre;
    String especialidad;

    // Constructor
    public Profesor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Método para mostrar información del profesor
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Especialidad: " + especialidad);
    }
}


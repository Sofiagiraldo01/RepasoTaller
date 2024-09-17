package Tutorial2;

public class Empleado {
    String nombre;
    double salario;

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método que imprime que el empleado está trabajando
    public void trabajar() {
        System.out.println("Empleado está trabajando");
    }
}


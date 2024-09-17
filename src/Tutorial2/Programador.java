package Tutorial2;

public class Programador extends Empleado {
    String lenguaje;

    // Constructor
    public Programador(String nombre, double salario, String lenguaje) {
        super(nombre, salario); // Llama al constructor de la clase base
        this.lenguaje = lenguaje;
    }

    // Sobrescribe el método trabajar
    @Override
    public void trabajar() {
        System.out.println("Programador está programando en " + lenguaje);
    }
}


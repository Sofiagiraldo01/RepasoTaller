package Tutorial2;

public class Gerente extends Empleado {
    public Gerente(String nombre, double salario) {
        super(nombre, salario); // Llama al constructor de la clase base
    }

    // Sobrescribe el método trabajar
    @Override
    public void trabajar() {
        System.out.println("Gerente está gestionando al equipo");
    }
}


package Tutorial2;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        // Añadir diferentes tipos de empleados a la lista
        empleados.add(new Programador("Alice", 50000, "Java"));
        empleados.add(new Gerente("Bob", 70000));
        empleados.add(new Programador("Charlie", 60000, "Python"));
        empleados.add(new Gerente("Diana", 75000));

        // Llamar al método trabajar() en cada empleado
        for (Empleado empleado : empleados) {
            empleado.trabajar();
        }
    }
}



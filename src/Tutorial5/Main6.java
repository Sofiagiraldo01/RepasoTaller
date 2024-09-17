package Tutorial5;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca su nombre completo
        System.out.print("Introduce tu nombre completo (nombre y apellidos): ");
        String nombreCompleto = scanner.nextLine();

        // Utilizar la clase NombreFormatter para formatear el nombre
        String nombreFormateado = NombreFormatter.formatearNombre(nombreCompleto);

        // Mostrar el nombre formateado
        System.out.println("Nombre formateado: " + nombreFormateado);

        // Cerrar el scanner
        scanner.close();


    }
}

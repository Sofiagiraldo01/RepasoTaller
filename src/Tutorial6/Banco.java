package Tutorial6;

public class Banco {
    private static int totalClientes = 0;

    // Método estático para obtener el número total de clientes
    public static int obtenerTotalClientes() {
        return totalClientes;
    }

    // Método estático para mostrar el número total de clientes
    public static void mostrarTotalClientes() {
        System.out.println("Número total de clientes: " + totalClientes);
    }

    // Método estático para incrementar el número total de clientes
    public static void incrementarTotalClientes() {
        totalClientes++;
    }
}

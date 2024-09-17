package Tutorial6;

public class Cliente {
    private String nombre;

    // Constructor que inicializa el nombre y actualiza el contador de clientes
    public Cliente(String nombre) {
        this.nombre = nombre;
        Banco.incrementarTotalClientes();
    }

    // Método para obtener el nombre del cliente
    public String getNombre() {
        return nombre;
    }
}


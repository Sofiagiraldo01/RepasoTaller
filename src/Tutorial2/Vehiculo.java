package Tutorial2;

public class Vehiculo {
    int velocidad;

    // Constructor para inicializar la velocidad
    public Vehiculo() {
        this.velocidad = 0; // Inicializa velocidad a 0
    }

    // Método para acelerar el vehículo
    public void acelerar(int incremento) {
        velocidad += incremento; // Incrementa la velocidad
        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }
}


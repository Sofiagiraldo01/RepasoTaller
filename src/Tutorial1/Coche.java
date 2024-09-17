package Tutorial1;

public class Coche {
    public Coche(String toyota, String corollla) {
    }

    public void mostrarInfo() {
    }

    class coche {
        String marca;
        String modelo;

        // Constructor que recibe dos parámetros
        public coche(String marca, String modelo) {
            this.marca = marca;    // Asigna el valor del parámetro marca a la variable de instancia
            this.modelo = modelo;  // Asigna el valor del parámetro modelo a la variable de instancia
        }

        // Método para mostrar la información del coche
        public void mostrarInfo() {
            System.out.println("Marca: " + marca + ", Modelo: " + modelo);
        }
    }
}

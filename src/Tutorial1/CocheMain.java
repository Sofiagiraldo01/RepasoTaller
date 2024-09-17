package Tutorial1;

public class CocheMain {
    public static void main(String[] args) {
        // Crear una instancia de la clase Coche
        Coche coche1 = new Coche("Toyota" , "corollla");
        Coche coche2 = new Coche("Ford", "Mustang");

        // Mostrar la información de los coches
        coche1.mostrarInfo();
        coche2.mostrarInfo();
    }
}


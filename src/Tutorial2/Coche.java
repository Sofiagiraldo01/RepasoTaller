package Tutorial2;

public class Coche extends Vehiculo {

    @Override
    public void acelerar(int incremento) {
        super.acelerar(incremento); // Llama al método de la clase base para actualizar la velocidad
        System.out.println("El coche está acelerando rápidamente");
    }

        // Método para tocar la bocina
        public void tocarBocina() {
            System.out.println("¡Beep beep! ¡Cuidado!");
        }
    }


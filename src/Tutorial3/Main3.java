package Tutorial3;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar 3 números al ArrayList
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Imprimir la lista completa
        System.out.println("Lista original: " + numeros);

        // Agregar un nuevo número al inicio de la lista
        numeros.add(0, 5); // Inserta el número 5 en la posición 0
        System.out.println("Lista después de agregar al inicio: " + numeros);

        // Eliminar el segundo número (posición 1)
        numeros.remove(1);
        System.out.println("Lista después de eliminar el segundo número: " + numeros);

        // Reemplazar el tercer número (posición 2) con otro valor
        numeros.set(2, 100); // Reemplaza el valor en la posición 2 con 100
        System.out.println("Lista después de reemplazar el tercer número: " + numeros);

        // Imprimir el tamaño actual del ArrayList
        System.out.println("Tamaño actual del ArrayList: " + numeros.size());
    }
}




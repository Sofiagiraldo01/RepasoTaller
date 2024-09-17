package Tutorial5;

public class NombreFormatter {
    public static String formatearNombre(String nombreCompleto) {
        // Dividir el nombre completo en partes (palabras)
        String[] partes = nombreCompleto.split(" ");

        // Asegurarse de que haya al menos un nombre y un apellido
        if (partes.length < 2) {
            return "Por favor, introduce al menos un nombre y un apellido.";
        }

        // Convertir el primer nombre a mayúsculas y los apellidos a minúsculas
        String primerNombre = partes[0].toUpperCase();
        StringBuilder apellidos = new StringBuilder();
        for (int i = 1; i < partes.length; i++) {
            if (i > 1) {
                apellidos.append(" ");
            }
            apellidos.append(partes[i].toLowerCase());
        }

        // Retornar el nombre formateado
        return primerNombre + " " + apellidos.toString();
    }

}

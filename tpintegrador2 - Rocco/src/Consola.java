import java.util.Scanner;

public class Consola {

    public static int pedirEnteroRango(Scanner scanner, int min, int max, String mensaje) {

        boolean valido = false;
        int numero = 0;

        while (!valido) {
            System.out.print(mensaje);
            try {
                numero = Integer.parseInt(scanner.nextLine());
                if (numero < min || numero > max) {
                    System.out.println("Debe ingresar un numero entre " + min + " y " + max);
                } else {
                    valido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Intente nuevamente.");
            }
    }
    return numero;
    }

}
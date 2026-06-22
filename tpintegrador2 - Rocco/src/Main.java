import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n--------MAYOR O MENOR--------");
            System.out.println("1 - Jugar");
            System.out.println("2 - Ver reglas");
            System.out.println("3 - Salir");

            opcion = Consola.pedirEnteroRango(scanner, 1, 3, "Opcion: ");

            switch (opcion) {
                case 1 -> {
                    JuegoMayorMenor juego = new JuegoMayorMenor();
                    juego.iniciarPartida();
                }

                case 2 -> {
                    System.out.println("\nREGLAS:");
                    System.out.println("Se muestra una carta.");
                    System.out.println("Debes adivinar si la siguiente");
                    System.out.println("sera mayor o menor.");
                    System.out.println("Cada acierto suma 1 punto.");
                    System.out.println("Si fallas, termina la partida.");
                    System.out.println("PD: Si empatas, tuviste suerte! Cuenta como acierto");
                }

                case 3 -> System.out.println("Gracias por jugar.");
            }
        } while (opcion != 3);

    }
}
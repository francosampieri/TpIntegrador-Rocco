import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n===== MAYOR O MENOR =====");
            System.out.println("1 - Jugar");
            System.out.println("2 - Ver reglas");
            System.out.println("3 - Salir");
            System.out.print("Opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    JuegoMayorMenor juego = new JuegoMayorMenor();
                    juego.iniciarPartida();

                    break;

                case 2:

                    System.out.println("\nREGLAS:");
                    System.out.println("Se muestra una carta.");
                    System.out.println("Debes adivinar si la siguiente");
                    System.out.println("sera mayor o menor.");
                    System.out.println("Cada acierto suma 1 punto.");
                    System.out.println("Si fallas, termina la partida.");
                    System.out.println("PD: Si empatas, tuviste suerte! Cuenta como acierto");

                    break;

                case 3:

                    System.out.println("Gracias por jugar.");
                    break;

                default:

                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 3);

    }
}
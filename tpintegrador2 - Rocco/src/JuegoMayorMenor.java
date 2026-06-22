import java.util.Scanner;

public class JuegoMayorMenor {

    private Baraja baraja;
    private Jugador jugador;
    private Scanner scanner;

    public JuegoMayorMenor() {
        this.scanner = new Scanner(System.in);
    }

    public void iniciarPartida() {

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        jugador = new Jugador(nombre);

        baraja = new Baraja();
        baraja.barajar();

        Carta cartaActual = baraja.repartirUnaCarta();

        System.out.println("\nComienza la partida!");
        System.out.println("Carta inicial: " + cartaActual);

        while (baraja.cantCartasDisponibles() > 0) {

            System.out.println("\nComo sera la siguiente carta");
            System.out.println("1 - Mayor");
            System.out.println("2 - Menor");

            int opcion;

            do {
                opcion = scanner.nextInt();
            } while (opcion != 1 && opcion != 2);

            Carta siguienteCarta = baraja.repartirUnaCarta();

            System.out.println("Siguiente carta: " + siguienteCarta);

            boolean acerto = false;

            if (opcion == 1) {
                acerto = siguienteCarta.getNumero() >= cartaActual.getNumero();
            }

            if (opcion == 2) {
                acerto = siguienteCarta.getNumero() <= cartaActual.getNumero();
            }

            if (acerto) {
                jugador.sumarPunto();

                System.out.println("Correcto!");
                System.out.println("Puntaje actual: " + jugador.getPuntaje());

                cartaActual = siguienteCarta;
            } else {

                System.out.println("Incorrecto.");
                System.out.println("Fin de la partida.");
                break;
            }
        }

        System.out.println("\n====================");
        System.out.println("Jugador: " + jugador.getNombre());
        System.out.println("Puntaje final: " + jugador.getPuntaje());
        System.out.println("====================");
    }
}
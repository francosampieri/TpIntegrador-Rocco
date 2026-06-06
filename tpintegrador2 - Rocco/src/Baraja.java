import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private List<Carta> cartasDisponibles;
    private List<Carta> cartasRepartidas = new ArrayList<>();
    
    //CONSTRUCTORES
    
    public Baraja() {
        this.cartasDisponibles = generarBaraja();
    }
    
    //GETTERS SETTERS
    
    //METODOS
    
    private ArrayList<Carta> generarBaraja() {
        ArrayList<Carta> cartasGeneradas = new ArrayList<>();
        
        for (Pinta p : Pinta.values()) { //para cada pinta..

            for(int nro = 1 ; nro <= 12 ; nro++) { //para cada numero..
                if (nro != 8 && nro != 9) {
                    cartasGeneradas.add(new Carta(p, nro)); //añadir carta individual
                }
            }
            
        }
        
        return cartasGeneradas;
    }
    
    public void barajar() {
        Collections.shuffle(cartasDisponibles);
    }
    
    public Carta siguienteCartaDisponible() {
        if(this.cartasDisponibles.isEmpty()) {
            System.out.println("No quedan cartas disponibles. Ninguna carta devuelta");
            return null;
        }
        return this.cartasDisponibles.getFirst();
    }
    
    public int cantCartasDisponibles() {
        return this.cartasDisponibles.size();
    }
    
    public Carta repartirUnaCarta() {
        Carta cartaRepartida = siguienteCartaDisponible();
        if(cartaRepartida == null) { return null; }
        cartasDisponibles.removeFirst();
        cartasRepartidas.add(cartaRepartida);
        return cartaRepartida;
    }
    
    public List<Carta> repartirCartas(int cuantas) {
        List<Carta> cartasRepartidas = new ArrayList<>();
        if (cuantas > cantCartasDisponibles()) {
            cuantas = cantCartasDisponibles();
            System.out.println("No hay suficientes cartas disponibles. Solo se repartiran " + cuantas + " cartas");
        }
        for(int i = 1 ; i <= cuantas ; i++) {
           cartasRepartidas.add(repartirUnaCarta());
        }
        
        return cartasRepartidas;
    }
    
    public void printCartasRepartidas() {
            System.out.println("---Cartas Repartidas---");
        for (Carta c : cartasRepartidas) {
            System.out.println(c);
        }
    }
    
    public void printCartasDisponibles() {
            System.out.println("---Cartas Disponibles---");
        for (Carta c : cartasDisponibles) {
            System.out.println(c);
        }
    }
    
}

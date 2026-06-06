public class Carta {
    private Pinta pinta;
    private int numero;
    
    //CONSTRUCTORES
    
    public Carta(Pinta pinta, int numero) {
        setPinta(pinta);
        setNumero(numero);
    }
    
    //GETTERS SETTERS
    
    public void setPinta(Pinta pinta) {
        if (pinta != null) { this.pinta = pinta; }
        else throw new IllegalArgumentException("La pinta de la carta no puede ser nula");
    }
    
    public void setNumero(int numero) {
        if (numero > 0) {
            if (numero <= 12) {
                if (!(numero == 8 || numero == 9)) {
                    this.numero = numero;
                } else throw new IllegalArgumentException("Numero de carta entre 8 y 9");
            } else throw new IllegalArgumentException("Numero de carta mayor a 12");
        } else throw new IllegalArgumentException("Numero de carta menor a 0");
    }
    
    public Pinta getPinta() { return this.pinta; }
    
    public int getNumero() { return this.numero; }
    
    //METODOS

    @Override
    public String toString() {
        return numero + " de " + pinta;
    }  
    
    
    
}

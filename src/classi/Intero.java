
package classi;
import appcalc.Calcolatrice;


/**
 *
 * @author tonin daniel
 */
public class Intero implements Calcolatrice{
    
    protected long intero;
    
    
    public Intero(long intero){
        
        this.intero = intero;
        
    }
    
    
    
    
    //poco funzionale ma potrebbe servire
    
    public Intero(double reale){
        
        this.intero = (long) reale;
        
    }
    
     public Intero(String str){
        
        if (str == null || str.isEmpty()) {
            throw new NumberFormatException("La stringa fornita non è un numero long valido: " + str);
        }
        int startIndex = 0;
        if (str.charAt(0) == '-') {
            if (str.length() == 1) {
                throw new NumberFormatException("La stringa fornita non è un numero long valido: " + str);
            }
            startIndex = 1;
        }
        for (int i = startIndex; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                throw new NumberFormatException("La stringa fornita non è un numero long valido: " + str);
            }
        }
        this.intero = Long.parseLong(str);
        
    }
    
    
    public Intero(){
        
        this.intero = 0;
        
    }
    
    
    
    public Intero(Intero i){
        
        this(i.intero);
        
    }
    
    
    
    public long getIntero(){
        
        return this.intero;
        
    }
    
    
    private Intero compatibile(Calcolatrice val){
        Intero val2;
        // Verifica se l'oggetto specificato è della stessa classe dell'oggetto corrente
        if (val.getClass() == this.getClass()) {
           // Effettua il cast dell'oggetto specificato a Razionale e lo assegna a r2
           val2 = (Intero) val;
        } else {
           // Solleva un'eccezione se l'oggetto specificato non è dello stesso tipo dell'oggetto corrente
           throw new IllegalArgumentException("ERROR: incompatibilità");
       }
       // Restituisce il Razionale convertito
       return val2;
    }
    
    
    public Reale toReale(){
        
        return new Reale(getIntero());
        
    }
    
    
    public Razionale toRazionale(){
        
        return new Razionale(getIntero());
        
    }
    
    
    @Override
    public Intero opposto() {
        
        return new Intero(-getIntero());
        
    }
    
    
    @Override
    public Razionale reciproco() {
        long a = 1;
        return new Razionale(a, getIntero());
    }

    
    

    @Override
    public Intero somma(Calcolatrice val) {
        
        Intero val1 = compatibile(val);
        
        return new Intero( getIntero() + val1.getIntero() );
        
    }

    
    
    
    @Override
    public Intero sottrazione(Calcolatrice val) {
        
        return new Intero(this.somma(val.opposto()));
        
    }

    @Override
    public Intero prodotto(Calcolatrice val) {
        
        Intero val1 = compatibile(val);
        
        return new Intero( getIntero() * val1.getIntero() );
        
    }

    @Override
    public Razionale divisione(Calcolatrice val) {
        
        Intero val1 = compatibile(val);
        
        Razionale a = new Razionale(getIntero());
        
        Razionale b = new Razionale(val1.getIntero());
        
        Razionale risultato = a.divisione(b);
        
        
        return risultato;
        
    }

    @Override
    public Intero potenza(int indice) {
        
        Intero risultato = new Intero();
        
        for(int i = 0 ; i < indice ; i++){
            risultato = risultato.prodotto(this);
        }
        
        return risultato;
        
    }



    @Override
    public Calcolatrice radice(int indice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    @Override
    public String toString() {
        return "" + getIntero();
    }
    
    
    
    
}

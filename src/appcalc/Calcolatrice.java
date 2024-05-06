
package appcalc;

/**
 *  interfaccia
 * @author tonin daniel
 */
public interface Calcolatrice {
    
    
    
    /**
     *  data una coppia di valori,sia Razionali che Interi e Reali ,
     *  calcola la somma
     * @param val
     * @return
     */
    public Calcolatrice somma (Calcolatrice val);
    
    
    
    /**
     *  data una coppia di valori,sia Razionali che Interi e Reali ,
     *  calcola la differenza
     * @param val
     * @return
     */
    public Calcolatrice sottrazione (Calcolatrice val);
    
    
    
    /**
     *  data una coppia di valori,sia Razionali che Interi e Reali ,
     *  calcola il prodotto
     * @param val
     * @return
     */
    public Calcolatrice prodotto (Calcolatrice val);
    
    
    
    /**
     *  data una coppia di valori,sia Razionali che Interi e Reali ,
     *  calcola la divisione
     * @param val
     * @return
     */
    public Calcolatrice divisione (Calcolatrice val);
    
    
    
    /**
     * dato un valore ,sia Razionali che Interi e Reali ,
     * e un indice calcola la potenza
     * @param indice
     * @return
     */
    public Calcolatrice potenza (int indice);
    
    
    
    /**
     *  dato un valore ,sia Razionali che Interi e Reali ,
     *  e un indice calcola la radice
     * @param indice
     * @return
     */
    public Calcolatrice radice (int indice);
    
    
    
    /**
     *  dato un valore ,sia Razionali che Interi e Reali , 
     *  fa il reciproco del suddetto valore
     * @return
     */
    public Calcolatrice reciproco ();
    
    
    
    /**
     *  dato un valore ,sia Razionali che Interi e Reali ,
     *  fa l'opposto del suddetto valore
     * @return
     */
    public Calcolatrice opposto ();
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import appcalc.Calcolatrice;


/**
 *
 * @author tonin
 */
public class Reale implements Calcolatrice{

    
    
    
    protected double reale;
    
    
    public Reale(double reale){
    
        this.reale = reale;
    
    }
    
    
    
    public Reale(long intero){
        
        this.reale = (double)intero;
        
    }
    
    public Reale(String str){
        
        if (str == null || str.isEmpty()) {
            throw new NumberFormatException("La stringa fornita non è un numero double valido: " + str);
        }
        int startIndex = 0;
        if (str.charAt(0) == '-') {
            if (str.length() == 1) {
                throw new NumberFormatException("La stringa fornita non è un numero double valido: " + str);
            }
            startIndex = 1;
        }
        boolean dotEncountered = false;
        for (int i = startIndex; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.') {
                if (dotEncountered) {
                    throw new NumberFormatException("La stringa fornita non è un numero double valido: " + str);
                }
                dotEncountered = true;
            } else if (!Character.isDigit(c)) {
                throw new NumberFormatException("La stringa fornita non è un numero double valido: " + str);
            }
        }
        
        this.reale = Double.parseDouble(str);
        
    }
    
    
    
    public Reale(){
        
        this.reale = 0.0;
        
    }
    
    
    
    public Reale(Reale r){
    
        this(r.getReale());
        
    }
    
    
    
    public double getReale(){
    
        return this.reale;
        
    }
    
    
    
    public Razionale toRazionale(){
        
        return new Razionale(getReale());
        
    }
    
    
    //poco funzionale ma potrebbe servire
    public Intero toIntero(){
        return new Intero(getReale());
    }
    
    
    
    
    private Reale compatibile(Calcolatrice val){
        Reale val2;
        // Verifica se l'oggetto specificato è della stessa classe dell'oggetto corrente
        if (val.getClass() == this.getClass()) {
           // Effettua il cast dell'oggetto specificato a Razionale e lo assegna a r2
           val2 = (Reale) val;
        } else {
           // Solleva un'eccezione se l'oggetto specificato non è dello stesso tipo dell'oggetto corrente
           throw new IllegalArgumentException("ERROR: incompatibilità");
       }
       // Restituisce il Razionale convertito
       return val2;
    }

    
    
    @Override
    public Calcolatrice reciproco() {

        return new Razionale((new Razionale(getReale())).reciproco());

    }

    @Override
    public Calcolatrice opposto() {

         return new Reale(-getReale());

    }
    
    
    @Override
    public Reale somma(Calcolatrice val) {
        
        Reale val1 = compatibile(val);
        
        return new Reale( getReale()+ val1.getReale());
        
    }

    @Override
    public Reale sottrazione(Calcolatrice val) {

        return new Reale(this.somma(val.opposto()));

    }

    @Override
    public Reale prodotto(Calcolatrice val) {

        Reale val1 = compatibile(val);
        
        return new Reale( getReale()* val1.getReale());

    }

    @Override
    public Razionale divisione(Calcolatrice val) {

        Reale val1 = compatibile(val);
        
        Razionale a = new Razionale(getReale());
        
        Razionale b = new Razionale(val1.getReale());
        
        Razionale risultato = a.divisione(b);
        
        
        return risultato;

    }

    @Override
    public Reale potenza(int indice) {

        Reale risultato = new Reale();
        
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
        
        
        
        
        return "" + getReale();
    }
    
    
    
}

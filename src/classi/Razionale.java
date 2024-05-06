
package classi;
import appcalc.Calcolatrice;

import java.math.BigInteger;


/**
 *
 * @author tonin daniel
 */
public class Razionale implements Calcolatrice{
    
    private BigInteger num;
    private BigInteger den;
    private boolean segno;
    
    
    
    /**
     * Costruttore che crea un oggetto RazionaleBig con il numeratore e il denominatore specificati.
     * @param num Il numeratore del razionale
     * @param den Il denominatore del razionale (deve essere diverso da zero)
    */
    
    public Razionale(BigInteger num, BigInteger den){
        
        
        if(den.equals(BigInteger.ZERO)){
            throw new AbstractMethodError("ERROR: divisione per 0");
        }
        
        //segno
        if((num.compareTo(BigInteger.ZERO))<0  ^ (den.compareTo(BigInteger.ZERO))<0){
            this.segno = true;
        }else{
            this.segno = false;
        }
        
        //converto il numeratore e il denominatore da negativi a positivi
        
        this.num = num.abs();
        this.den = den.abs();

        //applico il metodo privato semplifica
        semplifica();
    }
    
    
    /**
     * Costruttore che crea un razionale con il numeratore specificato, e il denominatore impostato a 1.
     * Il segno del razionale è negativo se il numeratore è negativo, altrimenti è positivo.
     * @param Bignum Il numeratore del razionale
    */

    public Razionale(BigInteger Bignum) {
        
        //denominatore
        this.den = BigInteger.ONE;
        
        //inposto il segno del numeratore e poi converto il numeratore in positivo
        if((Bignum.compareTo(BigInteger.ZERO))<0){
            this.segno = true;
        }else{
            this.segno = false;
        }
        
        //converto il numeratore e il denominatore da negativi a positivi
        
        this.num = Bignum.abs();
        semplifica();
    }
    
    
    /**
     * Costruttore che crea un oggetto RazionaleBig con il numeratore e il denominatore assoluti specificati, e il segno indicato.
     * Se il denominatore è zero, viene sollevata un'eccezione.
     * @param numAbs Il valore assoluto del numeratore del razionale
     * @param denAbs Il valore assoluto del denominatore del razionale (deve essere diverso da zero)
     * @param segno Il segno del razionale: true se negativo, false se positivo
    */

    public Razionale(BigInteger numAbs, BigInteger denAbs, boolean segno){
        
        
        if(denAbs.equals(BigInteger.ZERO)){
            throw new AbstractMethodError("ERROR: divisione per 0");
        }
        

        //converto il numeratore e il denominatore da negativi a positivi
        
        this.num = numAbs.abs();
        this.den = denAbs.abs();
        this.segno = segno;
        semplifica();
    }
    
    /**
     * Crea un razionale con numeratore e denominatore interi specificati.
     * Se il denominatore è zero, viene sollevata un'eccezione.
     * Il segno del razionale è determinato in base ai valori del numeratore e del denominatore.
     * @param num Il numeratore del razionale
     * @param den Il denominatore del razionale (diverso da zero)
    */

    public Razionale(long num, long den){
        
        
        if(den == 0){
            throw new AbstractMethodError("ERROR: divisione per 0");
        }
        
        //segno
        if(num < 0 ^ den < 0){
            this.segno = true;
        }else{
            this.segno = false;
        }
        
        //converto il numeratore e il denominatore da negativi a positivi
        this.num = BigInteger.valueOf(num).abs();
        this.den = BigInteger.valueOf(den).abs();

        //applico il metodo privato semplifica
        semplifica();
    }
    
    
    /**
     * Crea un razionale con il numeratore intero specificato e il denominatore impostato a 1.
     * Il segno del razionale è negativo se il numeratore è negativo, altrimenti è positivo.
     * @param Intnum Il numeratore del razionale
    */

    public Razionale(long Intnum) {
        
        
        this.den = BigInteger.ONE;
        
        //inposto il segno del numeratore e poi converto il numeratore in positivo
        if(Intnum < 0){
            this.segno = true;
        }else{
            this.segno = false;
        }
        
        this.num = BigInteger.valueOf(Intnum).abs(); 
        
        semplifica();
    }
    
    
    /**
     * Crea un razionale a partire da una stringa nel formato "num/den".
     * Il segno del razionale è determinato in base ai valori del numeratore e del denominatore.
     * @param elemRaz La stringa nel formato "num/den"
    */

    public Razionale(String elemRaz){
        elemRaz = elemRaz.trim();
        
        //eccezione
        if(elemRaz == null || elemRaz.length() == 0){
            throw new IllegalArgumentException("ERROR: string non deve essere nulla o < 0");
        }
        //inposto il divisore tra num e den
        String[] operandi = elemRaz.split("/");
        operandi[0] = operandi[0].trim();
        operandi[1] = operandi[1].trim();
        //eccezione
        if(operandi.length > 2){
            throw new IllegalArgumentException("ERROR: string non deve essere nulla o < 0" +
                    "use \"long/long\"");
        }
        
        //eccezione
        if(elemRaz.indexOf("/")>=0 && operandi.length==1){
            throw new IllegalArgumentException("ERROR: string non deve essere nulla o < 0" + 
                    "use \"long/long\"");
        }
        
        BigInteger numeratore = new BigInteger(operandi[0]);
        
        this.num = numeratore.abs();
        
        if(operandi.length == 1){
            
            this.den = BigInteger.ONE;
            this.segno = numeratore.compareTo(BigInteger.ZERO) < 0;
            
        }else{
            
            BigInteger denominatore = new BigInteger(operandi[1]);
            
            if(denominatore.equals(BigInteger.ZERO)){
                throw new AbstractMethodError("ERROR: divisione per 0");
            }
            
            //segno
        if((numeratore.compareTo(BigInteger.ZERO))<0  ^ (denominatore.compareTo(BigInteger.ZERO))<0){
            this.segno = true;
        }else{
            this.segno = false;
        }
        
        //converto il numeratore e il denominatore da negativi a positivi
        
        this.num = numeratore.abs();
        
        this.den = denominatore.abs();
        
        
        }
        semplifica();
    }
    
    /**
        * Crea una copia del razionale specificato.
        * @param razionalebig Il razionale da copiare
    */

    public Razionale(Razionale razionale) {
        this(razionale.getNum(), razionale.getDen(),razionale.getSegno());
    }
    
    /**
     * Crea un razionale a partire da un numero in virgola mobile.
     * @param reale Il numero in virgola mobile
    */

    public Razionale(double reale){

        // Converti il numero double in una stringa
        String numeroStringa = String.valueOf(reale);
        int parteDecimale;

        // Trova l'indice del punto decimale
        int indexPuntoDecimale = numeroStringa.indexOf('.');

        // Se c'è un punto decimale, calcola il numero di cifre dopo di esso
        if (indexPuntoDecimale != -1) {
            parteDecimale = numeroStringa.length() - indexPuntoDecimale - 1;
        } else {
            parteDecimale = 0;
        }

        // Inizializza un BigInteger e un double per rappresentare il numero di zeri necessari per la parte decimale
        BigInteger zeri = BigInteger.ONE;
        double zeriReali = 1;

        // Calcola il valore dei zeri necessari per rappresentare la parte decimale
        for(int i = 0; i < parteDecimale; i++){
            zeri = zeri.multiply(BigInteger.TEN);
            zeriReali = zeriReali * 10.0;
        }

        // Moltiplica il numero double per il numero di zeri per ottenere un intero
        double numReale = zeriReali * reale;
        int numInt = (int)numReale ;

        // Assegna il numeratore e il denominatore del numero razionale grande
        this.num = BigInteger.valueOf(numInt);
        this.den = zeri;

        // Semplifica il razionale grande
        semplifica();
    }
    
    
    /**
     * Crea un razionale con numeratore e denominatore impostati entrambi a 1 e segno positivo.
    */

    public Razionale(){
        this.num = BigInteger.ONE;
        this.den = BigInteger.ONE;
        this.segno = false;
        
    }
    
    
    public Intero toIntero(){
        
        return new Intero(getNum().intValue());
        
    }
    
    
    /**
     * Restituisce il numeratore del razionale.
     * @return Il numeratore del razionale
    */
    public BigInteger getNum() {
       return this.num;
    }

    /**
     * Restituisce il denominatore del razionale.
     * @return Il denominatore del razionale
    */
    public BigInteger getDen() {
       return this.den;
    }

    /**
     * Restituisce il segno del razionale.
     * @return true se il razionale è negativo, false altrimenti
    */
    public boolean getSegno() {
       return this.segno;
    }

    /**
     * Metodo privato che verifica la compatibilità dell'oggetto passato,
     * convertendolo in un oggetto di tipo RazionaleBig se compatibile, quindi downcasting. 
     * Se non è compatibile, viene lanciata un'eccezione.
     * @param r l'oggetto da verificare e convertire
     * @return il RazionaleBig convertito
     * @throws IllegalArgumentException se l'oggetto specificato non è dello stesso tipo dell'oggetto corrente
    */
    private Razionale Compatibile(Calcolatrice r) {
        Razionale r2;
        // Verifica se l'oggetto specificato è della stessa classe dell'oggetto corrente
        if (r.getClass() == this.getClass()) {
           // Effettua il cast dell'oggetto specificato a Razionale e lo assegna a r2
           r2 = (Razionale) r;
        } else {
           // Solleva un'eccezione se l'oggetto specificato non è dello stesso tipo dell'oggetto corrente
           throw new IllegalArgumentException("ERROR: incompatibilità");
       }
       // Restituisce il Razionale convertito
       return r2;
   }
    
    
    /**
     * Calcola il minimo comune multiplo (MCM) tra due numeri BigInteger.
     * @param a Il primo numero
     * @param b Il secondo numero
     * @return Il minimo comune multiplo tra a e b
    */

    private static BigInteger mcm(BigInteger a, BigInteger b) {
        return (a.multiply(b)).divide(a.gcd(b));
        
    }
    
    
    /**
     * Semplifica il razionale dividendo il numeratore e il denominatore per il loro massimo comune divisore (MCD).
     * Dopo la semplificazione, il razionale è rappresentato nella sua forma ridotta.
    */

    private void semplifica(){
        
        BigInteger mcd = getNum().gcd(getDen());
        
            
        // divide numeratore e denominatore per l'mcd, semplificando così il razionale
        this.num = getNum().divide(mcd);
        this.den = getDen().divide(mcd);
            

    }
    
    
    /**
     * Converte il razionale in un numero in virgola mobile.
     * @return Il valore del razionale come numero in virgola mobile
    */

    public double toDouble() {
        double reale;
        
        // Converte il numeratore in double
        double numeratore = getNum().doubleValue();
        
        // Converte il denominatore in double
        double denominatore = getDen().doubleValue();
        
        reale = numeratore / denominatore;
        
        // Restituisce il risultato della divisione del numeratore per il denominatore cambiato di segno
        return getSegno()? -reale : reale;
    }
    
    
    /**
     * Restituisce il razionale opposto al razionale corrente, invertendo il segno del numeratore.
     * @return Il razionale opposto
    */

    @Override
    public Razionale opposto() {
        return new Razionale(getNum(), getDen(), (!getSegno()));
    }
    
    
    /**
     * Restituisce il reciproco del razionale corrente, scambiando numeratore e denominatore.
     * Se il numeratore è zero, viene sollevata un'eccezione.
     * @return Il reciproco del razionale corrente
    */

    @Override
    public Razionale reciproco() {
        BigInteger numeratore = getNum();
        BigInteger denumeratore = getDen();
        
        if(numeratore.equals(BigInteger.ZERO)){
            throw new AbstractMethodError("ERROR: divisione per 0");
        }
        
        //converto il numeratore e il denominatore da negativi a positivi
        numeratore = numeratore.abs();
        denumeratore = denumeratore.abs();
        
        //ritorno il denominatore invertito col numeratore
        return new Razionale(denumeratore, numeratore, getSegno());
    }
    
    
    /**
     * Esegue l'operazione di addizione tra il razionale corrente e un altro razionale.
     * Se i razionali non sono dello stesso tipo, viene sollevata un'eccezione.
     * @param r L'altro razionale da sommare
     * @return Il risultato dell'addizione
    */

    @Override
    public Razionale somma(Calcolatrice r) {
        //utilizo metodo 'Compatibile' per downcasting
        Calcolatrice r3;
        
        if(r instanceof Reale){
            r3 = new Razionale(((Reale) r).reale);
        }else{
            r3 = r; 
        }
        Razionale r2 = Compatibile(r3);
        
        BigInteger numeratore;
        //assegno al denominatore l'mcm
        BigInteger denominatore = mcm(getDen(),r2.getDen());    
        
            // Calcolo i numeratori
        BigInteger numeratoreThis = getNum().multiply(denominatore.divide(getDen()));
        BigInteger numeratoreR2 = r2.getNum().multiply(denominatore.divide(r2.getDen()));

        // Sommo o sottraggo i numeratori a seconda del segno dei razionali
    
        
        if (getSegno() == r2.getSegno()) {
            numeratore = numeratoreThis.add(numeratoreR2);
            if(getSegno()){
                numeratore = numeratore.negate();
            }
        } else {
            numeratore = numeratoreThis.subtract(numeratoreR2);
            if(getSegno()){
                numeratore = numeratore.negate();
            }
        }
        
        return new Razionale(numeratore, denominatore);
    }
    
    
    /**
     * Esegue l'operazione di sottrazione tra il razionale corrente e un altro razionale.
     * Questa operazione è equivalente all'addizione del razionale corrente con l'opposto dell'altro razionale.
     * @param r2 L'altro razionale da sottrarre
     * @return Il risultato della sottrazione
    */

    @Override
    public Razionale sottrazione(Calcolatrice r2){
        
        return this.somma(r2.opposto());
    }
    
    
    /**
     * Esegue l'operazione di moltiplicazione tra il razionale corrente e un altro razionale.
     * Se i razionali non sono dello stesso tipo, viene sollevata un'eccezione.
     * @param r L'altro razionale con cui moltiplicare
     * @return Il risultato della moltiplicazione
     * @throws IllegalArgumentException Se i razionali non sono dello stesso tipo
    */

    @Override
    public Razionale prodotto(Calcolatrice r) {
        
        //utilizo metodo 'Compatibile' per downcasting
        Razionale r2 = Compatibile(r);
        
        
        
        //eseguo la moltiplicazione e denominatore separatamente
        BigInteger numeratore = getNum().multiply(r2.getNum());
        BigInteger denominatore = getDen().multiply(r2.getDen());
        
        
        return new Razionale(numeratore, denominatore, (getSegno() ^ r2.getSegno()));
    }

    
    /**
     * Esegue l'operazione di divisione tra il razionale corrente e un altro razionale.
     * Questa operazione è equivalente alla moltiplicazione del razionale corrente per il reciproco dell'altro razionale.
     * @param r2 L'altro razionale con cui dividere
     * @return Il risultato della divisione
    */

    @Override
    public Razionale divisione(Calcolatrice r2) {
        
        return this.prodotto(r2.reciproco());
        
    }

    
    /**
     * Esegue l'operazione di elevamento a potenza del razionale corrente.
     * @param p L'esponente a cui elevare il razionale
     * @return Il risultato dell'elevamento a potenza
    */

    
    @Override
    public Calcolatrice potenza(int indice) {
        // Crea un oggetto RazionaleBig che rappresenta il moltiplicatore
        Razionale moltiplicatore = new Razionale(this);
        // Crea un oggetto RazionaleBig che rappresenta il risultato, inizializzato con il valore corrente
        Razionale risultato = new Razionale(this);

        // Itera attraverso l'esponente assoluto per eseguire la moltiplicazione ripetuta
        for(int i = 1; i < (indice > 0 ? indice : -indice); i++) {
            // Moltiplica il risultato corrente per il moltiplicatore
            risultato = risultato.prodotto(moltiplicatore);
        }

        // Se l'esponente è negativo, calcola il reciproco del risultato
        if(indice < 0) {
            risultato = risultato.reciproco();
        }

        // Restituisce il risultato finale
        return risultato;
    }

    
    
   
    @Override
    public Calcolatrice radice(int indice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    

    @Override
    public String toString() {
        return "\n " + (getSegno()? '-' : '+')  + getNum() +" / "+ getDen();
    }

    


    
}

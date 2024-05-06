/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import appcalc.CalcFrame;
import appcalc.ImpostCalc;
import java.util.*;


/**
 *
 * @author tonin
 */


public class Osservatore implements Observer{
    
    private CalcFrame calcFrame; // Istanza della classe CalcFrame

    // Costruttore per inizializzare la variabile calcFrame
    public Osservatore(CalcFrame calcFrame) {
        this.calcFrame = calcFrame;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Osservato) {
            boolean nuovoValore = (boolean) arg;
            // Utilizza l'istanza di CalcFrame per chiamare i metodi darkCalc() e lightCalc()
            if (nuovoValore) {
                calcFrame.darkCalc();
            } else {
                calcFrame.lightCalc(); // Chiamata a lightCalc() quando il nuovo valore è false
            }
        }
    }
}

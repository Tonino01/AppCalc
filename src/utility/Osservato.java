/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.util.*;
import javax.swing.SwingUtilities;


/**
 *
 * @author tonin
 */


public class Osservato extends Observable{
    
    public void setMode(boolean newValue) {
        
        // Notifica gli osservatori del cambiamento
        setChanged();
        
        notifyObservers(newValue);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appcalc;

import java.awt.Color;
import java.io.*;

/**
 *
 * @author tonin
 */
public class AppCalc {
    
    
    
    
    
    public static String colorMode = "C:\\Users\\tonin\\Documents\\NetBeansProjects\\AppCalc\\src\\utility\\ColorMode.txt";
        
    public static String fileCronologia = "C:\\Users\\tonin\\Documents\\NetBeansProjects\\AppCalc\\src\\utility\\Cronologia.txt";
    
    // Boolean variable to save
    public static boolean darkmode;
    
    
    

    public static Color SfondoLight = new java.awt.Color(153, 153, 153);
    
    private static Color Barralight = new java.awt.Color(51,51,51);
    
    private static Color SfondoDark = new java.awt.Color(51,51,51);
    
    private static Color BarraDark = Color.BLACK;

    
    
    public static void setColorMode(String filePath) {
        AppCalc.colorMode = filePath;
    }

    public static void setDarkmode(boolean darkmode) {
        AppCalc.darkmode = darkmode;
    }

    
    
    public static String getColorMode() {
        return colorMode;
    }

    public static boolean isDarkmode() {
        return darkmode;
    }

    public static Color getSfondoLight() {
        return SfondoLight;
    }

    public static Color getBarralight() {
        return Barralight;
    }

    public static Color getSfondoDark() {
        return SfondoDark;
    }

    public static Color getBarraDark() {
        return BarraDark;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        CalcFrame a = new CalcFrame();
                
        a.setVisible(true);
        
        File file = new File(colorMode); // Specifica il percorso del tuo file

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linea = reader.readLine(); // Leggi la prima linea del file
            darkmode = Boolean.parseBoolean(linea.trim()); // Converte la stringa letta in booleano

            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    
    

    
}

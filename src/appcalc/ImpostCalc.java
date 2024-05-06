/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appcalc;

import utility.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import utility.Osservato;



/**
 *
 * @author tonin
 */
public class ImpostCalc extends JFrame{

    /**
     * Creates new form ImpostCalc
     */
    public ImpostCalc() {
        initComponents();
        
        setStyle();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barramultifunzione = new javax.swing.JPanel();
        chiudi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        sfondo = new javax.swing.JPanel();
        darkmode = new javax.swing.JRadioButton();

        setTitle("IMPOSTAZIONI");
        setLocation(new java.awt.Point(840, 420));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(230, 216));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barramultifunzione.setBackground(new java.awt.Color(51, 51, 51));
        barramultifunzione.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barramultifunzioneMouseDragged(evt);
            }
        });
        barramultifunzione.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barramultifunzioneMousePressed(evt);
            }
        });
        barramultifunzione.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chiudi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chiudi.png"))); // NOI18N
        chiudi.setContentAreaFilled(false);
        chiudi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chiudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiudiActionPerformed(evt);
            }
        });
        barramultifunzione.add(chiudi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/impostazioni.png"))); // NOI18N
        barramultifunzione.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/riduci-a-icona.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        barramultifunzione.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 30, 30));

        getContentPane().add(barramultifunzione, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        sfondo.setBackground(new java.awt.Color(153, 153, 153));
        sfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        darkmode.setText("DARK MODE");
        darkmode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkmodeActionPerformed(evt);
            }
        });
        sfondo.add(darkmode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        getContentPane().add(sfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 230, 170));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chiudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiudiActionPerformed
        
        this.setVisible(false);
        
    }//GEN-LAST:event_chiudiActionPerformed
    
    int xx, xy;
    private void barramultifunzioneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barramultifunzioneMousePressed
        
        xx = evt.getX();
        xy = evt.getY();
                                          
    }//GEN-LAST:event_barramultifunzioneMousePressed

    
    
    private void barramultifunzioneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barramultifunzioneMouseDragged
        
        int x = evt.getXOnScreen();
        
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xx, y-xy);
        
        
    }//GEN-LAST:event_barramultifunzioneMouseDragged
    
    Osservato osservato = new Osservato();
    
    private void darkmodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkmodeActionPerformed
        
        
        if(darkmode.isEnabled()){
            sfondo.setBackground(CalcFrame.SfondoDark);
            barramultifunzione.setBackground(CalcFrame.BarraDark);
            darkmod = true;
        } else {
            sfondo.setBackground(CalcFrame.SfondoLight);
            barramultifunzione.setBackground(CalcFrame.Barralight);
            darkmod = false;
        }

        // Dopo aver modificato lo stato, imposta il nuovo stato in Osservato
        osservato.setMode(darkmod);
        // Notifica l'osservatore della modifica di stato
        osservato.notifyObservers();

    }//GEN-LAST:event_darkmodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.setExtendedState(ImpostCalc.ICONIFIED);
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public boolean darkmod = false;
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ImpostCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImpostCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImpostCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImpostCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImpostCalc().setVisible(true);
            }
        });
    }
    
    
    
    
    

    public void setStyle() {
        
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/icon/icon.png"));
        
        setLocationByPlatform(false);
        this.dispose();
        this.setUndecorated(true); 
        this.setVisible(true);
        
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barramultifunzione;
    private javax.swing.JButton chiudi;
    private javax.swing.JRadioButton darkmode;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel sfondo;
    // End of variables declaration//GEN-END:variables

    

    
}

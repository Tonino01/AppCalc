/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appcalc;

import utility.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.ColorModel;
import java.io.PrintWriter;
import java.io.*;



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
        
        setColor();
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
        riduciaicona = new javax.swing.JButton();
        sfondo = new javax.swing.JPanel();
        ColorMode = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        applica = new javax.swing.JButton();
        Cronologia = new javax.swing.JButton();

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

        riduciaicona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/riduci-a-icona.png"))); // NOI18N
        riduciaicona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riduciaiconaActionPerformed(evt);
            }
        });
        barramultifunzione.add(riduciaicona, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 30, 30));

        getContentPane().add(barramultifunzione, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        sfondo.setBackground(new java.awt.Color(153, 153, 153));
        sfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ColorMode.setText("LIGHT MODE");
        ColorMode.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ColorModeStateChanged(evt);
            }
        });
        ColorMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorModeActionPerformed(evt);
            }
        });
        sfondo.add(ColorMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel2.setText("click to change:");
        sfondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 90, -1));

        applica.setText("Applica");
        applica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicaActionPerformed(evt);
            }
        });
        sfondo.add(applica, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        Cronologia.setText("Cronologia");
        Cronologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CronologiaActionPerformed(evt);
            }
        });
        sfondo.add(Cronologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 100, -1));

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

    
    private void riduciaiconaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riduciaiconaActionPerformed
        
        this.setExtendedState(ImpostCalc.ICONIFIED);
        
    }//GEN-LAST:event_riduciaiconaActionPerformed

    private void ColorModeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ColorModeStateChanged
        
    }//GEN-LAST:event_ColorModeStateChanged
    
    
    public void setColorMode(boolean colormode){
        
        
        try (PrintWriter writer = new PrintWriter(AppCalc.colorMode)) {
                writer.print(AppCalc.darkmode);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
        }
        
    }
    
    
    private void ColorModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorModeActionPerformed
        // TODO add your handling code here:
        
        
        
        if(ColorMode.getText().equals("LIGHT MODE")){
            ColorMode.setText("DARK MODE");
            AppCalc.setDarkmode(true);
        }else{
            ColorMode.setText("LIGHT MODE");
            AppCalc.setDarkmode(false);
        }
        
        
        
        
    }//GEN-LAST:event_ColorModeActionPerformed

    private void applicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicaActionPerformed
        
        setColorMode(AppCalc.isDarkmode());
        
    }//GEN-LAST:event_applicaActionPerformed

    CronologiaCalc cronologia = new CronologiaCalc();
    
    private void CronologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CronologiaActionPerformed
        // TODO add your handling code here:
        
        cronologia.setVisible(true);
        
        
    }//GEN-LAST:event_CronologiaActionPerformed
    
   
    
    
    
    
    
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
        
        setLocation(new java.awt.Point(840, 420));
        
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        
        cronologia.setVisible(false);
        
    }
    
    
    private void setColor() {
        
        try (BufferedReader reader = new BufferedReader(new FileReader(AppCalc.getColorMode()))) {
            AppCalc.setDarkmode(Boolean.parseBoolean(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        if(AppCalc.darkmode){
            barramultifunzione.setBackground(AppCalc.getBarraDark());
            sfondo.setBackground(AppCalc.getSfondoDark());
            ColorMode.setText("DARK MODE");
        }else{
            barramultifunzione.setBackground(AppCalc.getBarralight());
            sfondo.setBackground(AppCalc.getSfondoLight());
            ColorMode.setText("LIGHT MODE");
        }
        
        
        
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ColorMode;
    private javax.swing.JButton Cronologia;
    private javax.swing.JButton applica;
    private javax.swing.JPanel barramultifunzione;
    private javax.swing.JButton chiudi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton riduciaicona;
    private javax.swing.JPanel sfondo;
    // End of variables declaration//GEN-END:variables

    
    
    
    

    

    
}

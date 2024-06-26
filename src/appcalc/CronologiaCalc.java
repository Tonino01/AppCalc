/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appcalc;

import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.io.*;

/**
 *
 * @author tonin
 */
public class CronologiaCalc extends javax.swing.JFrame {

    /**
     * Creates new form CronoFrame
     */
    public CronologiaCalc() {
        initComponents();
        
        setStyle();
        
        setText();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        pulisci = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRONOLOGIA");
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
        barramultifunzione.add(chiudi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/impostazioni.png"))); // NOI18N
        barramultifunzione.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 40, 30));

        riduciaicona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/riduci-a-icona.png"))); // NOI18N
        riduciaicona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riduciaiconaActionPerformed(evt);
            }
        });
        barramultifunzione.add(riduciaicona, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 30, 30));

        getContentPane().add(barramultifunzione, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 50));

        sfondo.setBackground(new java.awt.Color(153, 153, 153));
        sfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.setEditable(false);
        display.setBackground(new java.awt.Color(102, 102, 102));
        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        sfondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 340));

        jLabel2.setText("CRONOLOGIA:");
        sfondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 90, 20));

        pulisci.setText("pulisci");
        pulisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulisciActionPerformed(evt);
            }
        });
        sfondo.add(pulisci, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        getContentPane().add(sfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 300, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chiudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiudiActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_chiudiActionPerformed

    private void riduciaiconaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riduciaiconaActionPerformed

        this.setExtendedState(ImpostCalc.ICONIFIED);

    }//GEN-LAST:event_riduciaiconaActionPerformed

    
    int xx, xy;
    private void barramultifunzioneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barramultifunzioneMouseDragged

        int x = evt.getXOnScreen();

        int y = evt.getYOnScreen();

        this.setLocation(x-xx, y-xy);

    }//GEN-LAST:event_barramultifunzioneMouseDragged

    private void barramultifunzioneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barramultifunzioneMousePressed

        xx = evt.getX();
        xy = evt.getY();

    }//GEN-LAST:event_barramultifunzioneMousePressed

    private void pulisciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulisciActionPerformed
        
        try {
            FileWriter writer = new FileWriter(AppCalc.fileCronologia, false);
            writer.write(""); // Scrive una stringa vuota per sovrascrivere il contenuto esistente
            writer.close();
            display.setText("");
        } catch (IOException e) {
            display.setText("Si è verificato un errore durante la pulizia del file.");
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_pulisciActionPerformed

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
            java.util.logging.Logger.getLogger(CronologiaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CronologiaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CronologiaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CronologiaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CronologiaCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barramultifunzione;
    private javax.swing.JButton chiudi;
    private javax.swing.JTextArea display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pulisci;
    private javax.swing.JButton riduciaicona;
    private javax.swing.JPanel sfondo;
    // End of variables declaration//GEN-END:variables



    public void setStyle() {
        
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/icon/icon.png"));
        
        setLocationByPlatform(false);
        this.dispose();
        this.setUndecorated(true); 
        this.setVisible(true);
        
        setLocation(new java.awt.Point(800, 290));
        
        setShape(new RoundRectangle2D.Double(0, 0, getWidth()-20, getHeight()-40, 20, 20));
        
        
        
    }

    public void setText() {
        try {
            File file = new File(AppCalc.fileCronologia);
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {


                // Aggiungi la riga al display
                display.setText(display.getText() + "\n" + line);
            }
            reader.close();
        } catch (IOException e) {
            display.setText("Si è verificato un errore durante la lettura dal file.");
            e.printStackTrace();
        }
    }




}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appcalc;

import classi.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author tonin
 */
public class CalcFrame extends javax.swing.JFrame {

    

    /**
     * Creates new form CalcFrame
     */
    public CalcFrame() {
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

        jSeparator5 = new javax.swing.JSeparator();
        barramultifunzione = new javax.swing.JPanel();
        chiudi = new javax.swing.JButton();
        impostazioni = new javax.swing.JButton();
        sfondo = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        uno = new javax.swing.JButton();
        due = new javax.swing.JButton();
        tre = new javax.swing.JButton();
        quattro = new javax.swing.JButton();
        cinque = new javax.swing.JButton();
        sei = new javax.swing.JButton();
        sette = new javax.swing.JButton();
        otto = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        uguale = new javax.swing.JButton();
        Canc = new javax.swing.JButton();
        addizione = new javax.swing.JButton();
        sottrazione = new javax.swing.JButton();
        prodotto = new javax.swing.JButton();
        divisione = new javax.swing.JButton();
        virgola = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        Conversione = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCOLATRICE");
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.gray);
        setIconImages(null);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(320, 420));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 0, 400));

        barramultifunzione.setBackground(new java.awt.Color(51, 51, 51));
        barramultifunzione.setForeground(new java.awt.Color(51, 51, 51));
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
        barramultifunzione.add(chiudi, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 30, 30));

        impostazioni.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icon.png"))); // NOI18N
        impostazioni.setContentAreaFilled(false);
        impostazioni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        impostazioni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impostazioniActionPerformed(evt);
            }
        });
        barramultifunzione.add(impostazioni, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 32, 32));

        getContentPane().add(barramultifunzione, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 50));

        sfondo.setBackground(new java.awt.Color(153, 153, 153));
        sfondo.setForeground(new java.awt.Color(102, 102, 102));
        sfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display.setBackground(new java.awt.Color(102, 102, 102));
        display.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setCaretColor(new java.awt.Color(255, 255, 255));
        display.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        sfondo.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 60));

        uno.setBackground(new java.awt.Color(102, 102, 102));
        uno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/one-light.png"))); // NOI18N
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        sfondo.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 43, 43));

        due.setBackground(new java.awt.Color(102, 102, 102));
        due.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        due.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/due-light.png"))); // NOI18N
        due.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                dueInputMethodTextChanged(evt);
            }
        });
        due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dueActionPerformed(evt);
            }
        });
        sfondo.add(due, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 43, 43));

        tre.setBackground(new java.awt.Color(102, 102, 102));
        tre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/tre-light.png"))); // NOI18N
        tre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treActionPerformed(evt);
            }
        });
        sfondo.add(tre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 43, 43));

        quattro.setBackground(new java.awt.Color(102, 102, 102));
        quattro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        quattro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/quattro-light.png"))); // NOI18N
        quattro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quattroActionPerformed(evt);
            }
        });
        sfondo.add(quattro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 43, 43));

        cinque.setBackground(new java.awt.Color(102, 102, 102));
        cinque.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cinque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/cinque-light.png"))); // NOI18N
        cinque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinqueActionPerformed(evt);
            }
        });
        sfondo.add(cinque, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 43, 43));

        sei.setBackground(new java.awt.Color(102, 102, 102));
        sei.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/sei-light.png"))); // NOI18N
        sei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seiActionPerformed(evt);
            }
        });
        sfondo.add(sei, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 43, 43));

        sette.setBackground(new java.awt.Color(102, 102, 102));
        sette.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sette.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/sette-light.png"))); // NOI18N
        sette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setteActionPerformed(evt);
            }
        });
        sfondo.add(sette, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 43, 43));

        otto.setBackground(new java.awt.Color(102, 102, 102));
        otto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        otto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/otto-light.png"))); // NOI18N
        otto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ottoActionPerformed(evt);
            }
        });
        sfondo.add(otto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 43, 43));

        nove.setBackground(new java.awt.Color(102, 102, 102));
        nove.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/nove-light.png"))); // NOI18N
        nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveActionPerformed(evt);
            }
        });
        sfondo.add(nove, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 43, 43));

        uguale.setBackground(new java.awt.Color(102, 102, 102));
        uguale.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        uguale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/uguale-light.png"))); // NOI18N
        uguale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ugualeActionPerformed(evt);
            }
        });
        sfondo.add(uguale, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 43, 43));

        Canc.setBackground(new java.awt.Color(102, 102, 102));
        Canc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/cancella-light.png"))); // NOI18N
        Canc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancActionPerformed(evt);
            }
        });
        sfondo.add(Canc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 80, 40));

        addizione.setBackground(new java.awt.Color(102, 102, 102));
        addizione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addizione.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/somma-light.png"))); // NOI18N
        addizione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addizioneActionPerformed(evt);
            }
        });
        sfondo.add(addizione, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 43, 43));

        sottrazione.setBackground(new java.awt.Color(102, 102, 102));
        sottrazione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sottrazione.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/sottrazione-light.png"))); // NOI18N
        sottrazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sottrazioneActionPerformed(evt);
            }
        });
        sfondo.add(sottrazione, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 43, 43));

        prodotto.setBackground(new java.awt.Color(102, 102, 102));
        prodotto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        prodotto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/prodotto-light.png"))); // NOI18N
        prodotto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodottoActionPerformed(evt);
            }
        });
        sfondo.add(prodotto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 43, 43));

        divisione.setBackground(new java.awt.Color(102, 102, 102));
        divisione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        divisione.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/divisione-light.png"))); // NOI18N
        divisione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisioneActionPerformed(evt);
            }
        });
        sfondo.add(divisione, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 43, 43));

        virgola.setBackground(new java.awt.Color(102, 102, 102));
        virgola.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        virgola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/virgola-light.png"))); // NOI18N
        virgola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virgolaActionPerformed(evt);
            }
        });
        sfondo.add(virgola, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 43, 43));

        zero.setBackground(new java.awt.Color(102, 102, 102));
        zero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        zero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light/zero-light.png"))); // NOI18N
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        sfondo.add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 43, 43));

        Conversione.setBackground(new java.awt.Color(102, 102, 102));
        Conversione.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Conversione.setText("Conv");
        Conversione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConversioneActionPerformed(evt);
            }
        });
        sfondo.add(Conversione, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 90, 40));

        getContentPane().add(sfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 320, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    public static Color SfondoLight = new java.awt.Color(153, 153, 153);
    
    public static Color Barralight = new java.awt.Color(51,51,51);
    
    public static Color SfondoDark = new java.awt.Color(51,51,51);
    
    public static Color BarraDark = Color.BLACK;
    
    
    
    
    
    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        // TODO add your handling code here:
        if(!display.getText().contains("+") || !display.getText().contains("-") || !display.getText().contains("*") || !display.getText().contains("/")){
            display.setText(display.getText() + "1");
        }
    }//GEN-LAST:event_unoActionPerformed

    private void dueInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_dueInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_dueInputMethodTextChanged

    private void dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dueActionPerformed
        // TODO add your handling code here:
        if(!display.getText().contains("+") || !display.getText().contains("-") || !display.getText().contains("*") || !display.getText().contains("/")){
            display.setText(display.getText() + "2");
        }
    }//GEN-LAST:event_dueActionPerformed

    private void treActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treActionPerformed
        // TODO add your handling code here:
        if(!display.getText().contains("+") || !display.getText().contains("-") || !display.getText().contains("*") || !display.getText().contains("/")){
            display.setText(display.getText() + "3");
        }
    }//GEN-LAST:event_treActionPerformed

    private void quattroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quattroActionPerformed
        // TODO add your handling code here:
        if(!display.getText().contains("+") || !display.getText().contains("-") || !display.getText().contains("*") || !display.getText().contains("/")){
            display.setText(display.getText() + "4");
        }
    }//GEN-LAST:event_quattroActionPerformed

    private void cinqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinqueActionPerformed
        // TODO add your handling code here:
        if(!display.getText().contains("+") || !display.getText().contains("-") || !display.getText().contains("*") || !display.getText().contains("/")){
            display.setText(display.getText() + "5");
        }
    }//GEN-LAST:event_cinqueActionPerformed

    private void seiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seiActionPerformed
        // TODO add your handling code here:
        if(!display.getText().contains("+") || !display.getText().contains("-") || !display.getText().contains("*") || !display.getText().contains("/")){
            display.setText(display.getText() + "6");
        }
    }//GEN-LAST:event_seiActionPerformed

    private void setteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setteActionPerformed
        // TODO add your handling code here:
        if(!display.getText().contains("+") || !display.getText().contains("-") || !display.getText().contains("*") || !display.getText().contains("/")){
            display.setText(display.getText() + "7");
        }
    }//GEN-LAST:event_setteActionPerformed

    private void ottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ottoActionPerformed
        // TODO add your handling code here:
        if(!display.getText().contains("+") || !display.getText().contains("-") || !display.getText().contains("*") || !display.getText().contains("/")){
            display.setText(display.getText() + "8");
        }
    }//GEN-LAST:event_ottoActionPerformed
    
    
    
    
    private static Calcolatrice eseguioperazioni(String[] parti) {
        
        Calcolatrice res = new Reale(parti[0]);

        for (int i = 1; i < parti.length; i += 2) {
            String operatore = parti[i];
            Calcolatrice operando = new Reale(parti[i + 1]);

            // Se l'operatore è una moltiplicazione o divisione, esegui l'operazione immediatamente
            if (operatore.equals("*")) {
                res = res.prodotto(operando);
            } else if (operatore.equals("/")) {
                res = res.divisione(operando);
            }
        }

        // Ripeti il ciclo per eseguire le operazioni di somma e sottrazione
        for (int i = 1; i < parti.length; i += 2) {
            String operatore = parti[i];
            Calcolatrice operando = new Reale(parti[i + 1]);

            // Se l'operatore è una somma o una sottrazione, esegui l'operazione
            if (operatore.equals("+")) {
                res = res.somma(operando);
            } else if (operatore.equals("-")) {
                res = res.sottrazione(operando);
            }
        }

        return res;
    }

    
    
    private void ugualeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ugualeActionPerformed
        // TODO add your handling code here:
        Calcolatrice res = new Reale();
        
        // Ottieni la stringa dal display
        String espressione = display.getText();
        
        if(!espressione.isEmpty()){
        
            // Divido la stringa in base agli spazi per ottenere i due operandi e l'operatore
            String[] parti = espressione.split(" ");

            res = eseguioperazioni(parti);
            
            


            if(res instanceof Reale){

                String numeroStringa = Double.toString(((Reale) res).getReale());
                String[] parte = numeroStringa.split("\\.");

                if(parte.length == 2 && parte[1].equals("0")) {
                    res = new Intero(parte[0]); // Parte intera del numero reale
                }

                display.setText("" + res);

            }else if(res instanceof Intero){
                display.setText("" + res);
            }else if(res instanceof Razionale){
                display.setText("" + res);
            }else{
                display.setText("FATAL ERROR");
            }
        }else{
            display.setText("");
        }
        
    }//GEN-LAST:event_ugualeActionPerformed

    private void addizioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addizioneActionPerformed
        // TODO add your handling code here:
        if(!display.getText().isEmpty()){
            display.setText(display.getText() + " + ");
        }
    }//GEN-LAST:event_addizioneActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formKeyPressed

    private void sottrazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sottrazioneActionPerformed
        
        if(!display.getText().isEmpty()){
            display.setText(display.getText() + " - ");
        }
    }//GEN-LAST:event_sottrazioneActionPerformed

    private void prodottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodottoActionPerformed
        
        if(!display.getText().isEmpty()){
            display.setText(display.getText() + " * ");
        }
    }//GEN-LAST:event_prodottoActionPerformed

    private void divisioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisioneActionPerformed
        
        if(!display.getText().isEmpty()){
            display.setText(display.getText() + " / ");
        }
    }//GEN-LAST:event_divisioneActionPerformed

    private void virgolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virgolaActionPerformed
        
        if(!display.getText().contains("+") || !display.getText().contains("-") || !display.getText().contains("*") || !display.getText().contains("/")){
            display.setText(display.getText() + ".");
        }
    }//GEN-LAST:event_virgolaActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        
        if(!display.getText().contains("+") || !display.getText().contains("-") || !display.getText().contains("*") || !display.getText().contains("/")){
            display.setText(display.getText() + "0");
        }
    }//GEN-LAST:event_zeroActionPerformed

    private void impostazioniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impostazioniActionPerformed
        
        impo.setVisible(true);
        
        
        setColor();
        
    }//GEN-LAST:event_impostazioniActionPerformed

    private void chiudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiudiActionPerformed
        // TODO add your handling code here:
        dispose();
        
        
        
    }//GEN-LAST:event_chiudiActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

    private void noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveActionPerformed
        // TODO add your handling code here:
        if(!display.getText().contains("+") || !display.getText().contains("-") || !display.getText().contains("*") || !display.getText().contains("/")){
            display.setText(display.getText() + "9");
        }
    }//GEN-LAST:event_noveActionPerformed

    private void CancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancActionPerformed
        // TODO add your handling code here:
        display.setText("");

    }//GEN-LAST:event_CancActionPerformed

    private void ConversioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConversioneActionPerformed

        Razionale val1 = new Razionale(display.getText());

        display.setText("" + val1.toDouble());

    }//GEN-LAST:event_ConversioneActionPerformed

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
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new CalcFrame().setVisible(true);
            }
        });
    }
    
    

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Canc;
    private javax.swing.JButton Conversione;
    private javax.swing.JButton addizione;
    private javax.swing.JPanel barramultifunzione;
    private javax.swing.JButton chiudi;
    private javax.swing.JButton cinque;
    private javax.swing.JTextField display;
    private javax.swing.JButton divisione;
    private javax.swing.JButton due;
    private javax.swing.JButton impostazioni;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton nove;
    private javax.swing.JButton otto;
    private javax.swing.JButton prodotto;
    private javax.swing.JButton quattro;
    private javax.swing.JButton sei;
    private javax.swing.JButton sette;
    private javax.swing.JPanel sfondo;
    private javax.swing.JButton sottrazione;
    private javax.swing.JButton tre;
    private javax.swing.JButton uguale;
    private javax.swing.JButton uno;
    private javax.swing.JButton virgola;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

    ImpostCalc impo = new ImpostCalc();
    
    
    public void setStyle() {
        
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/icon/icon.png"));
        
        setLocationByPlatform(false);
        this.dispose();
        this.setUndecorated(true); 
        this.setVisible(true);
        
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
        
        
        
        impo.setVisible(false);
        
        
    }

    private void setColor() {
        
        if(impo.darkmod){
            darkCalc();
        }else{
            lightCalc();
        }
        
    }
    
    
    private void darkCalc() {
        
        sfondo.setBackground(SfondoDark);
        barramultifunzione.setBackground(BarraDark);
        display.setBackground(new java.awt.Color(102,102,102));
        display.setForeground(Color.black);
        
        zero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/zero-dark.png")));
        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/one-dark.png")));
        due.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/due-dark.png")));
        tre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/tre-dark.png")));
        quattro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/quattro-dark.png")));
        cinque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/cinque-dark.png")));
        sei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/sei-dark.png")));
        sette.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/sette-dark.png")));
        otto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/otto-dark.png")));
        nove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/nove-dark.png")));
        addizione.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/addizione-dark.png")));
        sottrazione.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/sottrazione-dark.png")));
        uguale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/uguale-dark.png")));
        virgola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/virgola-dark.png")));
        prodotto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/prodotto-dark.png")));
        divisione.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dark/divisione-dark.png")));
        
    }

    public void lightCalc() {
        
        display.setForeground(Color.white);
        setDefaultLookAndFeelDecorated(true);
        
    }
    
    
    public void ricaricaframe(){
        
        this.dispose();
        // Crea un nuovo frame
        ImpostCalc nuovoFrame = new ImpostCalc();
        nuovoFrame.setVisible(true);
    }
    
}

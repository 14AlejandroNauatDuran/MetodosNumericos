/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosNumericos;

/**
 *
 * @author Admin
 */
public class Tema1 extends javax.swing.JFrame {

    /**
     * Creates new form Tema1
     */
    public Tema1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        ValorReal = new javax.swing.JLabel();
        VALORPROMEDIO = new javax.swing.JLabel();
        campoR = new javax.swing.JTextField();
        campoA = new javax.swing.JTextField();
        REONDEAR = new javax.swing.JRadioButton();
        TRUNCAR = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        cantiTRUNCAR = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        RESULTADOabsoluto = new javax.swing.JTextField();
        RESULTADOrelativo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setText("salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        Menu.setText("menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        ValorReal.setText("VALOR REAL");
        getContentPane().add(ValorReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        VALORPROMEDIO.setText("VALOR PROMEDIO");
        getContentPane().add(VALORPROMEDIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        campoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRActionPerformed(evt);
            }
        });
        getContentPane().add(campoR, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 170, 30));

        campoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAActionPerformed(evt);
            }
        });
        getContentPane().add(campoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 170, 30));

        REONDEAR.setText("REDONDEAR");
        REONDEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REONDEARActionPerformed(evt);
            }
        });
        getContentPane().add(REONDEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        TRUNCAR.setText("TRUNCAR");
        TRUNCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRUNCARActionPerformed(evt);
            }
        });
        getContentPane().add(TRUNCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jLabel3.setText("Cuantos Numeros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        cantiTRUNCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantiTRUNCARActionPerformed(evt);
            }
        });
        getContentPane().add(cantiTRUNCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 50, 30));

        calcular.setText("CALCULAR");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        getContentPane().add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        RESULTADOabsoluto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESULTADOabsolutoActionPerformed(evt);
            }
        });
        getContentPane().add(RESULTADOabsoluto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 150, -1));

        RESULTADOrelativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESULTADOrelativoActionPerformed(evt);
            }
        });
        getContentPane().add(RESULTADOrelativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 150, -1));

        jLabel1.setText("ERROR ABSOLUTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        jLabel2.setText("ERROR RELATIVO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo/IMG-20190202-WA0031.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 695));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        MenuTemas tema = new MenuTemas();
        tema.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuActionPerformed

    private void campoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRActionPerformed
        
    }//GEN-LAST:event_campoRActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        
        
         String valorR, valorA;
        float flotanteR, flotanteA;
        
        valorR=campoR.getText();
        valorA=campoA.getText();
        flotanteA=Float.parseFloat(valorA);
        flotanteR=Float.parseFloat(valorR);
        
        float valorAbsoluto, valorRelativo;
        
        valorAbsoluto=flotanteR-flotanteA;
        if(valorAbsoluto < 0){
            valorAbsoluto*=-1;
        }
         valorRelativo=(flotanteR-flotanteA)/flotanteR;
        if(valorRelativo < 0){
            valorRelativo*=-1;
        }
        
       
        String absoluto, relativo;
        absoluto=Float.toString(valorAbsoluto);
        relativo=Float.toString(valorRelativo);
        RESULTADOabsoluto.setText(absoluto);
        RESULTADOrelativo.setText(relativo);                                   
    }//GEN-LAST:event_calcularActionPerformed

    private void campoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAActionPerformed
        
    }//GEN-LAST:event_campoAActionPerformed

    private void RESULTADOabsolutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESULTADOabsolutoActionPerformed
        
    }//GEN-LAST:event_RESULTADOabsolutoActionPerformed

    private void REONDEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REONDEARActionPerformed
        
    }//GEN-LAST:event_REONDEARActionPerformed

    private void TRUNCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRUNCARActionPerformed
        String cantidad = cantiTRUNCAR.getText();
        
    }//GEN-LAST:event_TRUNCARActionPerformed

    private void cantiTRUNCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantiTRUNCARActionPerformed
        
    }//GEN-LAST:event_cantiTRUNCARActionPerformed

    private void RESULTADOrelativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESULTADOrelativoActionPerformed
        
    }//GEN-LAST:event_RESULTADOrelativoActionPerformed

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
            java.util.logging.Logger.getLogger(Tema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tema1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Menu;
    private javax.swing.JRadioButton REONDEAR;
    private javax.swing.JTextField RESULTADOabsoluto;
    private javax.swing.JTextField RESULTADOrelativo;
    private javax.swing.JButton Salir;
    private javax.swing.JRadioButton TRUNCAR;
    private javax.swing.JLabel VALORPROMEDIO;
    private javax.swing.JLabel ValorReal;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField campoA;
    private javax.swing.JTextField campoR;
    private javax.swing.JTextField cantiTRUNCAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package semaforoexamen;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author JUAN
 */
public class Semaforo extends javax.swing.JFrame {

    
    /**
     * Creates new form Semaforo
     */
    public Semaforo() {
        
      initComponents();
      
       
    }
    
    public void moverse(){
        Hilo h1 = new Hilo();
      try{
        while(true){
            s1Verde.setBackground(Color.green);
            s1Rojo.setBackground(Color.gray);
            s1Amarillo.setBackground(Color.gray);
            s2Verde.setBackground(Color.gray);
            s2Rojo.setBackground(Color.red);
            s2Amarillo.setBackground(Color.gray);
            h1.esperar(5);
            s1Verde.setBackground(Color.gray);
            s1Rojo.setBackground(Color.gray);
            s1Amarillo.setBackground(Color.yellow);
            h1.esperar(2);
            s1Verde.setBackground(Color.gray);
            s1Rojo.setBackground(Color.red);
            s1Amarillo.setBackground(Color.gray);
            s2Verde.setBackground(Color.green);
            s2Rojo.setBackground(Color.gray);
            s2Amarillo.setBackground(Color.gray);
            h1.esperar(5);
            s2Verde.setBackground(Color.gray);
            s2Rojo.setBackground(Color.gray);
            s2Amarillo.setBackground(Color.yellow);
            h1.esperar(2);
        }
      }catch(Exception e){
          System.out.print(" "+e);
      }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        s2Verde = new javax.swing.JButton();
        s2Rojo = new javax.swing.JButton();
        s2Amarillo = new javax.swing.JButton();
        lblSemaforoUno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        s1Verde = new javax.swing.JButton();
        s1Rojo = new javax.swing.JButton();
        s1Amarillo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(300, 340));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(131, 224));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        s2Verde.setBackground(new java.awt.Color(0, 153, 0));
        jPanel2.add(s2Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 30, 25));

        s2Rojo.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.add(s2Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 25));

        s2Amarillo.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.add(s2Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 30, 25));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 70, 190));

        lblSemaforoUno.setBackground(new java.awt.Color(0, 0, 0));
        lblSemaforoUno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSemaforoUno.setText("S1");
        getContentPane().add(lblSemaforoUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("S2");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        s1Verde.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.add(s1Verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 30, 25));

        s1Rojo.setBackground(new java.awt.Color(204, 0, 0));
        s1Rojo.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(s1Rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 25));

        s1Amarillo.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.add(s1Amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 30, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 70, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Semaforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Semaforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Semaforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Semaforo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Semaforo semaforo =  new Semaforo();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
               semaforo.setVisible(true);
               
                
            }
        });
       
        semaforo.moverse();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSemaforoUno;
    private javax.swing.JButton s1Amarillo;
    private javax.swing.JButton s1Rojo;
    private javax.swing.JButton s1Verde;
    private javax.swing.JButton s2Amarillo;
    private javax.swing.JButton s2Rojo;
    private javax.swing.JButton s2Verde;
    // End of variables declaration//GEN-END:variables
}
;
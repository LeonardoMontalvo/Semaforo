/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package semaforo;

import javax.swing.ImageIcon;
/**
 *
 * @author Leo
 */
public class SemaforoV extends javax.swing.JFrame {


    /**
     * Creates new form SemaforoV
     */
    public SemaforoV() {
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

        jPanel1 = new javax.swing.JPanel();
        lblSemaforo = new javax.swing.JLabel();
        btnCambiar = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSemaforo.setBackground(new java.awt.Color(255, 255, 255));
        lblSemaforo.setForeground(new java.awt.Color(255, 255, 255));
        lblSemaforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-11-10 223019.png"))); // NOI18N
        getContentPane().add(lblSemaforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 290, 600));

        btnCambiar.setText("CAMBIAR");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private int semaforo  = 0 ;
    
    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
 
    switch (semaforo) {
        case 0:
            ImageIcon imRojo = new ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Semaforo\\src\\imagenes\\semaforo rojo.jpg");
            lblSemaforo.setIcon(imRojo);
            break;

        case 1:
            ImageIcon imAmarillo = new ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Semaforo\\src\\imagenes\\semaforo amarillo.jpg");
            lblSemaforo.setIcon(imAmarillo);
            break;

        case 2 :
            ImageIcon imVerde = new ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Semaforo\\src\\imagenes\\semaforo verde.jpg");
            lblSemaforo.setIcon(imVerde);
            break;

        default:
            break;
    } 
    
   semaforo = semaforo + 1;
   if (semaforo >= 3) {
       semaforo =0;
}
   
    }//GEN-LAST:event_btnCambiarActionPerformed

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
            java.util.logging.Logger.getLogger(SemaforoV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SemaforoV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SemaforoV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SemaforoV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SemaforoV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblSemaforo;
    // End of variables declaration//GEN-END:variables
}

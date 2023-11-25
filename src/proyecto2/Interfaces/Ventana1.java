/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2.Interfaces;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import proyecto2.Cronometro;
import proyecto2.FuncionesTEMP;
import proyecto2.HashTable;

import proyecto2.MontículoB;

/**
 *
 * @author alexp
 */
public class Ventana1 extends javax.swing.JFrame {
    static MontículoB mont;
    static HashTable ListaUsuarios;
    static Cronometro timer;
    /**
     * Creates new form Ventana1
     */
    public Ventana1(MontículoB mont, HashTable ListaU, Cronometro timer) {
        this.mont=mont;
        this.ListaUsuarios = ListaU;
        this.timer = timer;
        
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        timer.run();
         this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                FuncionesTEMP.WriteCSV(Ventana1.ListaUsuarios); 
                
                System.exit(0);
            }
        });
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
        Registrarse = new javax.swing.JButton();
        IniciarSesion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        CancelarDocumento = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Fondo1V1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        Registrarse.setBackground(new java.awt.Color(204, 204, 204));
        Registrarse.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(0, 0, 0));
        Registrarse.setText("Registrarse");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 140, -1));

        IniciarSesion.setBackground(new java.awt.Color(204, 204, 204));
        IniciarSesion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        IniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        IniciarSesion.setText("Iniciar sesion");
        IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 140, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Mostrar cola de impresion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 180, 40));

        CancelarDocumento.setBackground(new java.awt.Color(204, 204, 204));
        CancelarDocumento.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        CancelarDocumento.setForeground(new java.awt.Color(0, 0, 0));
        CancelarDocumento.setText("Eliminar Usuario");
        CancelarDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarDocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(CancelarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 210, 150, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        Fondo1V1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/VUnop2.png"))); // NOI18N
        getContentPane().add(Fondo1V1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 620, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * * Este botón hace que al presionarlo dirija al usuario hacia la Ventana2
 * Se ejecuta cuando el usuario hace clic en el botón de inicio sesión.
 * @param evt 
 */
    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
        Ventana2 v2=new Ventana2(this);
    }//GEN-LAST:event_RegistrarseActionPerformed
/**
 * Este botón hace que al presionarle dirija al usuario a la ventana de inciar sesión.
 * @param evt 
 */
    private void IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarSesionActionPerformed
        Ventana3 v3=new Ventana3(this);
    }//GEN-LAST:event_IniciarSesionActionPerformed
/**
 * Este botón dirije al usuario a la ventana dónde se puede cancelar los documentos
 * @param evt 
 */
    private void CancelarDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarDocumentoActionPerformed
        Ventana4 v4=new Ventana4(this);
    }//GEN-LAST:event_CancelarDocumentoActionPerformed
/**
 * * Método que se ejecuta cuando se hace clic en el botón jButton1.
 * Escribe la lista de usuarios en un archivo CSV y cierra el programa.
 *
 * @param evt El evento de clic en el botón.
 * @param evt 
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FuncionesTEMP.WriteCSV(ListaUsuarios);
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        vista1 v = new vista1(mont);
        v.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarDocumento;
    private javax.swing.JLabel Fondo1V1;
    private javax.swing.JButton IniciarSesion;
    private javax.swing.JButton Registrarse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

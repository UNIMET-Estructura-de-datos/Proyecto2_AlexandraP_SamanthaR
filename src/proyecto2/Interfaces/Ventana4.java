/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2.Interfaces;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import proyecto2.FuncionesTEMP;

/**
 *
 * @author Alexandra Padrón y Samantha Rojas
 */
/**
 *Constructor para crear una nueva ventana Ventana4.
 * Inicializa los componentes, establece la visibilidad de las ventanas y establece el manejador del evento de cierre de la ventana.
 * @param v1 La ventana 1.
 */
public class Ventana4 extends javax.swing.JFrame {
    public static Ventana1 v1;
    /**
     * Creates new form Ventana4
     */
    public Ventana4(Ventana1 v1) {
        initComponents();
        this.v1=v1;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
         this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                FuncionesTEMP.WriteCSV(v1.ListaUsuarios); 
                
                System.exit(0);
            }
        });
         
         this.MostrarUsuarios.setText(Ventana1.ListaUsuarios.mostrar(""));
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
        AtrásV4 = new javax.swing.JButton();
        SalirV4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        user_toDelete = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MostrarUsuarios = new javax.swing.JTextArea();
        cola = new javax.swing.JLabel();
        FondoV4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        AtrásV4.setBackground(new java.awt.Color(204, 204, 204));
        AtrásV4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        AtrásV4.setForeground(new java.awt.Color(0, 0, 0));
        AtrásV4.setText("Atrás");
        AtrásV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrásV4ActionPerformed(evt);
            }
        });
        getContentPane().add(AtrásV4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        SalirV4.setBackground(new java.awt.Color(204, 204, 204));
        SalirV4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        SalirV4.setForeground(new java.awt.Color(0, 0, 0));
        SalirV4.setText("Salir");
        SalirV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirV4ActionPerformed(evt);
            }
        });
        getContentPane().add(SalirV4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Indique el usario que desea eliminar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        user_toDelete.setBackground(new java.awt.Color(204, 204, 204));
        user_toDelete.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        user_toDelete.setForeground(new java.awt.Color(0, 0, 0));
        user_toDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_toDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(user_toDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 160, -1));

        eliminar.setBackground(new java.awt.Color(204, 204, 204));
        eliminar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        eliminar.setForeground(new java.awt.Color(0, 0, 0));
        eliminar.setText("Ok");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        MostrarUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        MostrarUsuarios.setColumns(20);
        MostrarUsuarios.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        MostrarUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        MostrarUsuarios.setRows(5);
        jScrollPane1.setViewportView(MostrarUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        cola.setBackground(new java.awt.Color(255, 255, 255));
        cola.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        cola.setForeground(new java.awt.Color(255, 255, 255));
        cola.setText("USUARIOS:");
        getContentPane().add(cola, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        FondoV4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/FondoV4.png"))); // NOI18N
        FondoV4.setText("Cola de impresión");
        getContentPane().add(FondoV4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Método que se ejecuta cuando se hace clic en el botón 'AtrásV4'.
 * Hace que la ventana actual sea invisible y muestra la ventana v1.
 * @param evt El evento de clic en el botón.
 */

    private void AtrásV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrásV4ActionPerformed
        this.setVisible(false);
        v1.setVisible(true);
    }//GEN-LAST:event_AtrásV4ActionPerformed
/**
 * Método que se ejecuta cuando se hace clic en el botón SalirV4.
 * Escribe la lista de usuarios en un archivo CSV y cierra el programa.
 * @param evt El evento de clic en el botón.
 */
    private void SalirV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirV4ActionPerformed
        FuncionesTEMP.WriteCSV(Ventana1.ListaUsuarios);
        System.exit(0);
    }//GEN-LAST:event_SalirV4ActionPerformed
/**
 *  Método que se ejecuta cuando se hace clic en el botón user_toDelete.
 * @param evt El evento de clic en el botón.
 */
    private void user_toDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_toDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_toDeleteActionPerformed
/**
 * * Método que se ejecuta cuando se hace clic en el botón 'eliminar'.
 * Elimina el usuario ingresado de la lista de usuarios.
 * @param evt El evento de clic en el botón.
 */

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        String user_elim = "";
        user_elim= user_toDelete.getText();
        Ventana1.ListaUsuarios.eliminar(user_elim);
        user_toDelete.setText("");
        this.MostrarUsuarios.setText(Ventana1.ListaUsuarios.mostrar(""));

        
    }//GEN-LAST:event_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana4(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrásV4;
    private javax.swing.JLabel FondoV4;
    private javax.swing.JTextArea MostrarUsuarios;
    private javax.swing.JButton SalirV4;
    private javax.swing.JLabel cola;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField user_toDelete;
    // End of variables declaration//GEN-END:variables
}

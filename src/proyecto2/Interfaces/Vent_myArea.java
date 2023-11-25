/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2.Interfaces;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import proyecto2.FuncionesTEMP;
import proyecto2.ListaDocs;
import proyecto2.NodoDoc;





/**
 *
 * @author Samantha Rojas y Alexandra Padrón
 */
public class Vent_myArea extends javax.swing.JFrame {
    public static Ventana3_1 v3_1;
    /**
     * Creates new form Vent_myArea
     */
/**
 * Constructor para crear una nueva ventana Vent_myArea.
 * Inicializa los componentes, establece la visibilidad de las ventanas,
 * llena el comboBox con los documentos del usuario y establece el manejador del evento de cierre de la ventana.
 *
 * @param v3_1 La ventana 3_1.
 */
    public Vent_myArea(Ventana3_1 v3_1) {
        initComponents();
        this.v3_1 = v3_1;
        v3_1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.MostrarUsuarios.setText(Ventana1.mont.mostrar(""));

        ListaDocs Docs_User = Ventana1.ListaUsuarios.buscar_User(v3_1.getNombreUser()).getDocList();
        NodoDoc aux = Docs_User.getFirst();
        for (int i = 0; i < Docs_User.getSize(); i++) {
             MISDOCS.addItem(aux.getNombreDoc());
             aux= aux.getNext();
        }
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                FuncionesTEMP.WriteCSV(Ventana1.ListaUsuarios); ;
                
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
        jLabel2 = new javax.swing.JLabel();
        MISDOCS = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        IMPRIMIR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        DocSelected = new javax.swing.JTextField();
        CerrarSesion = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MostrarUsuarios = new javax.swing.JTextArea();
        Colaventarea = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FondoMyArea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione la acción que desea realizar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        MISDOCS.setBackground(new java.awt.Color(204, 204, 204));
        MISDOCS.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        MISDOCS.setForeground(new java.awt.Color(0, 0, 0));
        MISDOCS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MISDOCSItemStateChanged(evt);
            }
        });
        MISDOCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MISDOCSActionPerformed(evt);
            }
        });
        jPanel1.add(MISDOCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 150, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MyArea:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        IMPRIMIR.setBackground(new java.awt.Color(204, 204, 204));
        IMPRIMIR.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        IMPRIMIR.setForeground(new java.awt.Color(0, 0, 0));
        IMPRIMIR.setText("Imprimir");
        IMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIMIRActionPerformed(evt);
            }
        });
        jPanel1.add(IMPRIMIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        ELIMINAR.setBackground(new java.awt.Color(204, 204, 204));
        ELIMINAR.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        ELIMINAR.setForeground(new java.awt.Color(0, 0, 0));
        ELIMINAR.setText("Eliminar");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });
        jPanel1.add(ELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seleccione el  documento que desee:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        DocSelected.setBackground(new java.awt.Color(204, 204, 204));
        DocSelected.setForeground(new java.awt.Color(0, 0, 0));
        DocSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocSelectedActionPerformed(evt);
            }
        });
        jPanel1.add(DocSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 190, -1));

        CerrarSesion.setBackground(new java.awt.Color(204, 204, 204));
        CerrarSesion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        CerrarSesion.setText("Cerrar sesión");
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(CerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        atras.setBackground(new java.awt.Color(204, 204, 204));
        atras.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        atras.setForeground(new java.awt.Color(0, 0, 0));
        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        MostrarUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        MostrarUsuarios.setColumns(20);
        MostrarUsuarios.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        MostrarUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        MostrarUsuarios.setRows(5);
        jScrollPane1.setViewportView(MostrarUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        Colaventarea.setBackground(new java.awt.Color(255, 255, 255));
        Colaventarea.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Colaventarea.setForeground(new java.awt.Color(255, 255, 255));
        Colaventarea.setText("Cola de impresión");
        jPanel1.add(Colaventarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mis documentos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        FondoMyArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/FondoMyArea.png"))); // NOI18N
        jPanel1.add(FondoMyArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 670, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Método que se ejecuta cuando se hace clic en el botón ELIMINAR.
 * Elimina el documento seleccionado del comboBox y de la lista de documentos del usuario.
 * @param evt El evento de clic en el botón.
 */
    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        // TODO add your handling code here:
        String DocChoosed = DocSelected.getText();
        if (!DocChoosed.isBlank()){
        MISDOCS.removeItem(DocChoosed);
        Ventana1.ListaUsuarios.eliminar_documento(v3_1.getNombreUser(),DocChoosed);
        this.MostrarUsuarios.setText(Ventana1.mont.mostrar(""));
        JOptionPane.showMessageDialog(null, "Eliminado Con éxito");
        DocSelected.setText("");}
        else{
            JOptionPane.showMessageDialog(null, "No tiene ningun documento seleccionado o no tiene ninguno creado");
        }
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void DocSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocSelectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocSelectedActionPerformed

    private void MISDOCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MISDOCSActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_MISDOCSActionPerformed
/**
 * Se ejecuta cuando se hace clic en el botón 'atras'.
 * Hace que la ventana actual sea invisible y muestra la ventana v3_1.
 * @param evt El evento de clic en el botón.
 */

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        v3_1.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed
/**
 * Se ejecuta cuando se hace clic en el botón CerrarSesion.
 * Hace que la ventana actual sea invisible y muestra la ventana de inicio de sesión.
 * @param evt El evento de clic en el botón.
 
 */
    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        v3_1.getV1().setVisible(true);
    }//GEN-LAST:event_CerrarSesionActionPerformed
/**
 * Método que se ejecuta cuando el estado del elemento seleccionado en MISDOCS cambia.
 * Establece el texto del campo DocSelected con el documento seleccionado.
 * @param evt El evento de cambio de estado del elemento seleccionado.
 */
 
    private void MISDOCSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MISDOCSItemStateChanged
        // TODO add your handling code here:
        String Dselected =(String) MISDOCS.getSelectedItem();
        DocSelected.setText(Dselected);
        
        
    }//GEN-LAST:event_MISDOCSItemStateChanged
/**
 * Método que se ejecuta cuando se hace clic en el botón IMPRIMIR.
 * Añade el documento seleccionado a la cola de impresión.
 * @param evt El evento de clic en el botón.
 */
    private void IMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIMIRActionPerformed
        // TODO add your handling code here:
        
        NodoDoc DocChoosed = Ventana1.ListaUsuarios.buscar_doc(v3_1.getNombreUser(),DocSelected.getText());
        DocChoosed.setColadeImpr(true);
        Ventana1.timer.pausar();
        if (Ventana1.mont.getHeap().length > 0) {
            DocChoosed.FinalPriority(Ventana1.mont.getHeap()[0], DocChoosed, Ventana1.timer.getSegundos());

            
        } else {


            DocChoosed.setEtiquetaTiempo(Ventana1.timer.getSegundos());
            
    }
        Ventana1.timer.reanudar();
        Ventana1.mont.insert(DocChoosed);
        JOptionPane.showMessageDialog(null, "Añadido a la cola de impresión...");
        DocSelected.setText("");
        String str = "";
        this.MostrarUsuarios.setText(Ventana1.mont.mostrar(str));
       
        
        
        
    }//GEN-LAST:event_IMPRIMIRActionPerformed

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
            java.util.logging.Logger.getLogger(Vent_myArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vent_myArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vent_myArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vent_myArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JLabel Colaventarea;
    private javax.swing.JTextField DocSelected;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JLabel FondoMyArea;
    private javax.swing.JButton IMPRIMIR;
    private javax.swing.JComboBox<String> MISDOCS;
    private javax.swing.JTextArea MostrarUsuarios;
    private javax.swing.JButton atras;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
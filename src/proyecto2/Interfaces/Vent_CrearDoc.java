/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto2.Interfaces;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import proyecto2.FuncionesTEMP;
import proyecto2.Usuario;

/**
 *
 * @author Samantha
 */
public class Vent_CrearDoc extends javax.swing.JFrame {
    public static Ventana3_1 v3_1;
    /**
     * Creates new form Vent_CrearDoc
     */
/**
 * Constructor para crear una nueva ventana Vent_cancelar.
 * Inicializa los componentes, establece la visibilidad de las ventanas,
 * llena el comboBox con los documentos en cola y establece el manejador del evento de cierre de la ventana.
 * @param v3_1 La ventana 3_1.
 */
    public Vent_CrearDoc(Ventana3_1 v3_1) {
        initComponents();
        this.v3_1 = v3_1;
        v3_1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        NombreDoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Tipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tamaño = new javax.swing.JTextField();
        GuardarDoc = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FondoCrearDoc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del documento:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        NombreDoc.setBackground(new java.awt.Color(204, 204, 204));
        NombreDoc.setForeground(new java.awt.Color(0, 0, 0));
        NombreDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreDocActionPerformed(evt);
            }
        });
        jPanel1.add(NombreDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 140, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" EJ: Pdf,Docx,OFORM, XLSX,PPTX,HTML,ODT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 240, 20));

        Tipo.setBackground(new java.awt.Color(204, 204, 204));
        Tipo.setForeground(new java.awt.Color(0, 0, 0));
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });
        jPanel1.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 140, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Número de páginas: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        tamaño.setBackground(new java.awt.Color(204, 204, 204));
        tamaño.setForeground(new java.awt.Color(0, 0, 0));
        tamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañoActionPerformed(evt);
            }
        });
        jPanel1.add(tamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 140, -1));

        GuardarDoc.setBackground(new java.awt.Color(204, 204, 204));
        GuardarDoc.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        GuardarDoc.setForeground(new java.awt.Color(0, 0, 0));
        GuardarDoc.setText("Guardar");
        GuardarDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarDocActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        atras.setBackground(new java.awt.Color(204, 204, 204));
        atras.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        atras.setForeground(new java.awt.Color(0, 0, 0));
        atras.setText("Atrás");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Formato:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        FondoCrearDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/FondoCrear.png"))); // NOI18N
        jPanel1.add(FondoCrearDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 510, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreDocActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoActionPerformed

    private void tamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamañoActionPerformed
/**
 * *
 * Método que se ejecuta cuando se hace clic en el botón GuardarDoc.
 * Valida los datos ingresados y guarda el documento si son válidos.
 * @param evt El evento de clic en el botón.
 */
    private void GuardarDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarDocActionPerformed
        String DocName = "";
        String  Doctype= "";
       try {

        DocName= NombreDoc.getText();
        Doctype = Tipo.getText();
        int DocSize = Integer.parseInt(tamaño.getText());
     
        
        if(FuncionesTEMP.Validar(DocName) && FuncionesTEMP.Validar(Doctype)&& FuncionesTEMP.ValidarFormato(Doctype) && !(DocSize<=0) && (Ventana1.ListaUsuarios.buscar_doc(v3_1.getNombreUser(), DocName) == null) ){ // y aja doc size es un nro
           Usuario user_actual = Ventana1.ListaUsuarios.buscar_User(v3_1.getNombreUser());
           
           Ventana1.ListaUsuarios.insertar_documento(v3_1.getNombreUser(), DocName, Doctype,DocSize, user_actual.getTipo()); // la prioridad se la dare cuando se mande a impresión.
            
            JOptionPane.showMessageDialog(null, "Guardado con éxito");
            NombreDoc.setText("");
            Tipo.setText("");
            tamaño.setText("");
            this.setVisible(false);
            v3_1.setVisible(true);
        }else{
            
            if (DocSize<=0){
                JOptionPane.showMessageDialog(null, "Tamaño de documento inválido..");
                
            }else if (Ventana1.ListaUsuarios.buscar_doc(v3_1.getNombreUser(), DocName) != null){
                JOptionPane.showMessageDialog(null, "El nombre del documento  ya existe, intente colocar un nombre diferente...");
            }
           NombreDoc.setText("");
           Tipo.setText("");
           tamaño.setText("");
              }} catch (NumberFormatException e) {
        
            JOptionPane.showMessageDialog(null,"Ingrese un nro como tamaño de Documento! ");
            NombreDoc.setText("");
            Tipo.setText("");
            tamaño.setText("");
              };
        
    }//GEN-LAST:event_GuardarDocActionPerformed
/**
 * Esta funcion hace que se ejecuta cuando se hace clic en el botón 'atras'.
 * Hace que la ventana actual sea invisible y muestra la ventana v3_1.
 *
 * @param evt El evento de clic en el botón.
 */
    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        v3_1.setVisible(true);
    }//GEN-LAST:event_atrasActionPerformed

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
            java.util.logging.Logger.getLogger(Vent_CrearDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vent_CrearDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vent_CrearDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vent_CrearDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoCrearDoc;
    private javax.swing.JButton GuardarDoc;
    private javax.swing.JTextField NombreDoc;
    private javax.swing.JTextField Tipo;
    private javax.swing.JButton atras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tamaño;
    // End of variables declaration//GEN-END:variables
}
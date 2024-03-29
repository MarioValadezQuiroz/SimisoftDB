/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import BussinesModelLayer.Contactos;
import BussinesModelLayer.Sucursales;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class frmNMSucursales extends javax.swing.JDialog {
    private int idSucursal = 0;//boton modificar
    private Sucursales sucursales = new Sucursales();//boton modificar
    private int tablaIdContactoClass[];
    /**
     * Creates new form frmNMSucursales
     */
    public frmNMSucursales(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public frmNMSucursales(){
        initComponents();
        Contactos contacto = new Contactos();
        DefaultTableModel resultadoContacto = contacto.GetAllModel();
        int NumFilasContacto = resultadoContacto.getRowCount();
        int tablaIdContacto[];
        tablaIdContacto = new int[NumFilasContacto];
        String tablaNombreContacto[];
        tablaNombreContacto = new String[NumFilasContacto];
        int indexSelectedContacto = 0;
        
         for (int i = 0; i < NumFilasContacto; i++) {
            tablaIdContacto[i] = (int) resultadoContacto.getValueAt(i, 0);
            tablaNombreContacto[i] = (String) resultadoContacto.getValueAt(i, 1);
            comboBoxIdContacto.addItem(tablaNombreContacto[i]);
        }
         this.tablaIdContactoClass = new int[NumFilasContacto];
         this.tablaIdContactoClass = tablaIdContacto;
        
    }
    public frmNMSucursales(int idSucursal) {//boton modificar
        initComponents();
        this.idSucursal = idSucursal;//se le pone la unica propiedad que es idProducto pero es la unica propiedad que ocupa para poder llamar al metodo GetById() y este metodo lo que hace es poblar las otras propiedades con la informacion de la base de datos
        sucursales.setIdSucursal(idSucursal);
        sucursales.GetById();//recuerda que este metodo lo que hacia era consultar en base de datos y llenar las mismas propiedades de este objeto de la misma clase
        txtNombreSucursal.setText(sucursales.getNombreSucursal());
        //txtIdContacto.setText("" + sucursales.getIdContacto());
        
        Contactos contacto = new Contactos();
        DefaultTableModel resultadoContacto = contacto.GetAllModel();
        int NumFilasContacto = resultadoContacto.getRowCount();
        int tablaIdContacto[];
        tablaIdContacto = new int[NumFilasContacto];
        String tablaNombreContacto[];
        tablaNombreContacto = new String[NumFilasContacto];
        int indexSelectedContacto = 0;
        
        for (int i = 0; i < NumFilasContacto; i++) {
            tablaIdContacto[i] = (int) resultadoContacto.getValueAt(i, 0);
            tablaNombreContacto[i] = (String) resultadoContacto.getValueAt(i, 1);
            comboBoxIdContacto.addItem(tablaNombreContacto[i]);
            if (tablaIdContacto[i] == sucursales.getIdContacto()) {
                indexSelectedContacto = i;
            }
        }
        comboBoxIdContacto.setSelectedIndex(indexSelectedContacto);
        this.tablaIdContactoClass = new int[NumFilasContacto];
        this.tablaIdContactoClass = tablaIdContacto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        txtNombreSucursal = new javax.swing.JTextField();
        comboBoxIdContacto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre Sucursal");

        jLabel2.setText("Entidad Contacto");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnOk.setText("Guardar");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(39, 39, 39)
                        .addComponent(btnOk))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxIdContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxIdContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnOk))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
            if (sucursales.getIdSucursal()> 0) {
            sucursales.setNombreSucursal(txtNombreSucursal.getText());
            //sucursales.setIdContacto(Integer.parseInt(txtIdContacto.getText()));
             int idContacto = this.tablaIdContactoClass[(int) comboBoxIdContacto.getSelectedIndex()];
             sucursales.setIdContacto(idContacto);
            sucursales.setActivo(1);
            
            if (sucursales.Update()) {
                JOptionPane.showMessageDialog(null, "Sucursal actualizada correctamente");
                this.dispose();
            }

        } else {
                int idContacto = this.tablaIdContactoClass[(int) comboBoxIdContacto.getSelectedIndex()];
            if (new Sucursales(0,
                    txtNombreSucursal.getText(),
                    //Integer.parseInt(txtIdContacto.getText()),
                    idContacto,
                    1).Add()) {
                JOptionPane.showMessageDialog(null, "Sucursal agregada correctamente");
                this.dispose();
            } else {
            }
        }
    }//GEN-LAST:event_btnOkActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmNMSucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmNMSucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmNMSucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmNMSucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                frmNMSucursales dialog = new frmNMSucursales(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> comboBoxIdContacto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNombreSucursal;
    // End of variables declaration//GEN-END:variables
}

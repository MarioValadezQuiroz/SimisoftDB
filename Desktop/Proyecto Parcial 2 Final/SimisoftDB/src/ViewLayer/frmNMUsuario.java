/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import BussinesModelLayer.Contactos;
import BussinesModelLayer.Sucursales;
import BussinesModelLayer.Usuarios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class frmNMUsuario extends javax.swing.JDialog {
    private int idUsuarios = 0;//boton modificar
    private Usuarios usuarios = new Usuarios();//boton modificar
    private int tablaIdContactosClass[];
    private int tablaIdSucursalesClass[];
    /**
     * Creates new form frmNMUsuario
     */
    public frmNMUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public frmNMUsuario(){
        initComponents();
        Contactos contactos = new Contactos();
        
        DefaultTableModel res = contactos.GetAllModel();
        int NumFilas = res.getRowCount();
        int tablaIdContactos[];
        tablaIdContactos = new int[NumFilas];
        String tablaNombreContactos[];
        tablaNombreContactos = new String[NumFilas];
        int indexSelectedContactos = 0;
        for (int i = 0; i < NumFilas; i++) {
            tablaIdContactos[i] = (int) res.getValueAt(i, 0);
            tablaNombreContactos[i] = (String) res.getValueAt(i, 1);
            comboboxIdContacto.addItem(tablaNombreContactos[i]);
        }
        this.tablaIdContactosClass = new int[NumFilas];
        this.tablaIdContactosClass = tablaIdContactos;
        
        Sucursales sucursales = new Sucursales();
        DefaultTableModel resultadoSucursal = sucursales.GetAllModel();
        int NumFilasSucursal = resultadoSucursal.getRowCount();
        int tablaIdSucursales[];
        tablaIdSucursales = new int[NumFilasSucursal];
        String tablaNombreSucursales[];
        tablaNombreSucursales = new String[NumFilasSucursal];
        
        int indexSelectedSucursal = 0;
        for (int i = 0; i < NumFilasSucursal; i++) {
            tablaIdSucursales[i] = (int) resultadoSucursal.getValueAt(i, 0);
            tablaNombreSucursales[i] = (String) resultadoSucursal.getValueAt(i, 1);
            comboboxIdSucursal.addItem(tablaNombreSucursales[i]);
        }
        
        this.tablaIdSucursalesClass = new int[NumFilasSucursal];
        this.tablaIdSucursalesClass = tablaIdSucursales;
    }
  
    public frmNMUsuario(int idUsuarios) {//boton modificar
        initComponents();
        this.idUsuarios = idUsuarios;//se le pone la unica propiedad que es idProducto pero es la unica propiedad que ocupa para poder llamar al metodo GetById() y este metodo lo que hace es poblar las otras propiedades con la informacion de la base de datos
        usuarios.setIdUsuarios(idUsuarios);
        usuarios.GetById();//recuerda que este metodo lo que hacia era consultar en base de datos y llenar las mismas propiedades de este objeto de la misma clase
        txtNombre.setText(usuarios.getNombre());
        txtTipoUsuario.setText(usuarios.getTipoUsuario());
        txtUsuario.setText(usuarios.getUsuario());
        txtPassword.setText(usuarios.getPassword());
        //txtIdSucursal.setText("" + usuarios.getIdSucursal());
        //txtIdContacto.setText("" + usuarios.getIdContacto());
        
        Contactos contactos = new Contactos();
        DefaultTableModel res = contactos.GetAllModel();
        int NumFilas = res.getRowCount();
        int tablaIdContacto[];
        tablaIdContacto = new int[NumFilas];
        String tablaNombreContacto[];
        tablaNombreContacto = new String[NumFilas];
        int indexSelected = 0;
        
        for (int i = 0; i < NumFilas; i++) {
            tablaIdContacto[i] = (int) res.getValueAt(i, 0);
            tablaNombreContacto[i] = (String) res.getValueAt(i, 1);
            comboboxIdContacto.addItem(tablaNombreContacto[i]);
            if (tablaIdContacto[i] == usuarios.getIdContacto()) {
                indexSelected = i;
            }
        }
        comboboxIdContacto.setSelectedIndex(indexSelected);
        this.tablaIdContactosClass = new int[NumFilas];
        this.tablaIdContactosClass = tablaIdContacto;
        
        Sucursales sucursales = new Sucursales();
        DefaultTableModel resultadoSucursal = sucursales.GetAllModel();
        int NumFilasSucursal = resultadoSucursal.getRowCount();
        int tablaIdSucursal[];
        tablaIdSucursal = new int[NumFilasSucursal];
        String tablaNombreSucursal[];
        tablaNombreSucursal = new String[NumFilasSucursal];
        int indexSelectedSucursal = 0;
        
          for (int i = 0; i < NumFilasSucursal; i++) {
            tablaIdSucursal[i] = (int) resultadoSucursal.getValueAt(i, 0);
            tablaNombreSucursal[i] = (String) resultadoSucursal.getValueAt(i, 1);
            comboboxIdSucursal.addItem(tablaNombreSucursal[i]);
            if (tablaIdSucursal[i] == usuarios.getIdSucursal()) {
                indexSelectedSucursal = i;
            }
        }
        comboboxIdSucursal.setSelectedIndex(indexSelectedSucursal);
        this.tablaIdSucursalesClass = new int[NumFilasSucursal];
        this.tablaIdSucursalesClass = tablaIdSucursal;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTipoUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        comboboxIdContacto = new javax.swing.JComboBox<>();
        comboboxIdSucursal = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre Sucursal");

        jLabel2.setText("tipoUsuario");

        jLabel3.setText("nombre");

        jLabel4.setText("Entidad Contacto");

        jLabel5.setText("Usuario");

        jLabel6.setText("Password");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOk))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboboxIdContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTipoUsuario)
                                .addComponent(txtNombre)
                                .addComponent(txtUsuario)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboboxIdSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboboxIdSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboboxIdContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
      if (usuarios.getIdUsuarios()> 0) {
            usuarios.setNombre(txtNombre.getText());
            usuarios.setTipoUsuario(txtTipoUsuario.getText());
            usuarios.setUsuario(txtUsuario.getText());
            usuarios.setPassword(txtPassword.getText());
            //usuarios.setIdSucursal(Integer.parseInt(txtIdSucursal.getText()));
            //usuarios.setIdContacto(Integer.parseInt(txtIdContacto.getText())); //comentar
            //usuarios.setActivo(1);
             int idSucursalUno = this.tablaIdSucursalesClass[(int) comboboxIdSucursal.getSelectedIndex()];
             int idContactoDos = this.tablaIdContactosClass[(int) comboboxIdContacto.getSelectedIndex()];
             usuarios.setIdSucursal(idSucursalUno);
             usuarios.setIdContacto(idContactoDos);
             usuarios.setActivo(1);
            if (usuarios.Update()) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                this.dispose();
            }

        } else {
          
          int idSucursalUno = this.tablaIdSucursalesClass[(int) comboboxIdSucursal.getSelectedIndex()];
          int idContactoDos = this.tablaIdContactosClass[(int) comboboxIdContacto.getSelectedIndex()];
            if (new Usuarios(0,
                    txtNombre.getText(),
                    txtTipoUsuario.getText(),//En esta parte se convirtio el tipo Date de la variable caducidad a String osea DATE to String
                    txtUsuario.getText(),
                    txtPassword.getText(),
                    //Integer.parseInt(txtIdSucursal.getText()),
                    //Integer.parseInt(txtIdContacto.getText()),
                    idSucursalUno,
                    idContactoDos,
                    1).Add()) {
                JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
                this.dispose();
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
//            java.util.logging.Logger.getLogger(frmNMUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmNMUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmNMUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmNMUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                frmNMUsuario dialog = new frmNMUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> comboboxIdContacto;
    private javax.swing.JComboBox<String> comboboxIdSucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTipoUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

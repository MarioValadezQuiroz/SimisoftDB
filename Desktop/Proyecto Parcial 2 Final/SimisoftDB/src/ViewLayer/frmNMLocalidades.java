/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import BussinesModelLayer.Localidades;
import BussinesModelLayer.Municipios;
import BussinesModelLayer.Sucursales;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class frmNMLocalidades extends javax.swing.JDialog {
    private int idLocalidad = 0;//boton modificar
    private Localidades localidad = new Localidades();//boton modificar
    private int tablaIdMunicipioClass[];
    /**
     * Creates new form frmNMLocalidades
     */
    public frmNMLocalidades(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public frmNMLocalidades(){
        initComponents();
        Municipios municipio = new Municipios();
        DefaultTableModel resultadoMunicipio = municipio.GetAllModel();
        int NumFilasMunicipio = resultadoMunicipio.getRowCount();
        int tablaIdMunicipio[];
        tablaIdMunicipio = new int[NumFilasMunicipio];
        String tablaNombreMunicipio[];
        tablaNombreMunicipio = new String[NumFilasMunicipio];
        int indexSelectedMunicipio = 0;
        
         for (int i = 0; i < NumFilasMunicipio; i++) {
            tablaIdMunicipio[i] = (int) resultadoMunicipio.getValueAt(i, 0);
            tablaNombreMunicipio[i] = (String) resultadoMunicipio.getValueAt(i, 2);
            comboBoxIdMunicipio.addItem(tablaNombreMunicipio[i]);
        }
        this.tablaIdMunicipioClass = new int[NumFilasMunicipio];
        this.tablaIdMunicipioClass = tablaIdMunicipio;
    }
    public frmNMLocalidades(int idLocalidad) {//boton modificar
        initComponents();
        this.idLocalidad = idLocalidad;//se le pone la unica propiedad que es idProducto pero es la unica propiedad que ocupa para poder llamar al metodo GetById() y este metodo lo que hace es poblar las otras propiedades con la informacion de la base de datos
        localidad.setIdLocalidad(idLocalidad);
        localidad.GetById();//recuerda que este metodo lo que hacia era consultar en base de datos y llenar las mismas propiedades de este objeto de la misma clase
        //txtIdMunicipio.setText("" + localidad.getIdMunicipio());
        txtNombreLocalidad.setText(localidad.getNombreLocalidad());
        
        Municipios municipio = new Municipios();
        DefaultTableModel resultadoMunicipio = municipio.GetAllModel();
        int NumFilasMunicipio = resultadoMunicipio.getRowCount();
        int tablaIdMunicipio[];
        tablaIdMunicipio = new int[NumFilasMunicipio];
        String tablaNombreMunicipio[];
        tablaNombreMunicipio = new String[NumFilasMunicipio];
        int indexSelectedMunicipio = 0;
        
          for (int i = 0; i < NumFilasMunicipio; i++) {
            tablaIdMunicipio[i] = (int) resultadoMunicipio.getValueAt(i, 0);
            tablaNombreMunicipio[i] = (String) resultadoMunicipio.getValueAt(i, 1);
            comboBoxIdMunicipio.addItem(tablaNombreMunicipio[i]);
            if (tablaIdMunicipio[i] == localidad.getIdMunicipio()) {
                indexSelectedMunicipio = i;
            }
        }
          comboBoxIdMunicipio.setSelectedIndex(indexSelectedMunicipio);
          this.tablaIdMunicipioClass = new int[NumFilasMunicipio];
          this.tablaIdMunicipioClass = tablaIdMunicipio;
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
        txtNombreLocalidad = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        comboBoxIdMunicipio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre Municipio");

        jLabel2.setText("Nombre Localidad");

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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(64, 64, 64)
                        .addComponent(btnOk))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxIdMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxIdMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnOk))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        if (localidad.getIdLocalidad()> 0) {
       
            //localidad.setIdMunicipio(Integer.parseInt(txtIdMunicipio.getText()));
            int idMunicipio = this.tablaIdMunicipioClass[(int) comboBoxIdMunicipio.getSelectedIndex()];
            localidad.setIdMunicipio(idMunicipio);
            localidad.setNombreLocalidad(txtNombreLocalidad.getText());
            localidad.setActivo(1);
            
            if (localidad.Update()) {
                JOptionPane.showMessageDialog(null, "Localidad actualizada correctamente");
                this.dispose();
            }

        } else {
            int idMunicipio = this.tablaIdMunicipioClass[(int) comboBoxIdMunicipio.getSelectedIndex()];
            if (new Localidades(0,
                    //Integer.parseInt(txtIdMunicipio.getText()),
                    idMunicipio,
                    txtNombreLocalidad.getText(),
                    1).Add()) {
                JOptionPane.showMessageDialog(null, "Localidad agregada correctamente");
                this.dispose();
            } 
        }
    }//GEN-LAST:event_btnOkActionPerformed

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
            java.util.logging.Logger.getLogger(frmNMLocalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNMLocalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNMLocalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNMLocalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmNMLocalidades dialog = new frmNMLocalidades(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> comboBoxIdMunicipio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNombreLocalidad;
    // End of variables declaration//GEN-END:variables
}

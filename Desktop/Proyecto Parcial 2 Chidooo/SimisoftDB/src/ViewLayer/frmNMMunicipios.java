/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;


import BussinesModelLayer.Estados;
import BussinesModelLayer.Municipios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class frmNMMunicipios extends javax.swing.JDialog {
    private int idMunicipio = 0;//boton modificar
    private Municipios municipio = new Municipios();//boton modificar
    private int tablaIdEstadoClass[];
    /**
     * Creates new form frmNMMunicipios
     */
    public frmNMMunicipios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public frmNMMunicipios(){
        initComponents();
        Estados estado = new Estados();
        DefaultTableModel resultadoEstado = estado.GetAllModel();
        int NumFilasEstado = resultadoEstado.getRowCount();
        int tablaIdEstado[];
        tablaIdEstado = new int[NumFilasEstado];
        String tablaNombreEstado[];
        tablaNombreEstado = new String[NumFilasEstado];
        int indexSelectedEstado = 0;
        
        for (int i = 0; i < NumFilasEstado; i++) {
            tablaIdEstado[i] = (int) resultadoEstado.getValueAt(i, 0);
            tablaNombreEstado[i] = (String) resultadoEstado.getValueAt(i, 1);
            comboBoxIdEstado.addItem(tablaNombreEstado[i]);
        }
         this.tablaIdEstadoClass = new int[NumFilasEstado];
         this.tablaIdEstadoClass = tablaIdEstado;
    }
    public frmNMMunicipios(int idMunicipio) {//boton modificar
        initComponents();
        this.idMunicipio = idMunicipio;//se le pone la unica propiedad que es idProducto pero es la unica propiedad que ocupa para poder llamar al metodo GetById() y este metodo lo que hace es poblar las otras propiedades con la informacion de la base de datos
        municipio.setIdMunicipio(idMunicipio);
        municipio.GetById();//recuerda que este metodo lo que hacia era consultar en base de datos y llenar las mismas propiedades de este objeto de la misma clase
        //txtIdEstado.setText("" + municipio.getIdEstado());
        txtNombreMunicipio.setText(municipio.getNombreMunicipio());
        
        Estados estado = new Estados();
        DefaultTableModel resultadoEstado = estado.GetAllModel();
        int NumFilasEstado = resultadoEstado.getRowCount();
        int tablaIdEstado[];
        tablaIdEstado = new int[NumFilasEstado];
        String tablaNombreEstado[];
        tablaNombreEstado = new String[NumFilasEstado];
        int indexSelectedEstado = 0;
        
          for (int i = 0; i < NumFilasEstado; i++) {
            tablaIdEstado[i] = (int) resultadoEstado.getValueAt(i, 0);
            tablaNombreEstado[i] = (String) resultadoEstado.getValueAt(i, 1);
            comboBoxIdEstado.addItem(tablaNombreEstado[i]);
            if (tablaIdEstado[i] == municipio.getIdEstado()) {
                indexSelectedEstado = i;
            }
        }
        comboBoxIdEstado.setSelectedIndex(indexSelectedEstado);
        this.tablaIdEstadoClass = new int[NumFilasEstado];
        this.tablaIdEstadoClass = tablaIdEstado;
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
        txtNombreMunicipio = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();
        comboBoxIdEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre Estado");

        jLabel2.setText("Nombre Municipio");

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
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(77, 77, 77)
                        .addComponent(btnOk))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxIdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxIdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
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
        if (municipio.getIdMunicipio()> 0) {
            //municipio.setIdEstado(Integer.parseInt(txtIdEstado.getText()));
            municipio.setNombreMunicipio(txtNombreMunicipio.getText());
            int idEstado = this.tablaIdEstadoClass[(int) comboBoxIdEstado.getSelectedIndex()];
            municipio.setIdEstado(idEstado);
            municipio.setActivo(1);
            
            if (municipio.Update()) {
                JOptionPane.showMessageDialog(null, "Municipio actualizado correctamente");
                this.dispose();
            }

        } else {
            int idEstado = this.tablaIdEstadoClass[(int) comboBoxIdEstado.getSelectedIndex()];
            if (new Municipios(0,
                   
                     //Integer.parseInt(txtIdEstado.getText()),
                    idEstado,
                    txtNombreMunicipio.getText(),
                    1).Add()) {
                JOptionPane.showMessageDialog(null, "Municipio agregado correctamente");
                this.dispose();
            } else {
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
            java.util.logging.Logger.getLogger(frmNMMunicipios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNMMunicipios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNMMunicipios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNMMunicipios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmNMMunicipios dialog = new frmNMMunicipios(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> comboBoxIdEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNombreMunicipio;
    // End of variables declaration//GEN-END:variables
}

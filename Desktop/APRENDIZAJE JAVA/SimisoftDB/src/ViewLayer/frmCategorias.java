/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import BussinesModelLayer.Categoria;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class frmCategorias extends javax.swing.JInternalFrame {
    /**
     * Creates new form frmCategorias
     */
    public frmCategorias() {
        initComponents();
        jtCategorias.setModel(new Categoria().GetAllModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAsc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCategorias = new javax.swing.JTable();
        txtBuscador = new javax.swing.JTextField();
        btnEjecutar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Categorias");
        setVisible(true);

        jToolBar1.setRollover(true);

        btnActualizar.setText("Actualizar");
        btnActualizar.setFocusable(false);
        btnActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnActualizar);

        btnNuevo.setText("Nuevo");
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNuevo);

        btnModificar.setText("Modificar");
        btnModificar.setFocusable(false);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnModificar);

        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEliminar);

        btnAsc.setText("ASC");
        btnAsc.setFocusable(false);
        btnAsc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAsc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAscActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAsc);

        jtCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtCategorias);

        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyPressed(evt);
            }
        });

        btnEjecutar.setText("Buscar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnEjecutar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEjecutar))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        frmNMCategorias obj = new frmNMCategorias();
        obj.setTitle("Nueva Categoria");
        obj.setModal(true);
        obj.setVisible(true);
        jtCategorias.setModel(new Categoria().GetAllModel());
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (jtCategorias.getSelectedRow() >= 0) {//osea si tengo un renglon seleccionado procedo si no pues no
            int idCategoria = (int) jtCategorias.getValueAt(jtCategorias.getSelectedRow(), 0);//getValueAt es tomar un valor en tal coordenada ¿Cual coordenada? R=el renglon es x y y osea el renglon seleccionado y en la columna cero, osea la primerita que es el idProducto y lo alaceno en la variable de tipo int que se llama idProducto que esta declarada en esta misma linea de codigo
            frmNMCategorias obj = new frmNMCategorias(idCategoria);//le mandamos idProducto
            obj.setTitle("Modificar Categoria");
            obj.setModal(true);
            obj.setVisible(true);
            jtCategorias.setModel(new Categoria().GetAllModel());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar un registro");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Categoria categoria = new Categoria();
         if (jtCategorias.getSelectedRow() >= 0) {//osea si tengo un renglon seleccionado procedo si no pues no
            int idCategoria = (int) jtCategorias.getValueAt(jtCategorias.getSelectedRow(), 0);//getValueAt es tomar un valor en tal coordenada ¿Cual coordenada? R=el renglon es x y y osea el renglon seleccionado y en la columna cero, osea la primerita que es el idProducto y lo alaceno en la variable de tipo int que se llama idProducto que esta declarada en esta misma linea de codigo
            jtCategorias.setModel(new Categoria().GetAllModel());
            categoria.setIdCategoria(idCategoria);
            if (categoria.Delete()) {
                JOptionPane.showMessageDialog(null, "Categoria eliminada correctamente");
                jtCategorias.setModel(new Categoria().GetAllModel());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debes de seleccionar un registro");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAscActionPerformed
        // TODO add your handling code here:
        jtCategorias.setModel(new Categoria().GetAllModelASC());
    }//GEN-LAST:event_btnAscActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        jtCategorias.setModel(new Categoria().GetAllModel());
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtBuscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtBuscadorKeyPressed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        // TODO add your handling code here:
        Categoria categoria = new Categoria();
        if(!"".equals(txtBuscador.getText())){
            categoria.setNombreCategoria(txtBuscador.getText());
            jtCategorias.setModel(categoria.GetByNameAll());// Se utiliza la instancia a la que se le pasa el texto ingresado
        }else {
            JOptionPane.showMessageDialog(null, "Ingrese la categoria, ya que la entrada de busqueda esta vacia");
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAsc;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable jtCategorias;
    private javax.swing.JTextField txtBuscador;
    // End of variables declaration//GEN-END:variables
}

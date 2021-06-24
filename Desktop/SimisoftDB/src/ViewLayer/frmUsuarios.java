/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import BussinesModelLayer.Sucursales;
import BussinesModelLayer.Usuarios;
import javax.swing.JOptionPane;

/**
 *
 * @author mario
 */
public class frmUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmUsuarios
     */
    public frmUsuarios() {
        initComponents();
        jtUsuarios.setModel(new Usuarios().GetAllModel());//conectar a la base de dadtos
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
        btnAscendente = new javax.swing.JButton();
        btnBuscarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuarios = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Usuarios");
        setVisible(true);

        jToolBar1.setFloatable(false);
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

        btnAscendente.setText("ASC");
        btnAscendente.setFocusable(false);
        btnAscendente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAscendente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAscendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAscendenteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAscendente);

        btnBuscarUsuario.setText("Buscar Usuario");
        btnBuscarUsuario.setFocusable(false);
        btnBuscarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscarUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBuscarUsuario);

        jtUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        frmNMUsuario obj= new frmNMUsuario();
        obj.setTitle("Nuevo Usuario");
        obj.setModal(true);
        obj.setVisible(true);
        jtUsuarios.setModel(new Usuarios().GetAllModel());
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if (jtUsuarios.getSelectedRow() >= 0) {//osea si tengo un renglon seleccionado procedo si no pues no
            int idUsuarios = (int) jtUsuarios.getValueAt(jtUsuarios.getSelectedRow(), 0);//getValueAt es tomar un valor en tal coordenada ¿Cual coordenada? R=el renglon es x y y osea el renglon seleccionado y en la columna cero, osea la primerita que es el idProducto y lo alaceno en la variable de tipo int que se llama idProducto que esta declarada en esta misma linea de codigo
            frmNMUsuario obj = new frmNMUsuario(idUsuarios);//le mandamos idProducto
            obj.setTitle("Modificar Usuario");
            obj.setModal(true);
            obj.setVisible(true);
            jtUsuarios.setModel(new Usuarios().GetAllModel());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar un registro");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Usuarios usuario = new Usuarios();
        
        if (jtUsuarios.getSelectedRow() >= 0) {//osea si tengo un renglon seleccionado procedo si no pues no
            int idUsuarios = (int) jtUsuarios.getValueAt(jtUsuarios.getSelectedRow(), 0);//getValueAt es tomar un valor en tal coordenada ¿Cual coordenada? R=el renglon es x y y osea el renglon seleccionado y en la columna cero, osea la primerita que es el idProducto y lo alaceno en la variable de tipo int que se llama idProducto que esta declarada en esta misma linea de codigo
            jtUsuarios.setModel(new Usuarios().GetAllModel());
            usuario.setIdUsuarios(idUsuarios);
            if (usuario.Delete()) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                jtUsuarios.setModel(new Usuarios().GetAllModel());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Debes de seleccionar un registro");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAscendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAscendenteActionPerformed
        // TODO add your handling code here:
        jtUsuarios.setModel(new Usuarios().GetAllModelASC());
    }//GEN-LAST:event_btnAscendenteActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
         jtUsuarios.setModel(new Usuarios().GetAllModel());
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        // TODO add your handling code here:
        frmBuscadorUsuarios buscador = new frmBuscadorUsuarios();
        buscador.setTitle("Buscar Usuario");
        buscador.setModal(true);
        buscador.setVisible(true);
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAscendente;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    public static javax.swing.JTable jtUsuarios;
    // End of variables declaration//GEN-END:variables
}

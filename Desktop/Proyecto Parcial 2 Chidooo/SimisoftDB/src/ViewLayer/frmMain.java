/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;


/**
 *
 * @author mario
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);//hacer que el formulario se inice de forma expandida
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        destokPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnArchivo = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenuItem();
        mnCatalogos = new javax.swing.JMenu();
        btnUsuarios = new javax.swing.JMenuItem();
        btnSucursales = new javax.swing.JMenuItem();
        btnCategorias = new javax.swing.JMenuItem();
        btnClientes = new javax.swing.JMenuItem();
        btnProveedores = new javax.swing.JMenuItem();
        btnLocalidades = new javax.swing.JMenuItem();
        btnMunicipios = new javax.swing.JMenuItem();
        btnEstados = new javax.swing.JMenuItem();
        btnContactos = new javax.swing.JMenuItem();
        btnProductos = new javax.swing.JMenuItem();
        btnProductosProveedores = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout destokPaneLayout = new javax.swing.GroupLayout(destokPane);
        destokPane.setLayout(destokPaneLayout);
        destokPaneLayout.setHorizontalGroup(
            destokPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        destokPaneLayout.setVerticalGroup(
            destokPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mnArchivo.setText("Archivo");
        mnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnArchivoActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        mnArchivo.add(btnSalir);

        jMenuBar1.add(mnArchivo);

        mnCatalogos.setText("Catalogos");

        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnUsuarios);

        btnSucursales.setText("Sucursales");
        btnSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucursalesActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnSucursales);

        btnCategorias.setText("Categorias");
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnCategorias);

        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnClientes);

        btnProveedores.setText("Proveedores");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnProveedores);

        btnLocalidades.setText("Localidades");
        btnLocalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalidadesActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnLocalidades);

        btnMunicipios.setText("Municipios");
        btnMunicipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMunicipiosActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnMunicipios);

        btnEstados.setText("Estados");
        btnEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadosActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnEstados);

        btnContactos.setText("Contactos");
        btnContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactosActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnContactos);

        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnProductos);

        btnProductosProveedores.setText("ProductosProveedores");
        btnProductosProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosProveedoresActionPerformed(evt);
            }
        });
        mnCatalogos.add(btnProductosProveedores);

        jMenuBar1.add(mnCatalogos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(destokPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(destokPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnArchivoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        // TODO add your handling code here:
        frmUsuarios obj = new frmUsuarios();
        destokPane.add(obj);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucursalesActionPerformed
        // TODO add your handling code here:
        frmSucursales obj = new frmSucursales();
        destokPane.add(obj);
    }//GEN-LAST:event_btnSucursalesActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        // TODO add your handling code here:
        frmCategorias obj = new frmCategorias();
        destokPane.add(obj);
    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
        frmClientes obj = new frmClientes();
        destokPane.add(obj);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
        frmProveedores obj= new frmProveedores();
        destokPane.add(obj);
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnLocalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalidadesActionPerformed
        // TODO add your handling code here:
        frmLocalidades obj = new frmLocalidades();
        destokPane.add(obj);
    }//GEN-LAST:event_btnLocalidadesActionPerformed

    private void btnMunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMunicipiosActionPerformed
        // TODO add your handling code here:
        frmMunicipios obj= new frmMunicipios();
        destokPane.add(obj);
    }//GEN-LAST:event_btnMunicipiosActionPerformed

    private void btnEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadosActionPerformed
        // TODO add your handling code here:
        frmEstados obj = new frmEstados();
        destokPane.add(obj);
    }//GEN-LAST:event_btnEstadosActionPerformed

    private void btnContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactosActionPerformed
        // TODO add your handling code here:
        frmContactos obj = new frmContactos();
        destokPane.add(obj);
    }//GEN-LAST:event_btnContactosActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
       frmProductos obj = new frmProductos();
       destokPane.add(obj);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnProductosProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosProveedoresActionPerformed
        // TODO add your handling code here:
        frmProductosProveedores obj = new frmProductosProveedores();
        destokPane.add(obj);
    }//GEN-LAST:event_btnProductosProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCategorias;
    private javax.swing.JMenuItem btnClientes;
    private javax.swing.JMenuItem btnContactos;
    private javax.swing.JMenuItem btnEstados;
    private javax.swing.JMenuItem btnLocalidades;
    private javax.swing.JMenuItem btnMunicipios;
    private javax.swing.JMenuItem btnProductos;
    private javax.swing.JMenuItem btnProductosProveedores;
    private javax.swing.JMenuItem btnProveedores;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuItem btnSucursales;
    private javax.swing.JMenuItem btnUsuarios;
    private javax.swing.JDesktopPane destokPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu mnArchivo;
    private javax.swing.JMenu mnCatalogos;
    // End of variables declaration//GEN-END:variables
}

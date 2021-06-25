/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import BussinesModelLayer.Productos;
import BussinesModelLayer.ProductosProveedores;
import BussinesModelLayer.Proveedores;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mario
 */
public class frmProductosProveedores extends javax.swing.JInternalFrame {

private int tablaIdProductoClass[];
private int tablaIdProveedoresClass[];
ProductosProveedores productosProveedores = new ProductosProveedores();

    /**
     * Creates new form frmProductosProveedores
     */
    public frmProductosProveedores() {
        //private Productos producto = new Productos();
        initComponents();
        setBounds(440, 130, 500, 400);
        jtablaProductosProveedores.setModel(new ProductosProveedores().GetByNameId());
        //private int tablaIdCategoriaClass[];
//  
        Productos productos = new Productos();
        DefaultTableModel resultadoProducto = productos.GetAllModel();
        int NumFilasProducto = resultadoProducto.getRowCount();
        int tablaIdProducto[];
        tablaIdProducto = new int[NumFilasProducto];
        String tablaNombreProducto[];
        tablaNombreProducto = new String[NumFilasProducto];
        int indexSelectedProducto = 0;
        
        for (int i = 0; i < NumFilasProducto; i++) {
            tablaIdProducto[i] = (int) resultadoProducto.getValueAt(i, 0);
            tablaNombreProducto[i] = (String) resultadoProducto.getValueAt(i, 1);
            comboBoxIdProducto.addItem(tablaNombreProducto[i]);
//            if (tablaIdProducto[i] == productos.getIdProducto()) {
//                indexSelectedProducto = i;
//            }
        }
//        comboBoxIdProducto.setSelectedIndex(indexSelectedProducto);
        this.tablaIdProductoClass = new int[NumFilasProducto];
        this.tablaIdProductoClass = tablaIdProducto;
        
        
        Proveedores proveedor = new Proveedores();
        DefaultTableModel resultadoProveedores = proveedor.GetAllModel();
        int NumFilasProveedores = resultadoProveedores.getRowCount();
        int tablaIdProveedor[];
        tablaIdProveedor = new int[NumFilasProveedores];
        String tablaNombreProveedores[];
        tablaNombreProveedores = new String[NumFilasProveedores];
        int indexSelectedProveedor = 0;
        
        for (int i = 0; i < NumFilasProveedores; i++) {
            tablaIdProveedor[i] = (int) resultadoProveedores.getValueAt(i, 0);
            tablaNombreProveedores[i] = (String) resultadoProveedores.getValueAt(i, 1);
            comboBoxIdProveedores.addItem(tablaNombreProveedores[i]);
//            if (tablaIdProveedor[i] == proveedor.getIdProveedor()) {
//                indexSelectedProveedor = i;
//            }
        }
//        comboBoxIdProveedores.setSelectedIndex(indexSelectedProveedor);
        this.tablaIdProveedoresClass = new int[NumFilasProveedores];
        this.tablaIdProveedoresClass = tablaIdProveedor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaProductosProveedores = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxIdProducto = new javax.swing.JComboBox<>();
        comboBoxIdProveedores = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ProductosProveedores");
        setVisible(true);

        jtablaProductosProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtablaProductosProveedores);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Producto");

        jLabel2.setText("Proveedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(comboBoxIdProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxIdProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        //frmProductos.jtProductos.setModel(producto.GetByNameAll());
        int idProducto = this.tablaIdProductoClass[(int) comboBoxIdProducto.getSelectedIndex()];
        int idProveedor = this.tablaIdProveedoresClass[(int) comboBoxIdProveedores.getSelectedIndex()];
        productosProveedores.setIdProducto(idProducto);
        productosProveedores.setIdProveedor(idProveedor);
        if (idProducto!=0 && idProveedor!=0){
        productosProveedores.Add();
        jtablaProductosProveedores.setModel(new ProductosProveedores().GetByNameId());
        }else{
            JOptionPane.showMessageDialog(null, "Elige un producto y un proveedor");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboBoxIdProducto;
    private javax.swing.JComboBox<String> comboBoxIdProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablaProductosProveedores;
    // End of variables declaration//GEN-END:variables
}
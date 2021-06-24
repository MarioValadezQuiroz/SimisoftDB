package BussinesModelLayer;

import DataAccessLayer.DataAccess;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class ProductosProveedores {
    private DataAccess dataAccess = DataAccess.Instance();
    private int idProductoProveedor;
    private int idProveedor;
    private int idProducto;
    
    public ProductosProveedores(){
    
    }

    public DataAccess getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getIdProductoProveedor() {
        return idProductoProveedor;
    }

    public void setIdProductoProveedor(int idProductoProveedor) {
        this.idProductoProveedor = idProductoProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
     public DefaultTableModel GetAllModel() {
        String query = "SELECT * FROM ProductosProveedores";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
     
     public void GetById() {
        String query = "SELECT * FROM ProductosProveedores WHERE idProductoProveedor = " + idProductoProveedor;
        DefaultTableModel res = dataAccess.Query(query);
        //Poblo
        idProductoProveedor = (int) res.getValueAt(0, 0);
        idProveedor = (int) res.getValueAt(0, 1);
        idProducto = (int) res.getValueAt(0, 2);
        //activo=(int)res.getValueAt(0, 6);
    }
     
     public boolean Add() {//metodo para agregar
        String query = "INSERT INTO ProductosProveedores(idProveedor, idProducto) "
                + "VALUES (" + idProveedor + "," + idProducto + ");";
        return dataAccess.Execute(query) >= 1;
    }
     
     public boolean Delete() {//metodo para borrar
        String query = "DELETE FROM ProductosProveedores WHERE idProductoProveedor = " + idProductoProveedor;
        return dataAccess.Execute(query) >= 1;
    }
     
       public boolean Update() {//METODO PARA ACTUALIZAR UN REGISTRO
        String query = "UPDATE ProductosProveedores SET "
                + "idProveedor= " + idProveedor + ", "
                + "idProducto = " + idProducto + " "
                + //"activo = " + activo + " " +
                "WHERE idProductoProveedor = " + idProductoProveedor;
        return dataAccess.Execute(query) >= 1;
    }
       public DefaultTableModel GetByNameId() {
        String query ="SELECT Productos.nombreProducto, Proveedores.nombreProveedor FROM Productos JOIN productosProveedores ON Productos.idProducto= productosProveedores.idProducto JOIN Proveedores ON Proveedores.idProveedor=productosProveedores.idProveedor";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
}







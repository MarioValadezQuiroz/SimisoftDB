package BussinesModelLayer;

import DataAccessLayer.DataAccess;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class Proveedores {
    private DataAccess dataAccess = DataAccess.Instance();
    private int idProveedor;
    private String nombreProveedor;
    private int idContacto;
    private int activo;

    public Proveedores() {
    }

    public Proveedores(int idProveedor, String nombreProveedor, int idContacto, int activo) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.idContacto = idContacto;
        this.activo = activo;
    }

    public DataAccess getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }
    
    public DefaultTableModel GetAllModel() { 
        String query = "SELECT * FROM Proveedores";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
    public void GetById() {
        String query = "SELECT * FROM Proveedores WHERE idProveedor = " + idProveedor;
        DefaultTableModel res = dataAccess.Query(query);
        //Poblo
        idProveedor = (int) res.getValueAt(0, 0);
        nombreProveedor = (String) res.getValueAt(0, 1);
        idContacto = (int) res.getValueAt(0, 2);
//        activo = (int) res.getValueAt(0, 3);
    }
     public boolean Add() {//metodo para agregar
        String query = "INSERT INTO Proveedores(nombreProveedor, idContacto, activo) "
                + "VALUES ('" + nombreProveedor + "'," + idContacto + "," + activo + ");";
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Delete() {//metodo para borrar
        String query = "DELETE FROM Proveedores WHERE idProveedor = " + idProveedor;
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Update() {//METODO PARA ACTUALIZAR UN REGISTRO
        String query = "UPDATE Proveedores SET "
                + "nombreProveedor= '" + nombreProveedor + "', "
                + "idContacto = " + idContacto + ", "
                + "activo = " + activo + " "
                + "WHERE idProveedor = " + idProveedor;
        return dataAccess.Execute(query) >= 1;
    }
    
    public DefaultTableModel GetAllModelASC() {
        String query = "SELECT * FROM Proveedores ORDER BY nombreProveedor ASC;";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
    
     public DefaultTableModel GetByNameAll() {
        String query = "SELECT * FROM Proveedores WHERE nombreProveedor LIKE '"
                +nombreProveedor+"%';";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
}

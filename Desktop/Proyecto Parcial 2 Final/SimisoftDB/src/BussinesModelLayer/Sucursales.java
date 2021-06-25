package BussinesModelLayer;

import DataAccessLayer.DataAccess;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class Sucursales {
    private DataAccess dataAccess = DataAccess.Instance();//Acceso a la instancia de DataAccess, Esta es la clase del paquete de negocio ocupamos accesso, entonces como esta clase es del paquete negocio entonces negocio si puede tener accesso a datos
    private int idSucursal;
    private String nombreSucursal;
    private int idContacto;
    private int activo;

    public Sucursales() {
    }

    public Sucursales(int idSucursal, String nombreSucursal, int idContacto, int activo) {
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.idContacto = idContacto;
        this.activo = activo;
    }

    public DataAccess getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
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
        String query = "SELECT * FROM Sucursales";
        return dataAccess.Query(query); 
    }
    public void GetById() {
        String query = "SELECT * FROM Sucursales WHERE idSucursal = " + idSucursal;
        DefaultTableModel res = dataAccess.Query(query);
        //Poblo
        idSucursal = (int) res.getValueAt(0, 0);
        nombreSucursal = (String) res.getValueAt(0, 1);
        idContacto = (int) res.getValueAt(0, 2);
        //activo = (int) res.getValueAt(0, 3);
    }
     public boolean Add() {//metodo para agregar
        String query = "INSERT INTO Sucursales(nombreSucursal, idContacto, activo) "
                + "VALUES ('" + nombreSucursal +"'," + idContacto + "," + activo + ");";
        return dataAccess.Execute(query) >= 1;
    }
     public boolean Delete() {//metodo para borrar
        String query = "DELETE FROM Sucursales WHERE idSucursal = " + idSucursal;
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Update() {//METODO PARA ACTUALIZAR UN REGISTRO
        String query = "UPDATE Sucursales SET "
                + "nombreSucursal= '" + nombreSucursal + "', "
                + "idContacto = " + idContacto + ", "
                + "activo = " + activo + " "
                + "WHERE idSucursal = " + idSucursal;
        return dataAccess.Execute(query) >= 1;
    }
    public DefaultTableModel GetAllModelASC() {
        String query = "SELECT * FROM Sucursales ORDER BY nombreSucursal ASC;";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
    
    public DefaultTableModel GetByNameAll() {
        String query = "SELECT * FROM Sucursales WHERE nombreSucursal LIKE '"
                +nombreSucursal+"%';";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
}

package BussinesModelLayer;

import DataAccessLayer.DataAccess;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class Municipios {
    private DataAccess dataAccess = DataAccess.Instance();
    private int idMunicipio;
    private int idEstado;
    private String nombreMunicipio;
    private int activo;

    public Municipios() {
    }

    public Municipios(int idMunicipio, int idEstado, String nombreMunicipio, int activo) {
        this.idMunicipio = idMunicipio;
        this.idEstado = idEstado;
        this.nombreMunicipio = nombreMunicipio;
        this.activo = activo;
    }

    public DataAccess getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    
    
     public DefaultTableModel GetAllModel() {
        String query = "SELECT * FROM Municipios";
        return dataAccess.Query(query); 
    }
     public void GetById() {
        String query = "SELECT * FROM Municipios WHERE idMunicipio = " + idMunicipio;
        DefaultTableModel res = dataAccess.Query(query);
        //Poblo
        idMunicipio = (int) res.getValueAt(0, 0);
        idEstado = (int) res.getValueAt(0, 1);
        nombreMunicipio = (String) res.getValueAt(0, 2);
        //activo=(int)res.getValueAt(0, 3);
    }
    public boolean Add() {//metodo para agregar
        String query = "INSERT INTO Municipios(nombreMunicipio, idEstado) "
                + "VALUES ('" + nombreMunicipio + "'," + idEstado + ");";
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Delete() {//metodo para borrar
        String query = "DELETE FROM Municipios WHERE idMunicipio = " + idMunicipio;//Aqui se hizo una cosulta como la anterior pero este es para borrar
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Update() {//METODO PARA ACTUALIZAR UN REGISTRO
        String query = "UPDATE Municipios SET "
                + "nombreMunicipio= '" + nombreMunicipio + "', "
                + "idEstado = " + idEstado + " "
                + //"activo = " + activo + " " +
                "WHERE idMunicipio = " + idMunicipio;
        return dataAccess.Execute(query) >= 1;
    }
    
    public DefaultTableModel GetAllModelASC() {
        String query = "SELECT * FROM Municipios ORDER BY nombreMunicipio ASC;";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
    
    public DefaultTableModel GetByNameAll() {
        String query = "SELECT * FROM Municipios WHERE nombreMunicipio LIKE '"
                +nombreMunicipio+"%';";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
    
}

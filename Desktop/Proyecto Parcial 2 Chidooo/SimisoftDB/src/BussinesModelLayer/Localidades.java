package BussinesModelLayer;

import DataAccessLayer.DataAccess;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class Localidades {
    private DataAccess dataAccess = DataAccess.Instance();
    private int idLocalidad;
    private int idMunicipio;
    private String nombreLocalidad;
    private int activo;

    public Localidades() {
    }
    

    public Localidades(int idLocalidad, int idMunicipio, String nombreLocalidad, int activo) {
        this.idLocalidad = idLocalidad;
        this.idMunicipio = idMunicipio;
        this.nombreLocalidad = nombreLocalidad;
        this.activo = activo;
    }

    public DataAccess getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }


    public DefaultTableModel GetAllModel() {
        String query = "SELECT * FROM Localidades";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
     public void GetById() {
        String query = "SELECT * FROM Localidades WHERE idLocalidad = " + idLocalidad;
        DefaultTableModel res = dataAccess.Query(query);
        //Poblo
        idLocalidad = (int) res.getValueAt(0, 0);
        idMunicipio = (int) res.getValueAt(0, 1);
        nombreLocalidad = (String) res.getValueAt(0, 2);
        
        //activo=(int)res.getValueAt(0, 3);
    }
    public boolean Add() {//metodo para agregar
        String query = "INSERT INTO Localidades(idMunicipio, nombreLocalidad) "
                + "VALUES (" + idMunicipio + ",'" + nombreLocalidad + "');";
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Delete() {//metodo para borrar
        String query = "DELETE FROM Localidades WHERE idLocalidad = " + idLocalidad;
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Update() {//METODO PARA ACTUALIZAR UN REGISTRO
        String query = "UPDATE Localidades SET "
                + "idMunicipio = " + idMunicipio + ", "
                + "nombreLocalidad= '" + nombreLocalidad + "' "
                +// "activo = " + activo + " " +
                "WHERE idLocalidad = " + idLocalidad;
        return dataAccess.Execute(query) >= 1;
    }
    
    public DefaultTableModel GetAllModelASC() {
        String query = "SELECT * FROM Localidades ORDER BY nombreLocalidad ASC;";
        return dataAccess.Query(query);
    }
    
      public DefaultTableModel GetByNameAll() {
        String query = "SELECT * FROM Localidades WHERE nombreLocalidad LIKE '"
                +nombreLocalidad+"%';";
        return dataAccess.Query(query); 
    }
}

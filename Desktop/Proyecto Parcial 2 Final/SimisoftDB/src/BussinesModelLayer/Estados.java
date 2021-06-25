package BussinesModelLayer;//

import DataAccessLayer.DataAccess;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class Estados {
    private DataAccess dataAccess = DataAccess.Instance();
    private int idEstado;
    private String nombreEstado;
    private int activo;

    public Estados() {
    }

    public Estados(int idEstado, String nombreEstado, int activo) {
        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
        this.activo = activo;
    }

    public DataAccess getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    
    public DefaultTableModel GetAllModel() {
        String query = "SELECT * FROM Estados";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
    public void GetById() {
        String query = "SELECT * FROM Estados WHERE idEstado = " + idEstado;
        DefaultTableModel res = dataAccess.Query(query);
        //Poblo 
        idEstado = (int) res.getValueAt(0, 0);
        nombreEstado = (String) res.getValueAt(0, 1);
        //activo=(int)res.getValueAt(0, 2);
    }
    public boolean Add() {//metodo para agregar
        //INSERT INTO TABLA(CAMPO1, CAMPO2) VALUES(VALOR1, VALOR2); ASI QUEDARIA LA SENTENCIA
        String query = "INSERT INTO Estados(nombreEstado) "
                + "VALUES ('" + nombreEstado + "');";
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Delete() {//metodo para borrar
        String query = "DELETE FROM Estados WHERE idEstado = " + idEstado;
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Update() {//METODO PARA ACTUALIZAR UN REGISTRO
        String query = "UPDATE Estados SET nombreEstado='"
                + nombreEstado
                +"' WHERE idEstado="
                + idEstado;
                 //"activo = " + activo + " " +
                
        return dataAccess.Execute(query) >= 1;
    }
    
    public DefaultTableModel GetAllModelASC() {
        String query = "SELECT * FROM Estados ORDER BY nombreEstado ASC;";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
    
      public DefaultTableModel GetByNameAll() {
        String query = "SELECT * FROM Estados WHERE nombreEstado LIKE '"
                +nombreEstado+"%';";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
}

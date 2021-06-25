package BussinesModelLayer;

import DataAccessLayer.DataAccess;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class Categoria {
    private DataAccess dataAccess = DataAccess.Instance();//importar dataAccess
    private int idCategoria;
    private String nombreCategoria;
    private int activo;

    public Categoria() {
    }
    

    public Categoria(int idCategoria, String nombreCategoria, int activo) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.activo = activo;
    }

    public DataAccess getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }


     public DefaultTableModel GetAllModel() { 
        String query = "SELECT * FROM Categorias";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
    public void GetById() {
        String query = "SELECT * FROM Categorias WHERE idCategoria = " + idCategoria;
        DefaultTableModel res = dataAccess.Query(query);
        //Poblo
        idCategoria = (int) res.getValueAt(0, 0);
        nombreCategoria = (String) res.getValueAt(0, 1);
        //activo = (int) res.getValueAt(0, 2);
    }
    public boolean Add() {//metodo para agregar
        
        //INSERT INTO TABLA(CAMPO1, CAMPO2) VALUES(VALOR1, VALOR2); ASI QUEDARIA LA SENTENCIA
        String query = "INSERT INTO Categorias(nombreCategoria, activo) "
                + "VALUES ('" + nombreCategoria + "'," + activo + ");";
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Delete() {//metodo para borrar
        String query = "DELETE FROM Categorias WHERE idCategoria = " + idCategoria;
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Update() {//METODO PARA ACTUALIZAR UN REGISTRO
        String query = "UPDATE Categorias SET "
                + "nombreCategoria= '" + nombreCategoria + "', "
                + "activo = " + activo + " "
                + "WHERE idCategoria = " + idCategoria;
        return dataAccess.Execute(query) >= 1;
    }
    
   public DefaultTableModel GetAllModelASC() {
        String query = "SELECT * FROM Categorias ORDER BY nombreCategoria ASC;";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
   
   public DefaultTableModel GetByNameAll() {
        String query = "SELECT * FROM Categorias WHERE nombreCategoria LIKE '"
                +nombreCategoria+"%';";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
    
}

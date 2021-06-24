package BussinesModelLayer;

import DataAccessLayer.DataAccess;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class Clientes {
    private DataAccess dataAccess = DataAccess.Instance();
    private int idCliente;
    private String nombreCliente;
    private int idContacto;
    private int activo;

    public Clientes() {
    }

    public Clientes(int idCliente, String nombreCliente, int idContacto, int activo) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.idContacto = idContacto;
        this.activo = activo;
    }

    public DataAccess getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
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
        String query = "SELECT * FROM Clientes";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
    public void GetById() {
        String query = "SELECT * FROM Clientes WHERE idCliente = " + idCliente;
        DefaultTableModel res = dataAccess.Query(query);
        //Poblo
        idCliente = (int) res.getValueAt(0, 0);
        nombreCliente = (String) res.getValueAt(0, 1);
        idContacto = (int) res.getValueAt(0, 2);
        //activo = (int) res.getValueAt(0, 3);
    }
    public boolean Add() {//metodo para agregar
        //INSERT INTO TABLA(CAMPO1, CAMPO2) VALUES(VALOR1, VALOR2); ASI QUEDARIA LA SENTENCIA
        String query = "INSERT INTO Clientes(nombreCliente, idContacto, activo) "
                + "VALUES ('" + nombreCliente + "'," + idContacto + ", " + activo + ");";
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Delete() {//metodo para borrar
        String query = "DELETE FROM Clientes WHERE idCliente = " + idCliente;//Aqui se hizo una cosulta como la anterior pero este es para borrar
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Update() {//METODO PARA ACTUALIZAR UN REGISTRO
        String query = "UPDATE Clientes SET "
                + "nombreCliente= '" + nombreCliente + "', "
                + "idContacto = " + idContacto + ", "
                + "activo = " + activo + " "
                + "WHERE idCliente = " + idCliente;
        return dataAccess.Execute(query) >= 1;
    }
    
    public DefaultTableModel GetAllModelASC() {
        String query = "SELECT * FROM Clientes ORDER BY nombreCliente ASC;";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
    
      public DefaultTableModel GetByNameAll() {
        String query = "SELECT * FROM Clientes WHERE nombreCliente LIKE '"
                +nombreCliente+"%';";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
}

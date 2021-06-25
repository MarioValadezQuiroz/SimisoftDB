package BussinesModelLayer;

import DataAccessLayer.DataAccess;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class Contactos {
    private DataAccess dataAccess = DataAccess.Instance();
    private int idContacto;
    private String entidad;
    private String comuna;
    private String calle;
    private int codigoPostal;
    private String telefono;
    private int activo;
    
    public Contactos(){
    
    }

    public Contactos(int idContacto, String entidad, String comuna, String calle, int codigoPostal, String telefono, int activo) {
        this.idContacto = idContacto;
        this.entidad = entidad;
        this.comuna = comuna;
        this.calle = calle;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.activo = activo;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int isActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }
     public DefaultTableModel GetAllModel() {
        String query = "SELECT * FROM Contactos";
        return dataAccess.Query(query);
    }
    public void GetById() {
        String query = "SELECT * FROM Contactos WHERE idContacto = " + idContacto;
        DefaultTableModel res = dataAccess.Query(query);
        //Poblo
        idContacto = (int) res.getValueAt(0, 0);
        entidad = (String) res.getValueAt(0, 1);
        comuna = (String) res.getValueAt(0, 2);
        calle = (String) res.getValueAt(0, 3);
        codigoPostal = (int) res.getValueAt(0, 4);
        telefono = (String) res.getValueAt(0, 5);
        //activo=(int)res.getValueAt(0, 6);
    }
    public boolean Add() {//metodo para agregar
        //INSERT INTO TABLA(CAMPO1, CAMPO2) VALUES(VALOR1, VALOR2); ASI QUEDARIA LA SENTENCIA
        String query = "INSERT INTO Contactos(entidad, comuna, calle, codigoPostal, telefono) "
                + "VALUES ('" + entidad + "','" + comuna + "','" + calle + "'," + codigoPostal + ",'" + telefono + "');";
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Delete() {//metodo para borrar
        String query = "DELETE FROM Contactos WHERE idContacto = " + idContacto;
        return dataAccess.Execute(query) >= 1;
    }
    public boolean Update() {//METODO PARA ACTUALIZAR UN REGISTRO
        String query = "UPDATE Contactos SET "
                + "entidad= '" + entidad + "', "
                + "comuna = '" + comuna + "', "
                + "calle = '" + calle + "', "
                + "codigoPostal = " + codigoPostal + ", "
                + "telefono = '" + telefono + "' "
                + //"activo = " + activo + " " +
                "WHERE idContacto = " + idContacto;
        return dataAccess.Execute(query) >= 1;
    }
    
    public DefaultTableModel GetAllModelASC() {
        String query = "SELECT * FROM Contactos ORDER BY comuna ASC;";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
      public DefaultTableModel GetByNameAll() {
         String query = "SELECT * FROM Contactos WHERE comuna LIKE '"
                +comuna+"%';";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
}

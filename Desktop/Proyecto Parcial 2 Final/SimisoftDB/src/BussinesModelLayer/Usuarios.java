package BussinesModelLayer;

import DataAccessLayer.DataAccess;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class Usuarios {
    private DataAccess dataAccess = DataAccess.Instance();
    private int idUsuarios;
    private String nombre;
    private String tipoUsuario;
    private String usuario;
    private String password;
    private int idSucursal;
    private int idContacto;
    private int activo;

    public Usuarios() {
    }

    public Usuarios(int idUsuarios, String nombre, String tipoUsuario, String usuario, String password, int idSucursal, int idContacto, int activo) {
        this.idUsuarios = idUsuarios;
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
        this.usuario = usuario;
        this.password = password;
        this.idSucursal = idSucursal;
        this.idContacto = idContacto;
        this.activo = activo;
    }

    public DataAccess getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
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
        String query = "SELECT * FROM Usuarios";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
   public void GetById() {
        String query = "SELECT * FROM Usuarios WHERE idUsuarios = " + idUsuarios;
        DefaultTableModel res = dataAccess.Query(query);
        //Poblo
        idUsuarios = (int) res.getValueAt(0, 0);
        nombre = (String) res.getValueAt(0, 1);
        tipoUsuario=(String)res.getValueAt(0, 2);
        usuario=(String)res.getValueAt(0, 3);
        password=(String)res.getValueAt(0, 4);
        idSucursal = (int) res.getValueAt(0, 5);
        idContacto = (int) res.getValueAt(0, 6);
       // activo= (int)res.getValueAt(0, 7);
       
     
    }
   public boolean Add() {//metodo para agregar
        String query = "INSERT INTO Usuarios(nombre, tipoUsuario, usuario,  password, idSucursal, idContacto, activo) "
                + "VALUES ('" + nombre + "',' " + tipoUsuario + "',' " + usuario + "',' " + password + "', " + idSucursal + " , " + idContacto + ", "+ activo + ");";
        return dataAccess.Execute(query) >= 1;
    }
   public boolean Delete() {//metodo para borrar
        String query = "DELETE FROM Usuarios WHERE idUsuarios = " + idUsuarios;//Aqui se hizo una cosulta como la anterior pero este es para borrar
        return dataAccess.Execute(query) >= 1;
    }
   public boolean Update() {//METODO PARA ACTUALIZAR UN REGISTRO
        String query = "UPDATE Usuarios SET "
                + "nombre = '" + nombre + "', "
                + "tipoUsuario = '" + tipoUsuario + "', "
                + "usuario = '" + usuario + "', "
                +"password = '" + password + "', "
                + "idSucursal = " + idSucursal + ", "
                + "idContacto = " + idContacto + " "+
                //+ "activo = " + activo + " " +
                "WHERE idUsuarios = " + idUsuarios;
        return dataAccess.Execute(query) >= 1;
    }
    public DefaultTableModel GetAllModelASC() {
        String query = "SELECT * FROM Usuarios ORDER BY nombre ASC;";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
    
     public DefaultTableModel GetByNameAll() {
        String query = "SELECT * FROM Usuarios WHERE nombre LIKE '"
                +nombre+"%';";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
   
}

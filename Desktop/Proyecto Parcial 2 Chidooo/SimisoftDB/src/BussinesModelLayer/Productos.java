package BussinesModelLayer;

import DataAccessLayer.DataAccess;
import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author mario
 */
public class Productos {

    private DataAccess dataAccess = DataAccess.Instance();
    private int idProducto;
    private String nombreProducto;
    private Date caducidad;
    private BigDecimal precio;
    private BigDecimal descuento;
    private int idCategoria;
    private boolean activo;

    public Productos() {
    }

    public Productos(int idProducto, String nombreProducto, Date caducidad, BigDecimal precio, BigDecimal descuento, int idCategoria, boolean activo) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.caducidad = caducidad;
        this.precio = precio;
        this.descuento = descuento;
        this.idCategoria = idCategoria;
        this.activo = activo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public DefaultTableModel GetAllModel() { 
        String query = "SELECT * FROM Productos";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }

    public void GetById() {
        String query = "SELECT * FROM Productos WHERE idProducto = " + idProducto;
        DefaultTableModel res = dataAccess.Query(query); 
        //Poblo
        idProducto = (int) res.getValueAt(0, 0);
        nombreProducto = (String) res.getValueAt(0, 1);
        caducidad = (Date) res.getValueAt(0, 2);
        precio = (BigDecimal) res.getValueAt(0, 3);
        descuento = (BigDecimal) res.getValueAt(0, 4);
        idCategoria = (int) res.getValueAt(0, 5);
        activo = (boolean) res.getValueAt(0, 6);
    }

    public boolean Add() {//metodo para agregar
        //INSERT INTO TABLA(CAMPO1, CAMPO2) VALUES(VALOR1, VALOR2); ASI QUEDARIA LA SENTENCIA
        String query = "INSERT INTO Productos(nombreProducto, caducidad, precio, descuento, idCategoria, activo) "//sentencia para insertar valores, por lo cual se inserto el nombre, csducidada, stock, idFarmacia y activo
                + "VALUES ('" + nombreProducto + "','" + caducidad + "'," + precio + "," + descuento + "," + idCategoria + "," + ((activo) ? 1 : 0) + ");";// dentro de paerntesis coloco los valores que le quiero meter, para meter valores String se le pone un apostrofe, para meter valores numericos se le pone tal cual, pero como el primero va hacer el nombre pues es String asi que se le pone solo un apostrofe, depues sigue caducidad ese tambien va con apostrofe, despues sigue stock ese va tal cual sin apostrofe
        return dataAccess.Execute(query) >= 1;
    }

    public boolean Delete() {//metodo para borrar
        String query = "DELETE FROM Productos WHERE idProducto = " + idProducto;//Aqui se hizo una cosulta como la anterior pero este es para borrar
        return dataAccess.Execute(query) >= 1;
    }

    public boolean Update() {//METODO PARA ACTUALIZAR UN REGISTRO
       
        String query = "UPDATE Productos SET "
                + "nombreProducto= '" + nombreProducto + "', "
                + "caducidad = '" + caducidad + "', "
                + "precio = " + precio + ", "
                + "descuento = " + descuento + ", "
                + "idCategoria = " + idCategoria + ", "
                + "activo = " + ((activo) ? 1 : 0) + " "
                + "WHERE idProducto = " + idProducto + ";";
        return dataAccess.Execute(query) >= 1;
    }

    public DefaultTableModel GetAllModelASC() {
        String query = "SELECT * FROM Productos ORDER BY nombreProducto ASC;";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }

    public DefaultTableModel GetByNameAll() {
        String query = "SELECT * FROM Productos WHERE nombreProducto LIKE '"
                + nombreProducto + "%';";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
}

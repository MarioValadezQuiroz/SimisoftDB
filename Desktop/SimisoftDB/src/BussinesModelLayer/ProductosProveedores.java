package BussinesModelLayer;

import DataAccessLayer.DataAccess;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class ProductosProveedores {
    private DataAccess dataAccess = DataAccess.Instance();
    private int idProductoProveedor;
    private int idProveedor;
    private int idProducto;
    
    public ProductosProveedores(){
    
    }

    public DataAccess getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(DataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    public int getIdProductoProveedor() {
        return idProductoProveedor;
    }

    public void setIdProductoProveedor(int idProductoProveedor) {
        this.idProductoProveedor = idProductoProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
     public DefaultTableModel GetAllModel() {
        String query = "SELECT * FROM ProductosProveedores";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
     
     public void GetById() {//Creamos otro metodo que ocuapremos para obtener un solo producto que es obtener por Id
        String query = "SELECT * FROM ProductosProveedores WHERE idProductoProveedor = " + idProductoProveedor;//Es una consulta para obtener un solo registro de la tabla de productos, siempre y cuando el id del producto corresponda al que yo le voy a mandar como parametro; entonces la variable o propiedad idProducto ya esta declarada al inicio de la clase y tambien se encuentra dentro del constructor, entonces esa propiedad la tomo y se la mando como parametro a la consulta
        DefaultTableModel res = dataAccess.Query(query);//se ejecuta la linea anterior con el defaultTableModel ya que el metodo query de dataAccess me retorna un tableModel osea una tabla en memoria, pero siempre va a traer un registro en este caso, por eso siempre va a llevar un cero en el primer renglon en la larte de POBLO 
        //Poblo ya que esto significa alimentar o llenar con valores de una consulta a las propiedades del objeto, osea de lo que traigo de la base de datos aca a los atributos; entonces lo que se hace es alimentar esta entidad bueno en mi caso de que ya se cree el objeto, estoy alimentando el objeto con la informacion de la base de datos y ese mismo objeto que yo cree es el que trae toda la info//entonces aqui es como ponerle los titulos a la tabla de productos osea en el mismo reglon pero todos en cada columna
        idProductoProveedor = (int) res.getValueAt(0, 0);//Aqui siempre seria en el renglon cero ¿Porque? porque en la primer linea dentro de el metodoGetById yo me estoy asegurando que esa consulta me retorne un solo registro si o si
        idProveedor = (int) res.getValueAt(0, 1);
        idProducto = (int) res.getValueAt(0, 2);
        //activo=(int)res.getValueAt(0, 6);
    }
     
     public boolean Add() {//metodo para agregar
        //recordemos que un CRUD son todas las acciones sobre una entidad, las cuatro principales que son insertar, eliminar, modificar y actualizar
        //INSERT INTO TABLA(CAMPO1, CAMPO2) VALUES(VALOR1, VALOR2); ASI QUEDARIA LA SENTENCIA
        String query = "INSERT INTO ProductosProveedores(idProveedor, idProducto) "//sentencia para insertar valores, por lo cual se inserto el nombre, csducidada, stock, idFarmacia y activo
                + "VALUES (" + idProveedor + "," + idProducto + ");";// dentro de paerntesis coloco los valores que le quiero meter, para meter valores String se le pone un apostrofe, para meter valores numericos se le pone tal cual, pero como el primero va hacer el nombre pues es String asi que se le pone solo un apostrofe, depues sigue caducidad ese tambien va con apostrofe, despues sigue stock ese va tal cual sin apostrofe
        return dataAccess.Execute(query) >= 1;//retornamos siempre y cuando sea mayor a 1, osea el metodo va a regresar un booleano, el metodo de Execute como nosotros lo programamos en DataAccess me va a retornar "1 mas" si tuvo efecto la instruccion, por ejemplo un INSERT me regresa "1 o mas" si inserto mas de un valor eso quiere decir que si funciono, entonces si fue mayor o igual a 1 entonces es que si funciono, entonces me regresa un true osea la insercion fue correcta, ahora si hubo un error en la sentencia me va a regresar un cero y cero no es mayor o igual a 1 entonces regresa un false entonces ocurre un error
    }
     
     public boolean Delete() {//metodo para borrar
        String query = "DELETE FROM ProductosProveedores WHERE idProductoProveedor = " + idProductoProveedor;//Aqui se hizo una cosulta como la anterior pero este es para borrar
        return dataAccess.Execute(query) >= 1;
    }
     
       public boolean Update() {//METODO PARA ACTUALIZAR UN REGISTRO
        //Seteo cada uno de los campos que yo quiera actualizar
        //Lo que estoy tratando de hacer es como lo siguiente: Update tabla set campo1=valor1, campo2=valor2, campo3=valor3; etc, esto es lo que to estoy tratando de hacer con esta query de tipo String, ya que si ejecuto esto sobre la base de datos voy a actualizar toda la tabla y a todos le voy a poner la misma informacion, entonces ocupoun filtro por asi decirlo ocupo actualizar solamente los que correspondan a idProducto igual a lo que yo le mande solamente esos, esto se hace el la linea de codigo donde dice WHERE idProducto, es la ultima linea antes del return.
        String query = "UPDATE ProductosProveedores SET "
                + "idProveedor= " + idProveedor + ", "
                + "idProducto = " + idProducto + " "
                + //"activo = " + activo + " " +
                "WHERE idProductoProveedor = " + idProductoProveedor;
        return dataAccess.Execute(query) >= 1;
    }
       public DefaultTableModel GetByNameId() {
        String query ="SELECT Productos.nombreProducto, Proveedores.nombreProveedor FROM Productos JOIN productosProveedores ON Productos.idProducto= productosProveedores.idProducto JOIN Proveedores ON Proveedores.idProveedor=productosProveedores.idProveedor";
        return dataAccess.Query(query); //este metodo lo regresa para guardar en un defaultTableModel
    }
}







package models;

import java.sql.Connection;
import java.sql.DriverManager;

import controller.Usuarios;

public class Conexion {
    

    //declaramos los atributos 
    
    private static final String bbdd="jdbc:mysql://localhost:3306/bdjava";
    private static final String Usuarios="root";
    private static final String clave="";
    private static Connection con;
    
    //Declarar método conexión
    public static Connection conectar() {
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(bbdd,Usuarios,clave);
        System.out.println(con);
        System.out.println("Conexión Exitosa");
    }catch(Exception e) {
    System.out.println("Error de conexión a la base de datos "+e.getMessage().toString());
    }
    return con;
}
public static void main(String[] args) {
 Conexion.conectar();
}
}
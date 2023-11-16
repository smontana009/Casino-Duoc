package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    public Connection conexionBD(){
        String url = "jdbc:mysql://localhost:3306/inventario";
        String usuario = "root";
        String contraseña = "admin";
        
        Connection conexion=null;
        
        try{
            conexion =DriverManager.getConnection(url,usuario,contraseña);
            if (conexion !=null){
                System.out.println("CONEXION EXITOSA");
            }
        }catch (SQLException e){
            System.out.println("El error al conectar la base  de datos: "+e.getMessage());
        }  
        return conexion;
    }
}

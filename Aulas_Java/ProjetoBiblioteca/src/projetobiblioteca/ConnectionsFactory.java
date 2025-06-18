
package projetobiblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionsFactory {
    
    public Connection conectaBD(){
        Connection conn = null;
    
    try{
    
     String URL = "jdbc:mysql://localhost:3306/cadastro?useSSL=false";
     String USER = "root";
     String PASSWORD = "";
     
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        
    }catch(SQLException e){
        System.out.println("Deu Ruim: "+e.getMessage());
    }
        return conn;
    } 
}

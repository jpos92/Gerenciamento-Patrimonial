
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    public Connection getConexao(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/patrimonio", "root", "123456");
        } 
        catch (Exception erro){
            throw new RuntimeException("Erro 1: " + erro );
        }
    }

}

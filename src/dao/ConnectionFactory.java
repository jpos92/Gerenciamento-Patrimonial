
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConnectionFactory {
    
    public static Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream("src/properties/MySql.properties");
        props.load(file);
        return props;
    }
    
    public Connection getConexao() throws IOException{
        
        String hostName;
        String login;
        String senha;
        
        Properties prop = getProp();
        
        hostName = prop.getProperty("prop.server.host");
        senha = prop.getProperty("prop.server.password");
        login = prop.getProperty("prop.server.login");
        
        System.out.println("Login = " + login);
        System.out.println("Host = " + hostName);
        System.out.println("Password = " + senha);
        
        try {
            return DriverManager.getConnection("jdbc:mysql://"+hostName+"/patrimonio", login, senha);
        } 
        catch (Exception erro){
            throw new RuntimeException("Erro 1: " + erro );
        }
    }
}

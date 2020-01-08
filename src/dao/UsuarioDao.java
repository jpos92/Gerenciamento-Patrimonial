/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author TI
 */
import java.io.IOException;
import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author TI
 */
public class UsuarioDao {
    
    private Connection conn;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    private ArrayList<Usuario> lista = new ArrayList<Usuario>();
    public String nomeUsuario = new String();
    
    public UsuarioDao() throws IOException{
        conn = new ConnectionFactory().getConexao();
    }
    
    public void inserir(Usuario usuario) {
        String sql = "INSERT INTO USUARIO (NOME, MATRICULA, VINCULO, CPF, RG, CARGO, ENDERECO, EMAIL) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getMatricula());
            stmt.setString(3, usuario.getVinculo());
            stmt.setString(4, usuario.getCpf());
            stmt.setString(5, usuario.getRg());
            stmt.setString(6, usuario.getCargo());
            stmt.setString(7, usuario.getEndereco());
            stmt.setString(8, usuario.getEmail());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException("ERRO 2: " + erro);
        }
    }
    
    public void alterar(Usuario usuario) {
        String sql = "UPDATE USUARIO SET NOME = ?, VINCULO = ?, CPF = ?, RG = ?, CARGO = ?, ENDERECO = ?, EMAIL = ? WHERE MATRICULA = ? ";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getVinculo());
            stmt.setString(3, usuario.getCpf());
            stmt.setString(4, usuario.getRg());
            stmt.setString(5, usuario.getCargo());
            stmt.setString(6, usuario.getEndereco());
            stmt.setString(7, usuario.getEmail());
            stmt.setString(8, usuario.getMatricula());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir (int valor) {
        String sql = "DELETE FROM USUARIO WHERE MATRICULA = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }
    
    public ArrayList <Usuario> Listartodos(){
        String sql = "SELECT * FROM USUARIO";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Usuario usuario = new Usuario();
                usuario.setNome(rs.getString("nome"));
                usuario.setMatricula(rs.getString("matricula"));
                usuario.setVinculo(rs.getString("vinculo"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setRg(rs.getString("rg"));
                usuario.setCargo(rs.getString("cargo"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setEmail(rs.getString("email"));
                lista.add(usuario);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
    /*public ArrayList <Usuario> ListartodosNome(String nome){
        String sql = "SELECT * FROM USUARIO WHERE NOME LIKE '%"+nome+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Usuario usuario = new Usuario();
                usuario.setMatricula(rs.getInt("matricula"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setEndereco(rs.getString("endereco"));
                usuario.setTelefone(rs.getString("telefone"));
                lista.add(usuario);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }*/
    
    public String retornaNome(String login){
        String sql = "SELECT NOME FROM USUARIO WHERE CPF = (SELECT CPF_USER FROM LOGIN WHERE USER = '"+login+"')";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                nomeUsuario = (rs.getString("nome"));
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return nomeUsuario;
    }
}


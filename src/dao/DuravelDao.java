package dao;

import java.io.IOException;
import model.Duravel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DuravelDao {
    
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Duravel> lista = new ArrayList<Duravel>();
    
public DuravelDao() throws IOException{
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Duravel duravel) {
    String sql = "INSERT INTO DURAVEL (NOME_BEM, NUM_TOMBO, NUM_NOTA, DATA_NOTA, TIPO_COMPRA, ESTADO_CONSERVACAO, TIPO_AQUISICAO, UNIDADE, SUBUNIDADE, LOCALIZACAO, NOME_CAD, DATA_CAD, VALOR_BEM, VALOR_BEM_REC) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, duravel.getNome_bem());
        stmt.setString(2, duravel.getNum_tombo());
        stmt.setString(3, duravel.getNum_nota());
        stmt.setString(4, duravel.getData_nota());
        stmt.setString(5, duravel.getTipo_compra());
        stmt.setString(6, duravel.getEstado_conservacao());
        stmt.setString(7, duravel.getTipo_aquisicao());
        stmt.setString(8, duravel.getUnidade());
        stmt.setString(9, duravel.getSubunidade());
        stmt.setString(10, duravel.getLocalizacao());
        stmt.setString(11, duravel.getNome_cad());
        stmt.setString(12, duravel.getData_cad());
        stmt.setString(13, duravel.getValor_bem());
        stmt.setString(14, duravel.getValor_bem_rec());
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}
    
    public void alterar(Duravel duravel) {
        String sql = "UPDATE DURAVEL SET NOME_BEM = ?, NUM_TOMBO = ?, NUM_NOTA = ?, DATA_NOTA = ?, TIPO_COMPRA = ?, ESTADO_CONSERVACAO = ?, TIPO_AQUISICAO = ?, UNIDADE = ?, SUBUNIDADE = ?, LOCALIZACAO = ?, NOME_CAD = ?, DATA_CAD = ?, VALOR_BEM = ?, VALOR_BEM_REC = ? WHERE CODIGO = ? ";
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setString(1, duravel.getNome_bem());
            stmt.setString(2, duravel.getNum_tombo());
            stmt.setString(3, duravel.getNum_nota());
            stmt.setString(4, duravel.getData_nota());
            stmt.setString(5, duravel.getTipo_compra());
            stmt.setString(6, duravel.getEstado_conservacao());
            stmt.setString(7, duravel.getTipo_aquisicao());
            stmt.setString(8, duravel.getUnidade());
            stmt.setString(9, duravel.getSubunidade());
            stmt.setString(10, duravel.getLocalizacao());
            stmt.setString(11, duravel.getNome_cad());
            stmt.setString(12, duravel.getData_cad());
            stmt.setString(13, duravel.getValor_bem());
            stmt.setString(14, duravel.getValor_bem_rec());
            stmt.setInt(15, duravel.getCodigo());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir (int valor) {
        String sql = "DELETE FROM DURAVEL WHERE CODIGO = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }

    public ArrayList <Duravel> Listartodos(){
        String sql = "SELECT * FROM DURAVEL";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Duravel duravel = new Duravel();
                duravel.setCodigo(rs.getInt("codigo"));
                duravel.setNome_bem(rs.getString("nome_bem"));
                duravel.setNum_tombo(rs.getString("num_tombo"));
                duravel.setNum_nota(rs.getString("num_nota"));
                duravel.setData_nota(rs.getString("data_nota"));
                duravel.setTipo_compra(rs.getString("tipo_compra"));
                duravel.setEstado_conservacao(rs.getString("estado_conservacao"));
                duravel.setTipo_aquisicao(rs.getString("tipo_aquisicao"));
                duravel.setUnidade(rs.getString("unidade"));
                duravel.setSubunidade(rs.getString("subunidade"));
                duravel.setLocalizacao(rs.getString("localizacao"));
                duravel.setNome_cad(rs.getString("nome_cad"));
                duravel.setData_cad(rs.getString("data_cad"));
                duravel.setValor_bem(rs.getString("valor_bem"));
                duravel.setValor_bem_rec(rs.getString("valor_bem_rec"));
                lista.add(duravel);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Duravel> ListartodosNome(String nome){
        String sql = "SELECT * FROM DURAVEL WHERE NOME_BEM LIKE '%"+nome+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Duravel duravel = new Duravel();
                duravel.setCodigo(rs.getInt("codigo"));
                duravel.setNome_bem(rs.getString("nome_bem"));
                duravel.setNum_tombo(rs.getString("num_tombo"));
                duravel.setNum_nota(rs.getString("num_nota"));
                duravel.setData_nota(rs.getString("data_nota"));
                duravel.setTipo_compra(rs.getString("tipo_compra"));
                duravel.setEstado_conservacao(rs.getString("estado_conservacao"));
                duravel.setTipo_aquisicao(rs.getString("tipo_aquisicao"));
                duravel.setUnidade(rs.getString("unidade"));
                duravel.setSubunidade(rs.getString("subunidade"));
                duravel.setLocalizacao(rs.getString("localizacao"));
                duravel.setNome_cad(rs.getString("nome_cad"));
                duravel.setData_cad(rs.getString("data_cad"));
                duravel.setValor_bem(rs.getString("valor_bem"));
                duravel.setValor_bem_rec(rs.getString("valor_bem_rec"));
                lista.add(duravel);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
}



    
 
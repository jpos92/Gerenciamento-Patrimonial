package dao;

import java.io.IOException;
import model.Consumo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ConsumoDao {
    
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Consumo> lista = new ArrayList<Consumo>();
    
public ConsumoDao() throws IOException{
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Consumo consumo) {
    String sql = "INSERT INTO CONSUMO (NOME_BEM, QUANTIDADE, NUM_NOTA, DATA_NOTA, TIPO_COMPRA, ESTADO_CONSERVACAO, TIPO_AQUISICAO, NOME_CAD, DATA_CAD, VALOR_BEM) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, consumo.getNome_bem());
        stmt.setInt(2, consumo.getQuantidade());
        stmt.setString(3, consumo.getNum_nota());
        stmt.setString(4, consumo.getData_nota());
        stmt.setString(5, consumo.getTipo_compra());
        stmt.setString(6, consumo.getEstado_conservacao());
        stmt.setString(7, consumo.getTipo_aquisicao());
        stmt.setString(8, consumo.getNome_cad());
        stmt.setString(9, consumo.getData_cad());
        stmt.setString(10, consumo.getValor_bem());
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}
    
    public void alterar(Consumo consumo) {
        String sql = "UPDATE CONSUMO SET NOME_BEM = ?, QUANTIDADE = ?, NUM_NOTA = ?, DATA_NOTA = ?, TIPO_COMPRA = ?, ESTADO_CONSERVACAO = ?, TIPO_AQUISICAO = ?, NOME_CAD = ?, DATA_CAD = ?, VALOR_BEM = ?, WHERE CODIGO = ? ";
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setString(1, consumo.getNome_bem());
            stmt.setInt(2, consumo.getQuantidade());
            stmt.setString(3, consumo.getNum_nota());
            stmt.setString(4, consumo.getData_nota());
            stmt.setString(5, consumo.getTipo_compra());
            stmt.setString(6, consumo.getEstado_conservacao());
            stmt.setString(7, consumo.getTipo_aquisicao());
            stmt.setString(8, consumo.getNome_cad());
            stmt.setString(9, consumo.getData_cad());
            stmt.setString(10, consumo.getValor_bem());
            stmt.setInt(11, consumo.getCodigo());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir (int valor) {
        String sql = "DELETE FROM CONSUMO WHERE CODIGO = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }

    public ArrayList <Consumo> Listartodos(){
        String sql = "SELECT * FROM CONSUMO";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Consumo consumo = new Consumo();
                consumo.setCodigo(rs.getInt("codigo"));
                consumo.setNome_bem(rs.getString("nome_bem"));
                consumo.setQuantidade(rs.getInt("quantidade"));
                consumo.setNum_nota(rs.getString("num_nota"));
                consumo.setData_nota(rs.getString("data_nota"));
                consumo.setTipo_compra(rs.getString("tipo_compra"));
                consumo.setEstado_conservacao(rs.getString("estado_conservacao"));
                consumo.setTipo_aquisicao(rs.getString("tipo_aquisicao"));
                consumo.setNome_cad(rs.getString("nome_cad"));
                consumo.setData_cad(rs.getString("data_cad"));
                consumo.setValor_bem(rs.getString("valor_bem"));
                lista.add(consumo);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Consumo> ListartodosNome(String nome){
        String sql = "SELECT * FROM CONSUMO WHERE NOME_BEM LIKE '%"+nome+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Consumo consumo = new Consumo();
                consumo.setCodigo(rs.getInt("codigo"));
                consumo.setNome_bem(rs.getString("nome_bem"));
                consumo.setQuantidade(rs.getInt("quantidade"));
                consumo.setNum_nota(rs.getString("num_nota"));
                consumo.setData_nota(rs.getString("data_nota"));
                consumo.setTipo_compra(rs.getString("tipo_compra"));
                consumo.setEstado_conservacao(rs.getString("estado_conservacao"));
                consumo.setTipo_aquisicao(rs.getString("tipo_aquisicao"));
                consumo.setNome_cad(rs.getString("nome_cad"));
                consumo.setData_cad(rs.getString("data_cad"));
                consumo.setValor_bem(rs.getString("valor_bem"));
                lista.add(consumo);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
}



    
 
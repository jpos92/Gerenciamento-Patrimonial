package table;

import model.Usuario;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class UsuarioTableModel extends AbstractTableModel{
    
    public static final int COL_NOME = 0;
    public static final int COL_MATRICULA = 1;
    public static final int COL_VINCULO = 2;
    public static final int COL_CPF = 3;
    public static final int COL_RG = 4;
    public static final int COL_CARGO = 5;
    public static final int COL_ENDERECO = 6;
    public static final int COL_EMAIL = 7;
    public ArrayList <Usuario> lista;

    public UsuarioTableModel (ArrayList<Usuario> l){
        lista = new ArrayList<Usuario> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Usuario usuario = lista.get(linhas);
        if (colunas == COL_NOME) return usuario.getNome();
        if (colunas == COL_MATRICULA) return usuario.getMatricula();
        if (colunas == COL_VINCULO) return usuario.getVinculo();
        if (colunas == COL_CPF) return usuario.getCpf();
        if (colunas == COL_RG) return usuario.getRg();
        if (colunas == COL_CARGO) return usuario.getCargo();
        if (colunas == COL_ENDERECO) return usuario.getEndereco();
        if (colunas == COL_EMAIL) return usuario.getEmail();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_NOME) return "Nome";
        if (colunas == COL_MATRICULA) return "Matrícula";
        if (colunas == COL_VINCULO) return "Vínculo";
        if (colunas == COL_CPF) return "CPF";
        if (colunas == COL_RG) return "RG";
        if (colunas == COL_CARGO) return "Cargo";
        if (colunas == COL_ENDERECO) return "Endereço";
        if (colunas == COL_EMAIL) return "Email";
        return "";
    } 
}

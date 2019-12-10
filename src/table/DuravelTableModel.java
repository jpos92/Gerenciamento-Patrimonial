package table;

import model.Duravel;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class DuravelTableModel extends AbstractTableModel{
    
    public static final int COL_CODIGO = 0;
    public static final int COL_NOME_BEM = 1;
    public static final int COL_NUM_TOMBO = 2;
    public static final int COL_NUM_NOTA = 3;
    public static final int COL_DATA_NOTA = 4;
    public static final int COL_TIPO_COMPRA = 5;
    public static final int COL_ESTADO_CONSERVACAO = 6;
    public static final int COL_TIPO_AQUISICAO = 7;
    public static final int COL_UNIDADE = 8;
    public static final int COL_SUBUNIDADE = 9;
    public static final int COL_LOCALIZACAO = 10;
    public static final int COL_NOME_CAD = 11;
    public static final int COL_DATA_CAD = 12;
    public static final int COL_VALOR_BEM = 13;
    public static final int COL_VALOR_BEM_REC = 14;
    public ArrayList <Duravel> lista;

    public DuravelTableModel (ArrayList<Duravel> l){
        lista = new ArrayList<Duravel> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 15;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Duravel duravel = lista.get(linhas);
        if (colunas == COL_CODIGO) return duravel.getCodigo();
        if (colunas == COL_NOME_BEM) return duravel.getNome_bem();
        if (colunas == COL_NUM_TOMBO) return duravel.getNum_tombo();
        if (colunas == COL_NUM_NOTA) return duravel.getNum_nota();
        if (colunas == COL_DATA_NOTA) return duravel.getData_nota();
        if (colunas == COL_TIPO_COMPRA) return duravel.getTipo_compra();
        if (colunas == COL_ESTADO_CONSERVACAO) return duravel.getEstado_conservacao();
        if (colunas == COL_TIPO_AQUISICAO) return duravel.getTipo_aquisicao();
        if (colunas == COL_UNIDADE) return duravel.getUnidade();
        if (colunas == COL_SUBUNIDADE) return duravel.getSubunidade();
        if (colunas == COL_LOCALIZACAO) return duravel.getLocalizacao();
        if (colunas == COL_NOME_CAD) return duravel.getNome_cad();
        if (colunas == COL_DATA_CAD) return duravel.getData_cad();
        if (colunas == COL_VALOR_BEM) return duravel.getValor_bem();
        if (colunas == COL_VALOR_BEM_REC) return duravel.getValor_bem_rec();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_CODIGO) return "Código";
        if (colunas == COL_NOME_BEM) return "Nome";
        if (colunas == COL_NUM_TOMBO) return "Tombo";
        if (colunas == COL_NUM_NOTA) return "Nota";
        if (colunas == COL_DATA_NOTA) return "Data da nota";
        if (colunas == COL_TIPO_COMPRA) return "Tipo da compra";
        if (colunas == COL_ESTADO_CONSERVACAO) return "Estado";
        if (colunas == COL_TIPO_AQUISICAO) return "Aquisição";
        if (colunas == COL_UNIDADE) return "Unidade";
        if (colunas == COL_SUBUNIDADE) return "Subunidade";
        if (colunas == COL_LOCALIZACAO) return "Localização";
        if (colunas == COL_NOME_CAD) return "Nome do cadastrante";
        if (colunas == COL_DATA_CAD) return "Data do cadastro";
        if (colunas == COL_VALOR_BEM) return "Valor do bem";
        if (colunas == COL_VALOR_BEM_REC) return "Valor do bem recuperado";
        return "";
    } 
}

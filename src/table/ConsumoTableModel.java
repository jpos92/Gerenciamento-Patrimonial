package table;

import model.Consumo;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ConsumoTableModel extends AbstractTableModel{
    
    public static final int COL_CODIGO = 0;
    public static final int COL_NOME_BEM = 1;
    public static final int COL_QUANTIDADE = 2;
    public static final int COL_NUM_NOTA = 3;
    public static final int COL_DATA_NOTA = 4;
    public static final int COL_TIPO_COMPRA = 5;
    public static final int COL_ESTADO_CONSERVACAO = 6;
    public static final int COL_TIPO_AQUISICAO = 7;
    public static final int COL_NOME_CAD = 8;
    public static final int COL_DATA_CAD = 9;
    public static final int COL_VALOR_BEM = 10;
    public ArrayList <Consumo> lista;

    public ConsumoTableModel (ArrayList<Consumo> l){
        lista = new ArrayList<Consumo> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 11;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Consumo consumo = lista.get(linhas);
        if (colunas == COL_CODIGO) return consumo.getCodigo();
        if (colunas == COL_NOME_BEM) return consumo.getNome_bem();
        if (colunas == COL_QUANTIDADE) return consumo.getQuantidade();
        if (colunas == COL_NUM_NOTA) return consumo.getNum_nota();
        if (colunas == COL_DATA_NOTA) return consumo.getData_nota();
        if (colunas == COL_TIPO_COMPRA) return consumo.getTipo_compra();
        if (colunas == COL_ESTADO_CONSERVACAO) return consumo.getEstado_conservacao();
        if (colunas == COL_TIPO_AQUISICAO) return consumo.getTipo_aquisicao();
        if (colunas == COL_NOME_CAD) return consumo.getNome_cad();
        if (colunas == COL_DATA_CAD) return consumo.getData_cad();
        if (colunas == COL_VALOR_BEM) return consumo.getValor_bem();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_CODIGO) return "Código";
        if (colunas == COL_NOME_BEM) return "Nome";
        if (colunas == COL_QUANTIDADE) return "Quantidade";
        if (colunas == COL_NUM_NOTA) return "Nota";
        if (colunas == COL_DATA_NOTA) return "Data da nota";
        if (colunas == COL_TIPO_COMPRA) return "Tipo da compra";
        if (colunas == COL_ESTADO_CONSERVACAO) return "Estado";
        if (colunas == COL_TIPO_AQUISICAO) return "Aquisição";
        if (colunas == COL_NOME_CAD) return "Nome do cadastrante";
        if (colunas == COL_DATA_CAD) return "Data do cadastro";
        if (colunas == COL_VALOR_BEM) return "Valor do bem";
        return "";
    } 
}

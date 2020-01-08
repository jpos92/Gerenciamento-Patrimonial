/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author TI
 */
public class Consumo {
    
    private int codigo;
    private String nome_bem;
    private int quantidade;
    private String num_nota;
    private String data_nota;
    private String tipo_compra;
    private String estado_conservacao;
    private String tipo_aquisicao;
    private String nome_cad;
    private String data_cad;
    private String valor_bem;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome_bem
     */
    public String getNome_bem() {
        return nome_bem;
    }

    /**
     * @param nome_bem the nome_bem to set
     */
    public void setNome_bem(String nome_bem) {
        this.nome_bem = nome_bem;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the num_nota
     */
    public String getNum_nota() {
        return num_nota;
    }

    /**
     * @param num_nota the num_nota to set
     */
    public void setNum_nota(String num_nota) {
        this.num_nota = num_nota;
    }

    /**
     * @return the data_nota
     */
    public String getData_nota() {
        return data_nota;
    }

    /**
     * @param data_nota the data_nota to set
     */
    public void setData_nota(String data_nota) {
        this.data_nota = data_nota;
    }

    /**
     * @return the tipo_compra
     */
    public String getTipo_compra() {
        return tipo_compra;
    }

    /**
     * @param tipo_compra the tipo_compra to set
     */
    public void setTipo_compra(String tipo_compra) {
        this.tipo_compra = tipo_compra;
    }

    /**
     * @return the estado_conservacao
     */
    public String getEstado_conservacao() {
        return estado_conservacao;
    }

    /**
     * @param estado_conservacao the estado_conservacao to set
     */
    public void setEstado_conservacao(String estado_conservacao) {
        this.estado_conservacao = estado_conservacao;
    }

    /**
     * @return the tipo_aquisicao
     */
    public String getTipo_aquisicao() {
        return tipo_aquisicao;
    }

    /**
     * @param tipo_aquisicao the tipo_aquisicao to set
     */
    public void setTipo_aquisicao(String tipo_aquisicao) {
        this.tipo_aquisicao = tipo_aquisicao;
    }

    /**
     * @return the nome_cad
     */
    public String getNome_cad() {
        return nome_cad;
    }

    /**
     * @param nome_cad the nome_cad to set
     */
    public void setNome_cad(String nome_cad) {
        this.nome_cad = nome_cad;
    }

    /**
     * @return the data_cad
     */
    public String getData_cad() {
        return data_cad;
    }

    /**
     * @param data_cad the data_cad to set
     */
    public void setData_cad(String data_cad) {
        this.data_cad = data_cad;
    }

    /**
     * @return the valor_bem
     */
    public String getValor_bem() {
        return valor_bem;
    }

    /**
     * @param valor_bem the valor_bem to set
     */
    public void setValor_bem(String valor_bem) {
        this.valor_bem = valor_bem;
    }
    
}

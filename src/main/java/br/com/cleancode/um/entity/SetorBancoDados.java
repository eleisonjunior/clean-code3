package main.java.br.com.cleancode.um.entity;

import main.java.br.com.cleancode.um.factory.ISetor;

    /*
        Patter Strategy
     */

public class SetorBancoDados implements ISetor {
    private Integer id;
    private String  descricao;

    public SetorBancoDados(Integer id, String descricao) {
        this.id = 1;
        this.descricao = "BANCO DE DADOS";
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

}

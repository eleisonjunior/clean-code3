package main.java.br.com.cleancode.um.entity;

import main.java.br.com.cleancode.um.factory.ISetor;

public class SetorDesenvolvimento implements ISetor {
    private Integer id;
    private String  descricao;

    public SetorDesenvolvimento() {
        this.id = 2;
        this.descricao = "DESENVOLVIMENTO";
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

}

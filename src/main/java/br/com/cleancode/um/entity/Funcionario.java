package main.java.br.com.cleancode.um.entity;

    /*
        Patter factory
     */


import main.java.br.com.cleancode.um.factory.IFuncionario;

import java.math.BigDecimal;
import java.util.List;

public class Funcionario implements IFuncionario {

    private String          nome;
    private List<String> telefones;
    private String          endereco;
    private BigDecimal salario;
    private String          setor;
    private String          cargo;


    public Funcionario(String nome, List<String> telefones, String endereco, BigDecimal salario, String setor, String cargo) {
        this.nome = nome;
        this.telefones = telefones;
        this.endereco = endereco;
        this.salario = salario;
        this.setor = setor;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<String> telefones) {
        this.telefones = telefones;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

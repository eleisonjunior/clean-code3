package main.java.br.com.cleancode.um.service;

import main.java.br.com.cleancode.um.entity.Cargo;
import main.java.br.com.cleancode.um.entity.Funcionario;
import main.java.br.com.cleancode.um.entity.SetorDesenvolvimento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {

    public static void reajusteSalario(Funcionario funcionarioTeste, BigDecimal valorReajuste) {
        if(funcionarioTeste instanceof Funcionario) {
            funcionarioTeste.setSalario(funcionarioTeste.getSalario().add(valorReajuste));
            System.out.println("O novo valor do salário do funcionário "+funcionarioTeste.getNome()+" é de R$ "+ funcionarioTeste.getSalario());
        }
        else{
            System.out.println("Funcionario terceirizado não pode ter reajuste!");
        }
    }
    public static void main(String[] args) {
        try {

            List<String> telefones = new ArrayList<String>();
            telefones.add("6199999999");
            SetorDesenvolvimento setor = new SetorDesenvolvimento();
            Cargo cargo = new Cargo();
            cargo.setDescricao("JÚNIOR");
            Funcionario funcionario = new Funcionario("Maria",telefones,"Rua da Lagosta",new BigDecimal(2000.00),setor.getDescricao(), cargo.getDescricao());
            reajusteSalario(funcionario,new BigDecimal(500.00));

        }catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

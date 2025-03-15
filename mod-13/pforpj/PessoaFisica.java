package edu.java.gomesvh.pforpj;

import edu.java.gomesvh.abstracts.Pessoa;

/**
 * Classe concreta que representa uma pessoa física, estende da classe abstrata Pessoa.
 * Recebe CPF como atributo, possui construtor, getter e um método toString.
 * Setters foram removidos por não serem necessários no contexto do exercício.
 * @author gomesvh
 */
public class PessoaFisica extends Pessoa {
    // Atributos
    private final String cpf;

    // Construtor
    public PessoaFisica(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome);
        this.cpf = cpf;
    }

    // Getter para CPF
    public String getCpf() {
        return cpf;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Cliente PF Nome: " + getNome() + " " + getSobrenome() + " - CPF: " + getCpf();
    }
}
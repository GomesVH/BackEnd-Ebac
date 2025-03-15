package edu.java.gomesvh.pforpj;

import edu.java.gomesvh.abstracts.Pessoa;

/**
 * Classe concreta que representa uma pessoa jurídica, estende da classe abstrata Pessoa.
 * Recebe CNPJ como atributo, possui construtor, getter e um método toString.
 * Setters foram removidos por não serem necessários no contexto do exercício.
 * @author gomesvh
 */
public class PessoaJuridica extends Pessoa {
    // Atributos
    private final String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String sobrenome, String cnpj) {
        super(nome, sobrenome);
        this.cnpj = cnpj;
    }

    // Getter para CNPJ
    public String getCnpj() {
        return cnpj;
    }

    // Sobrescrita do método toString
    @Override
    public String toString() {
        return "Cliente PJ Nome: " + getNome() + " " + getSobrenome() + " - CNPJ: " + getCnpj();
    }
}
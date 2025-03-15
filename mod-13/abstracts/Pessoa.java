package edu.java.gomesvh.abstracts;

/**
 * Classe abstrata representando uma pessoa com nome e sobrenome.
 * Os atributos são definidos como finais porque não serão modificados após a inicialização no construtor.
 * Getters são fornecidos para acessar os atributos. Setters não são necessários no contexto do exercício.
 * @author gomesvh
 */
public abstract class Pessoa {
    // Atributos
    private final String nome;
    private final String sobrenome;

    // Construtor
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
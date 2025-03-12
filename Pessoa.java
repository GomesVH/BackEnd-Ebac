package edu.java.gomesvh;

public class Pessoa {
    /** ---Atributos--- */
    private String nome;
    private float altura;
    private byte idade;
    /**
     * Por não ser necessário tantos bits para receber uma idade, optei por usar byte ao invés de int,
     * e o mesmo se aplica à altura com float ao invés de double.
     * @see idade
     * @see altura
     */

    /** ---Construtor--- */
    public Pessoa(String nome, float altura, byte idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }
    /**
     * nome = nome da pessoa
     * altura = altura da pessoa
     * idade = idade da pessoa
     * @param nome
     * @param altura
     * @param idade
     */

    /** ---Getters & Setters--- */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura não pode ser negativa.");
        }
        this.altura = altura;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        this.idade = idade;
    }

    /** ---Métodos--- */
    public void andar() {
        System.out.println("Andando...");
    }

    /**
     * Nome do alimento a ser oferecido
     * @param alimento
     */
    public void comer(String alimento) {
        System.out.println(this.nome + " está comendo " + alimento);
    }

    /**
     * --------------------------------------------------
     * @autor victorvh
     */
}

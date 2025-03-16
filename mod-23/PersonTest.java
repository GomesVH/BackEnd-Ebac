package org.edu.java;

/**
 * Representa uma pessoa com atributos como nome e gênero.
 * Autor: Gomesvh
 */
public class PersonTest {
    private String name;
    private String gender;

    /**
     * Construtor para criar uma instância de PersonTest.
     *
     * @param name   O nome da pessoa.
     * @param gender O gênero da pessoa.
     */
    public PersonTest(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    /**
     * Retorna o nome da pessoa.
     *
     * @return O nome.
     */
    public String getName() {
        return name;
    }

    /**
     * Retorna o gênero da pessoa.
     *
     * @return O gênero.
     */
    public String getGender() {
        return gender;
    }
}
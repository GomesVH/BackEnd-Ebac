package edu.java.gomesvh;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Classe principal para coletar nomes e sexos de pessoas, e categorizá-los em listas separadas.
 * Primeiro instanciamento do Scanner e HashMaps, input do usuário com nomes+sexo na formatação: Joao-M
 * Faz uma primeira separação dos nomes, usa um foreach para percorrer os nomes no array e separar nome do sexo com split(-),
 * Usa um if para direcionar os nomes masculinos e femininos aos respectivos HashMaps e ao final imprime tudo.
 * @author gomesvh
 */
public class SeparacaoPorSexo {
    public static void main(String[] args) {
        // Instanciando Scanner e os HashMaps de nomes
        Scanner scan = new Scanner(System.in);
        Map<String, Pessoa> nomesMasculinos = new HashMap<>();
        Map<String, Pessoa> nomesFemininos = new HashMap<>();

        // Input de nome+sexo
        System.out.println("-----***** Exercitando Collections e Map *****-----");
        System.out.println("*** Digite um nome e a inicial do sexo separados por um traço e vírgula para nomes ***");
        System.out.println("Exemplo: Maria-F,Joao-M,Clara-F,Rafael-M");
        System.out.print("R: ");
        String nomes = scan.nextLine();

        // Primeira separação com split por vírgula
        String[] primeiraSeparacao = nomes.split(",");

        // Segunda separação com split usando traço dentro de um for para percorrer primeiraSeparacao
        for (String nomeSexo : primeiraSeparacao) {
            String[] segundaSeparacao = nomeSexo.split("-");
            if (segundaSeparacao.length != 2) {
                System.out.println("Formato inválido para: " + nomeSexo);
                continue;
            }
            String nome = segundaSeparacao[0].trim();
            String sexo = segundaSeparacao[1].trim();

            // Separação de sexos e atribuição ao Map adequado
            if (sexo.equalsIgnoreCase("m")) {
                nomesMasculinos.put(nome, new Pessoa(nome));
            } else if (sexo.equalsIgnoreCase("f")) {
                nomesFemininos.put(nome, new Pessoa(nome));
            } else {
                System.out.println("Sexo inválido para: " + nome);
            }
        }
        scan.close();

        // Exibe nomes masculinos
        System.out.println("\n-----***** Nomes Masculinos *****-----");
        for (String nome : nomesMasculinos.keySet()) {
            System.out.println(nome);
        }

        // Exibe nomes femininos
        System.out.println("\n-----***** Nomes Femininos *****-----");
        for (String nome : nomesFemininos.keySet()) {
            System.out.println(nome);
        }
    }
}
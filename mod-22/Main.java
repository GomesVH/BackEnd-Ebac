package org.edu.java;

import java.util.*;

/**
 * Demonstra o uso de Lambdas, Referências a Métodos, Streams e Tratamento de Exceções.
 * Este exemplo coleta dados sobre pessoas e os processa utilizando Streams do Java.
 * Autor: Gomesvh
 */
public class Main {
    public static void main(String[] args) {
        // Inicializa o Scanner e as estruturas de dados necessárias
        Scanner scanner = new Scanner(System.in);
        Set<Person> conjuntoDePessoas = new HashSet<>();

        // Contador de pessoas registradas
        int contadorDePessoas = 0;

        // Coleta os dados de 3 pessoas
        while (contadorDePessoas < 3) {
            System.out.println("\n<----- Adicione a " + (contadorDePessoas + 1) + "ª pessoa ----->");
            System.out.println("Digite os detalhes no formato: Nome, Gênero (Masculino ou Feminino)");
            System.out.println("Exemplo: Maria, Feminino");
            System.out.print("Entrada: ");

            // Lê a entrada e separa em nome e gênero
            String entrada = scanner.nextLine();
            String[] partes = entrada.split(", ");

            // Valida e adiciona a pessoa
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim();

                if (nome.isEmpty() || genero.isEmpty()) {
                    System.out.println("Entrada inválida! Nome e gênero não podem estar vazios.");
                } else {
                    conjuntoDePessoas.add(new Person(nome, genero));
                    contadorDePessoas++;
                }
            } else {
                System.out.println("Formato inválido! Utilize o formato: Nome, Gênero");
            }
        }
        scanner.close();

        // Filtra as pessoas do gênero feminino utilizando Streams
        List<Person> listaFeminino = conjuntoDePessoas.stream()
                .filter(pessoa -> "feminino".equalsIgnoreCase(pessoa.getGender()))
                .toList();

        // Impressão formatada das pessoas do gênero feminino
        System.out.println("\n**********************************************");
        System.out.println("-----> Pessoas do Gênero Feminino <-----");
        listaFeminino.forEach(pessoa ->
                System.out.println("Nome: " + pessoa.getName() + " | Gênero: " + pessoa.getGender())
        );

        // Impressão das pessoas utilizando Referências a Métodos
        System.out.println("\n**********************************************");
        System.out.println("-----> Pessoas do Gênero Feminino (Usando Referências a Métodos) <-----");
        listaFeminino.forEach(System.out::println);
    }
}
package org.edu.java;

import java.util.*;

/**
 * Demonstra exemplos de uso de Lambdas, Referências a Métodos, Streams e Tratamento de Exceções.
 * Autor: Gomesvh
 */
public class MainTest {
    public static void main(String[] args) {
        // Instanciando as classes necessárias
        Scanner scanner = new Scanner(System.in);
        Set<PersonTest> conjuntoDePessoas = new HashSet<>();

        // Contador de pessoas cadastradas para o exemplo
        int pessoasAdicionadas = 0;

        // Loop para adicionar 3 pessoas
        while (pessoasAdicionadas < 3) {
            System.out.println("\n<----- Adicione a " + (pessoasAdicionadas + 1) + "ª pessoa ----->");
            System.out.println("Use uma vírgula para separar o nome e o gênero em inglês (Male ou Female)");
            System.out.println("Exemplo: Mary, Female");
            System.out.print("Entrada: ");

            // Lendo e separando a entrada
            String entrada = scanner.nextLine();
            String[] partes = entrada.split(", ");

            // Verifica se a entrada contém nome e gênero
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String genero = partes[1].trim();

                if (nome.isEmpty() || genero.isEmpty()) {
                    System.out.println("Entrada inválida! Nome e gênero não podem estar vazios.");
                } else {
                    conjuntoDePessoas.add(new PersonTest(nome, genero));
                    pessoasAdicionadas++;
                }
            } else {
                System.out.println("Formato inválido! Preencha conforme o exemplo: Nome, Gênero");
            }
        }
        scanner.close();

        // Filtra as pessoas do gênero feminino para uma lista separada
        List<PersonTest> listaFeminino = filtrarPessoasFemininas(conjuntoDePessoas);

        // Impressão formatada das pessoas do gênero feminino
        System.out.println("\n**********************************************");
        System.out.println("-----> Pessoas do Gênero Feminino <-----");
        listaFeminino.forEach(pessoa -> 
                System.out.println("Nome: " + pessoa.getName() + " | Gênero: " + pessoa.getGender())
        );

        // Impressão das pessoas utilizando referências a métodos
        System.out.println("\n**********************************************");
        System.out.println("-----> Pessoas do Gênero Feminino (Usando Referências a Métodos) <-----");
        listaFeminino.forEach(System.out::println);
    }

    /**
     * Filtra as pessoas do gênero feminino.
     *
     * @param conjuntoDePessoas O conjunto de pessoas para filtrar.
     * @return Uma lista contendo apenas as pessoas do gênero feminino.
     */
    public static List<PersonTest> filtrarPessoasFemininas(Set<PersonTest> conjuntoDePessoas) {
        return conjuntoDePessoas.stream()
                .filter(pessoa -> pessoa.getGender().trim().equalsIgnoreCase("female"))
                .toList();
    }
}
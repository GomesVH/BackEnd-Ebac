package edu.java.gomesvh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe principal para coletar nomes e sexos de pessoas e categorizá-los em listas separadas.
 * Declara Scanner e Lists, while para decidir quando parar os inputs, dentro do while os inputs são separados pelo split
 * que divide nome e sexo, caso masc vai para lista de nomes masculinos e o mesmo se aplica aos nomes femininos
 * e ao fim exibe os nomes masculinos e femininos separados.
 * @author gomesvh
 */
public class Main {
    public static void main(String[] args) {
        // Declarações
        Scanner scan = new Scanner(System.in);
        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        // Loop para ter quantos inputs forem necessários
        while (true) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("-----***** Exercitando Java Collections *****-----");
            System.out.println("*** Digite o primeiro nome e o sexo separados por um espaço e sem vírgulas ou pontos ***");
            System.out.println("Exemplo: Jon Masculino");
            System.out.print("R: ");
            String input = scan.nextLine();

            // Separa nome e sexo
            String[] nomeSexo = input.split(" ");
            if (nomeSexo.length != 2) {
                System.out.println("Entrada inválida! Por favor, digite novamente.");
                continue;
            }

            String nome = nomeSexo[0];
            String sexo = nomeSexo[1];
            if (sexo.equalsIgnoreCase("masculino")) {
                nomesMasculinos.add(nome);
            } else if (sexo.equalsIgnoreCase("feminino")) {
                nomesFemininos.add(nome);
            } else {
                System.out.println("Sexo inválido! Por favor, digite 'masculino' ou 'feminino'.");
                continue;
            }

            // Verifica se o loop continua ou para
            System.out.println("--------------------------------------------------------");
            System.out.println("Quer adicionar uma nova pessoa? Digite SIM, caso não queira digite NÃO");
            System.out.print("R: ");
            String continuarOuNao = scan.nextLine();
            if (continuarOuNao.equalsIgnoreCase("nao") || continuarOuNao.equalsIgnoreCase("não")) {
                break;
            }
        }
        scan.close();

        // Exibe nomes masculinos
        System.out.println("\n___* * * * * OUTPUT * * * * *___");
        System.out.println("--------------------------------------------------------");
        System.out.println("* * * Nomes Masculinos * * * ");
        for (String nome : nomesMasculinos) {
            System.out.println(nome);
        }

        // Exibe nomes femininos
        System.out.println("--------------------------------------------------------");
        System.out.println("* * * Nomes Femininos * * * ");
        for (String nome : nomesFemininos) {
            System.out.println(nome);
        }
    }
}
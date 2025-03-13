package edu.java.gomesvh;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Classe principal para demonstrar a ordenação automática usando TreeMap.
 * Scaneia input[String] do usuário, usa split para separar nomes,
 * atribui ao TreeMap que ordena naturalmente e imprime os nomes ordenados.
 * OBS: Pensei em implementar um BubbleSort para ordenar manualmente e comparar com um compareTo,
 * mas não vi motivo para usar essa implementação baseando no conceito de que o TreeMap faz isso automaticamente.
 * @author gomesvh
 */
public class OrdenacaoAutomatica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
         * Ordenação natural do TreeMap
         */

        // Recebendo inputs
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----****** Exercitando Ordenação Automática com TreeMap ******-----");
        System.out.println("Escreva uma sequência de nomes separando por uma vírgula: ");
        System.out.print("R: ");
        String nomes = scan.nextLine();

        // Separando Nomes
        String[] separacaoDeNomes = nomes.split(",");

        // Atribuindo nomes ao Map como chave e instanciando uma nova Pessoa com um foreach
        Map<String, Pessoa> nomesOrdenados = new TreeMap<>();
        for (String name : separacaoDeNomes) {
            nomesOrdenados.put(name.trim(), new Pessoa(name.trim()));
        }

        // Imprimindo nomes ordenados pelo TreeMap
        System.out.println("-----****** Nomes Ordenados pelo TreeMap ******-----");
        for (String name : nomesOrdenados.keySet()) {
            System.out.println(name);
        }
        scan.close();
    }
}
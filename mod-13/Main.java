package edu.java.gomesvh;

import edu.java.gomesvh.abstracts.Pessoa;
import edu.java.gomesvh.interfaces.ITermos;
import edu.java.gomesvh.pforpj.PessoaFisica;
import edu.java.gomesvh.pforpj.PessoaJuridica;

import java.util.Scanner;

/**
 * Classe principal para o gerenciamento da abertura de contas,
 * implementa os métodos relacionados aos termos de uso da interface ITermos.
 * Os termos precisam ser aceitos antes da criação de contas Pessoa Física ou Pessoa Jurídica.
 * @autor gomesvh
 */
public class Main implements ITermos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Instância de Main para uso de métodos da interface ITermos
        Main mainInstance = new Main();
        System.out.println("----------> ABERTURA DE CONTA <----------");

        // Exibe os termos de uso
        mainInstance.termosDeContrato();
        String respostaAosTermos = scan.nextLine();

        // Verifica se o usuário aceitou os termos
        if (mainInstance.aceitarTermos(respostaAosTermos)) {
            int r;
            // Loop para garantir uma escolha válida
            do {
                System.out.println("\n______________________________________________________________________");
                System.out.println("Para abertura de conta como Pessoa Física, digite 1");
                System.out.println("Para abertura de conta como Pessoa Jurídica, digite 2");
                System.out.print("R: ");
                while (!scan.hasNextInt()) {
                    System.out.println("Entrada inválida! Por favor, digite 1 ou 2.");
                    scan.next();
                }
                r = scan.nextInt();
            } while (r != 1 && r != 2);

            // Entrada do Nome
            scan.nextLine(); // Limpa o buffer do scanner
            System.out.println("Digite seu Nome:");
            System.out.print("R: ");
            String nome = scan.nextLine();

            // Entrada do Sobrenome
            System.out.println("Digite seu Sobrenome:");
            System.out.print("R: ");
            String sobrenome = scan.nextLine();

            // Tratamento para Pessoa Física ou Jurídica
            if (r == 1) {
                // Entrada do CPF
                System.out.println("Digite seu CPF:");
                System.out.print("R: ");
                String cpf = scan.nextLine();

                // Instância de Pessoa Física
                Pessoa pessoaFisica = new PessoaFisica(nome, sobrenome, cpf);
                System.out.println("\n-----*> Conta criada com sucesso! <*-----\n");
                System.out.println(pessoaFisica);
            } else {
                // Entrada do CNPJ
                System.out.println("Digite seu CNPJ:");
                System.out.print("R: ");
                String cnpj = scan.nextLine();

                // Instância de Pessoa Jurídica
                Pessoa pessoaJuridica = new PessoaJuridica(nome, sobrenome, cnpj);
                System.out.println("\n-----*> Conta criada com sucesso!!! <*-----\n");
                System.out.println(pessoaJuridica);
            }
        } else {
            // Saída em caso de recusa dos termos
            System.out.println("-----*> Encerrando devido à não aceitação dos termos de uso. <*-----");
        }
        scan.close();
    }
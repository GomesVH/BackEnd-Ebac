package br.com.gomesvh;

import br.com.gomesvh.dao.ClienteMapDAO;
import br.com.gomesvh.dao.IClienteDAO;
import br.com.gomesvh.domain.Cliente;

import javax.swing.*;

/**
 * Classe principal para gerenciar operações de cadastro, consulta, exclusão e alteração de clientes.
 * Utiliza JOptionPane para interações e IClienteDAO para persistência dos dados.
 * @author gomesvh
 */
public class App {
    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);

        while (!isOpcaoValida(opcao)) {
            if (opcao == null || opcao.isEmpty()) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida! Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Green Dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)) {
            switch (opcao) {
                case "1": // Cadastro
                    String dadosCadastro = JOptionPane.showInputDialog(null,
                            "Digite os dados do cliente separados por vírgula (Nome, CPF, Telefone, Endereço, Número, Cidade, Estado)",
                            "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                    cadastrar(dadosCadastro);
                    break;
                case "2": // Consulta
                    String cpfConsulta = JOptionPane.showInputDialog(null,
                            "Digite o CPF do cliente que deseja consultar",
                            "Consultar", JOptionPane.INFORMATION_MESSAGE);
                    consultar(cpfConsulta);
                    break;
                case "3": // Exclusão
                    String cpfExclusao = JOptionPane.showInputDialog(null,
                            "Digite o CPF do cliente que deseja excluir",
                            "Excluir", JOptionPane.INFORMATION_MESSAGE);
                    excluir(cpfExclusao);
                    break;
                case "4": // Alteração
                    String dadosAlteracao = JOptionPane.showInputDialog(null,
                            "Digite os dados atualizados separados por vírgula (Nome, CPF, Telefone, Endereço, Número, Cidade, Estado)",
                            "Alteração", JOptionPane.INFORMATION_MESSAGE);
                    alterar(dadosAlteracao);
                    break;
                case "5": // Sair
                    sair();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }

            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void alterar(String dados) {
        try {
            String[] dadosSeparados = dados.split(",");
            if (dadosSeparados.length == 7) {
                Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2],
                        dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
                iClienteDAO.alterar(cliente);
                JOptionPane.showMessageDialog(null, "Dados do cliente alterados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Entrada incompleta! Certifique-se de inserir todos os dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void cadastrar(String dados) {
        try {
            String[] dadosSeparados = dados.split(",");
            if (dadosSeparados.length == 7) {
                Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2],
                        dadosSeparados[3], dadosSeparados[4], dadosSeparados[5], dadosSeparados[6]);
                boolean isCadastrado = iClienteDAO.cadastrar(cliente);
                if (isCadastrado) {
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente já está cadastrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Entrada incompleta! Certifique-se de inserir todos os dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void excluir(String dados) {
        try {
            Long cpf = Long.parseLong(dados);
            Cliente cliente = iClienteDAO.consultar(cpf);
            if (cliente != null) {
                iClienteDAO.excluir(cpf);
                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!", "Excluir", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado. Nenhuma exclusão foi realizada.", "Excluir", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CPF inválido! Digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void consultar(String dados) {
        try {
            Long cpf = Long.parseLong(dados);
            Cliente cliente = iClienteDAO.consultar(cpf);
            if (cliente != null) {
                JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente, "Consultar", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "Consultar", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "CPF inválido! Digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Encerrando sistema...", "Sair", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    // Métodos auxiliares para validação de opções
    private static boolean isOpcaoValida(String opcao) {
        return "1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao);
    }
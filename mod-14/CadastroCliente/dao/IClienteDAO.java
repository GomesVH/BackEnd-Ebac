package br.com.gomesvh.dao;

import br.com.gomesvh.domain.Cliente;

import java.util.Collection;

/**
 * Interface para manipulação de dados de clientes.
 * Classes que implementarem esta interface devem sobrescrever todos os métodos declarados.
 * Oferece operações para cadastro, exclusão, alteração, consulta e listagem de clientes.
 * @author gomesvh
 */
public interface IClienteDAO {

    /**
     * Cadastra um cliente no repositório de dados.
     *
     * @param cliente O objeto Cliente a ser cadastrado.
     * @return true se o cadastro for bem-sucedido, false caso contrário.
     */
    Boolean cadastrar(Cliente cliente);

    /**
     * Exclui o cliente com base no número de CPF.
     *
     * @param cpf O número de CPF do cliente a ser excluído.
     */
    void excluir(Long cpf);

    /**
     * Altera os dados de um cliente com base nas informações atualizadas.
     *
     * @param cliente O objeto Cliente com os novos dados a serem salvos.
     */
    void alterar(Cliente cliente);

    /**
     * Consulta um cliente com base no número de CPF.
     *
     * @param cpf O número de CPF do cliente a ser consultado.
     * @return O objeto Cliente correspondente ao CPF, ou null se não for encontrado.
     */
    Cliente consultar(Long cpf);

    /**
     * Retorna uma coleção contendo todos os clientes armazenados.
     *
     * @return Uma coleção de objetos Cliente.
     */
    Collection<Cliente> buscarTodos();
}

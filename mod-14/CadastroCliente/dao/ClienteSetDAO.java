package br.com.gomesvh.dao;

import br.com.gomesvh.domain.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Implementação de IClienteDAO que armazena os clientes em um HashSet.
 * Fornece métodos para cadastrar, excluir, alterar, consultar e listar clientes.
 * Os dados são mantidos em memória.
 * @author gomesvh
 */
public class ClienteSetDAO implements IClienteDAO {
    private final Set<Cliente> set;

    /**
     * Cria uma instância de ClienteSetDAO e inicializa o conjunto interno.
     */
    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }

    /**
     * Cadastra um cliente.
     *
     * @param cliente O cliente a ser cadastrado.
     * @return true se o cadastro for bem-sucedido, false se um cliente com o mesmo CPF já existe.
     */
    @Override
    public Boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }

    /**
     * Exclui um cliente com base no número de CPF.
     *
     * @param cpf O número de CPF do cliente a ser excluído.
     */
    @Override
    public void excluir(Long cpf) {
        Iterator<Cliente> iterator = this.set.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getCpf().equals(cpf)) {
                iterator.remove();
                break;
            }
        }
    }

    /**
     * Altera os dados de um cliente.
     *
     * @param cliente O cliente com os novos dados a serem salvos.
     */
    @Override
    public void alterar(Cliente cliente) {
        excluir(cliente.getCpf());
        cadastrar(cliente);
    }

    /**
     * Consulta um cliente com base no número de CPF.
     *
     * @param cpf O número de CPF do cliente a ser consultado.
     * @return O objeto Cliente correspondente ao CPF, ou null se não for encontrado.
     */
    @Override
    public Cliente consultar(Long cpf) {
        for (Cliente cliente : set) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    /**
     * Retorna uma coleção contendo todos os clientes armazenados.
     *
     * @return Uma coleção de objetos Cliente.
     */
    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
}

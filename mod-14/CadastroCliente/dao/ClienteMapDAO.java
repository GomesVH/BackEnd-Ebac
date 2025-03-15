package br.com.gomesvh.dao;

import br.com.gomesvh.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Implementação de IClienteDAO que armazena os clientes em um HashMap.
 * Fornece métodos para cadastrar, excluir, alterar, consultar e listar clientes.
 * Os dados são mantidos em memória.
 * @author gomesvh
 */
public class ClienteMapDAO implements IClienteDAO {
    private final Map<Long, Cliente> map;

    /**
     * Cria uma instância de ClienteMapDAO e inicializa o mapa interno.
     */
    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }

    /**
     * Cadastra um cliente.
     *
     * @param cliente O cliente a ser cadastrado.
     * @return true se o cadastro for bem-sucedido, false se um cliente com o mesmo CPF já existe.
     */
    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())) {
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    /**
     * Exclui um cliente com base no número de CPF.
     *
     * @param cpf O número de CPF do cliente a ser excluído.
     */
    @Override
    public void excluir(Long cpf) {
        this.map.remove(cpf);
    }

    /**
     * Altera os dados de um cliente.
     *
     * @param cliente O cliente com os novos dados a serem salvos.
     */
    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setEndereco(cliente.getEndereco());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }
    }

    /**
     * Consulta um cliente com base no número de CPF.
     *
     * @param cpf O número de CPF do cliente a ser consultado.
     * @return O objeto Cliente correspondente ao CPF, ou null se não for encontrado.
     */
    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    /**
     * Retorna uma coleção contendo todos os clientes armazenados.
     *
     * @return Uma coleção de objetos Cliente.
     */
    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}

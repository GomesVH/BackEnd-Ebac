package src.main.dao.Jpa;

import src.main.Jpa.ClienteJpa;
import src.main.Domain.Jpa.ClienteJpa2;
import src.main.exceptions.DAOException;
import src.main.exceptions.MaisDeUmRegistroException;
import src.main.exceptions.TableException;
import src.main.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

    public ClienteJpaDB3DAO() {
        super(ClienteJpa2.class);
    }

    @Override
    public ClienteJpa cadastrar(ClienteJpa entity) throws TipoChaveNaoEncontradaException, DAOException {
        return null;
    }

    @Override
    public void excluir(ClienteJpa entity) throws DAOException {

    }

    @Override
    public ClienteJpa alterar(ClienteJpa entity) throws TipoChaveNaoEncontradaException, DAOException {
        return null;
    }

    @Override
    public ClienteJpa consultar(Long id) throws MaisDeUmRegistroException, TableException, DAOException {
        return null;
    }

    @Override
    public Collection<ClienteJpa> buscarTodos() throws DAOException {
        return null;
    }
}
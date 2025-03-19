package src.main.services.generic;

import src.main.dao.IPersistente;
import src.main.dao.generic.IGenericDAO;
import src.main.exceptions.DAOException;
import src.main.exceptions.MaisDeUmRegistroException;
import src.main.exceptions.TableException;
import src.main.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

abstract class GenericService<T extends IPersistente, E extends Serializable>
        implements IGenericService<T, E> {

    protected IGenericDAO<T,E> dao;

    public GenericService(IGenericDAO<T,E> dao) {
        this.dao = dao;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(E valor) throws DAOException {
        this.dao.excluir(valor);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws DAOException, MaisDeUmRegistroException, TableException {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }

}
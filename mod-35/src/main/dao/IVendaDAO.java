package src.main.dao;

import src.main.Domain.Venda;
import src.main.dao.generic.IGenericDAO;
import src.main.exceptions.DAOException;
import src.main.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
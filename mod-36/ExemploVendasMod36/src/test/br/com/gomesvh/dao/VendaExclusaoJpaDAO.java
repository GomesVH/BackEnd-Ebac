package br.com.gomesvh.dao;

import br.com.gomesvh.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.gomesvh.dao.jpa.IVendaJpaDAO;
import br.com.gomesvh.domain.jpa.VendaJpa;
import br.com.gomesvh.exceptions.DAOException;
import br.com.gomesvh.exceptions.TipoChaveNaoEncontradaException;

/**
classe utilizada somente no teste para fazer a exclusão das vendas
 *
 */
public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
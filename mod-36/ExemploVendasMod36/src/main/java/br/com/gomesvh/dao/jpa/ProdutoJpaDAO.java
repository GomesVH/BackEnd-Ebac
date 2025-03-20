package br.com.gomesvh.dao.jpa;

import br.com.gomesvh.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.gomesvh.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
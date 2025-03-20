package br.com.gomesvh.dao.jpa;

import br.com.gomesvh.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.gomesvh.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
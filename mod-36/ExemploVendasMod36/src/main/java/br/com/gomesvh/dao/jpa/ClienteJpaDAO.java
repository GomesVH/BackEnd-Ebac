package br.com.gomesvh.dao.jpa;

import br.com.gomesvh.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.gomesvh.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
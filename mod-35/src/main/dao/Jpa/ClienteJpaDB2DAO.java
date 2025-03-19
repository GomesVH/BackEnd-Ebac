package src.main.dao.Jpa;

import src.main.Domain.Jpa.ClienteJpa;
import src.main.dao.generic.GenericJpaDB2DAO;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }
}
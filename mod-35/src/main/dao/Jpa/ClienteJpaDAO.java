package src.main.dao.Jpa;

import src.main.Domain.Jpa.ClienteJpa;
import src.main.dao.generic.jpa.GenericJpaDAO;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO<C> {

    public ClienteJpaDAO() {
        super();
    }

}
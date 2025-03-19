package src.main.dao.generic;

import src.main.dao.Jpa.Persistente;
import src.main.dao.generic.jpa.GenericJpaDAO;

import java.io.Serializable;

public abstract class GenericJpaDB2DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB2DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre2");
    }

}
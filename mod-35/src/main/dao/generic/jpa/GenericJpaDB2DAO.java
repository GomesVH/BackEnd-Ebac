package src.main.dao.generic.jpa;

import src.main.dao.Jpa.Persistente;

import java.io.Serializable;
c abstract class GenericJpaDB2DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB2DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre2");
    }

}
package src.main.dao.Jpa;

import src.main.Domain.Jpa.ProdutoJpa;
import src.main.dao.generic.jpa.GenericJpaDAO;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class, "Postgre1");
    }

}

package src.main.dao.Jpa;

import src.main.Domain.Jpa.ClienteJpa;
import src.main.Domain.Jpa.ProdutoJpa;
import src.main.Domain.Jpa.VendaJpa;
import src.main.dao.generic.jpa.GenericJpaDAO;
import src.main.exceptions.DAOException;
import src.main.exceptions.TipoChaveNaoEncontradaException;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class VendaJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

    public VendaJpaDAO() {
        super(VendaJpa.class, "Postgre1");
    }

    @Override
    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        super.alterar(venda);
    }

    @Override
    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        super.alterar(venda);
    }

    @Override
    public void excluir(VendaJpa entity) throws DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public VendaJpa cadastrar(VendaJpa entity) throws TipoChaveNaoEncontradaException, DAOException {
        try {
            openConnection();
            entity.getProdutos().forEach(prod -> {
                ProdutoJpa prodJpa = entityManager.merge(prod.getProduto());
                prod.setProduto(prodJpa);
            });
            ClienteJpa cliente = entityManager.merge(entity.getCliente());
            entity.setCliente(cliente);
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
            closeConnection();
            return entity;
        } catch (Exception e) {
            throw new DAOException("ERRO SALVANDO VENDA ", e);
        }

    }

    @Override
    public VendaJpa consultarComCollection(Long id) {
        openConnection();

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<VendaJpa> query = builder.createQuery(VendaJpa.class);
        Root<VendaJpa> root = query.from(VendaJpa.class);
        root.fetch("cliente");
        root.fetch("produtos");
        query.select(root).where(builder.equal(root.get("id"), id));
        TypedQuery<VendaJpa> tpQuery =
                entityManager.createQuery(query);
        VendaJpa venda = tpQuery.getSingleResult();
        closeConnection();
        return venda;
    }
}

package br.com.gomesvh.dao;

import java.util.List;

import br.com.gomesvh.dao.generic.IGenericDAO;
import br.com.gomesvh.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
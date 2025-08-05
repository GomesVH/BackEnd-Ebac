package br.com.gomesvh.service;

import java.util.List;

import br.com.gomesvh.domain.Produto;
import br.com.gomesvh.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
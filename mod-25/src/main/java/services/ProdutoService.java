package src.main.services;

import src.main.dao.IProdutoDAO;
import src.main.domain.Produto;
import src.main.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}
}
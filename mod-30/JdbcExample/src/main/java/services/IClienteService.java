package src.main.services;

import src.main.domain.Cliente;
import src.main.exceptions.DAOException;
import src.main.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {
	Cliente buscarPorCPF(Long cpf) throws DAOException;
}
package src.main.services;

import src.main.dao.IClienteDAO;
import src.main.domain.Cliente;
import src.main.exceptions.DAOException;
import src.main.exceptions.MaisDeUmRegistroException;
import src.main.exceptions.TableException;
import src.main.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}
	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
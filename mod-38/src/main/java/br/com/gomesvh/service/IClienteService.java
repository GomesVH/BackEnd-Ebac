package br.com.gomesvh.service;

import java.util.List;

import br.com.gomesvh.domain.Cliente;
import br.com.gomesvh.exceptions.DAOException;
import br.com.gomesvh.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
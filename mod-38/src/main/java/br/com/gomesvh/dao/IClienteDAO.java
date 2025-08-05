package br.com.gomesvh.dao;

import java.util.List;

import br.com.gomesvh.dao.generic.IGenericDAO;
import br.com.gomesvh.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
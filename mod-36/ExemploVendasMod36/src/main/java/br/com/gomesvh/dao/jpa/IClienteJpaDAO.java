package br.com.gomesvh.dao.jpa;

import br.com.gomesvh.dao.generic.jpa.IGenericJapDAO;
import br.com.gomesvh.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
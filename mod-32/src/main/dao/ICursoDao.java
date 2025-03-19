package src.main.dao;

import java.util.List;

import main.domain.Curso;

public interface ICursoDao {

	public Curso cadastrar(Curso curso);

	public void excluir(Curso cur);

	public List<Curso> buscarTodos();
}
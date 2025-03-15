package dao;
import java.util.Collection;
public interface IGenericDAO<T> {
    void cadastrar(T entity);
    T consultar(String modelo);
    void atualizar(T entity);
    void deletar(String modelo);
    Collection listar();
}
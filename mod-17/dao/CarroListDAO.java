package dao;
import carro.Carro;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class CarroListDAO<T extends Carro> implements IGenericDAO<T> {
    private final List<T> carros;
    public CarroListDAO() {
        this.carros = new ArrayList<>();
    }
    @Override
    public void cadastrar(T entity) {
        if (carros.contains(entity)) {
            System.out.println("Já cadastrado");
        }
        carros.add(entity);
        System.out.println("Cadastrado com sucesso");
    }
    @Override
    public T consultar(String modelo) {
        for (T carro : carros) {
            if (carro.getModelo().equalsIgnoreCase(modelo)) {
                return carro;
            }
        }
        System.out.println("Não encontrado !");
        return null;
    }

    @Override
    public void atualizar(T entity) {
        for (int i = 0; i < carros.size(); i++) {
            T carro = carros.get(i);
            if (carro.getModelo().equals(entity.getModelo())) {
                carros.set(i, entity);
                System.out.println("Carro atualizado: " + entity);
                return;
            }
        }
        System.out.println("Carro não encontrado para atualização.");
    }
    @Override
    public void deletar(String modelo) {
        if (carros.removeIf(carro -> carro.getModelo().equals(modelo))) {
            System.out.println("Carro removido com sucesso");
        } else {
            System.out.println("Carro não encontrado para exclusão");
        }
    }
    @Override
    public Collection listar() {
        return new ArrayList(carros);
    }
}
import carro.Carro;
import carro.Toyota;
import carro.Volkswagen;
import dao.CarroListDAO;
import dao.IGenericDAO;

public class Main {
    public static void main(String[] args) {
        // Instancia o DAO para gerenciamento de carros
        IGenericDAO<Carro> carroDAO = new CarroListDAO<>();

        // Criação de objetos Carro
        Carro volkswagenCar = new Volkswagen("Golf");
        Carro toyotaCar = new Toyota("Camry");

        // Cadastro dos carros
        carroDAO.cadastrar(volkswagenCar);
        carroDAO.cadastrar(toyotaCar);

        // Consulta de um carro pelo modelo
        Carro carroConsultado = carroDAO.consultar("Golf");
        System.out.println("Carro consultado: " + carroConsultado);

        // Atualização do modelo de um carro
        volkswagenCar.setModelo("Jetta");
        carroDAO.atualizar(volkswagenCar);

        // Consulta do carro após a atualização
        Carro carroAtualizado = carroDAO.consultar("Jetta");
        System.out.println("Carro atualizado: " + carroAtualizado);

        // Exclusão de um carro pelo modelo
        carroDAO.deletar("Camry");
        System.out.println("Carro 'Camry' deletado.");

        // Listagem dos carros restantes
        System.out.println("Lista atual de carros: " + carroDAO.listar());
    }
}

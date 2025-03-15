package edu.java.abstractfactory;
import edu.java.abstractfactory.abstracts.Bike;
import edu.java.abstractfactory.abstracts.Factory;
import edu.java.abstractfactory.bike_category.OffRoad;
import edu.java.abstractfactory.bike_category.Sport;
import edu.java.abstractfactory.client.Client;
import java.util.Objects;
/**
 * A classe principal que demonstra o uso do padrão de fábrica abstrata para criar e utilizar motos.
 */
public class App {
    /**
     * O método principal que inicia a aplicação, cria um cliente, uma fábrica e uma moto com base na categoria solicitada.
     *
     * @param args Os argumentos da linha de comando (não utilizados nesta aplicação).
     */
    public static void main(String[] args) {
        // Criação do cliente com a categoria "sport".
        Client client = Client.getInstance("sport");
        // Determina a fábrica com base na categoria solicitada pelo cliente.
        Factory factory = sportOrOffRoad(client);
        // Criação da bicicleta utilizando a fábrica determinada.
        Bike bike = Objects.requireNonNull(factory).create(client.getRequested());
        // Inicia a bicicleta e exibe informações sobre ela.
        bike.start();
        System.out.println("Bike= " + bike);
    }
    /**
     * Determina se o cliente solicitou uma moto Off-Road ou esportiva e retorna a fábrica correspondente.
     *
     * @param client O cliente que fez a solicitação.
     * @return Uma instância da fábrica correspondente à categoria solicitada, ou null se a categoria não for reconhecida.
     */
    private static Factory sportOrOffRoad(Client client) {
        if (client.getRequested().equalsIgnoreCase("offroad")) {
            return new OffRoad();
        } else if (client.getRequested().equalsIgnoreCase("sport")) {
            return new Sport();
        } else {
            return null;
        }
    }
}
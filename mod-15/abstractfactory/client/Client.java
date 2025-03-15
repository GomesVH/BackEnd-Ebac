package edu.java.abstractfactory.client;
/** @author gomesvh
 *
 * A classe que representa um cliente que faz solicitações de motos.
 */
public class Client {
    /**
     * Instância única do cliente (padrão Singleton).
     */
    private static Client client;
    /**
     * A categoria solicitada pelo cliente.
     */
    private final String requested;
    /**
     * Construtor privado para garantir que a classe seja Singleton e inicializar a categoria solicitada.
     *
     * @param requested A categoria solicitada pelo cliente.
     */
    private Client(String requested) {
        this.requested = requested;
    }
    /**
     * Obtém a instância única do cliente, criando-a se ainda não existir.
     *
     * @param requested A categoria solicitada pelo cliente.
     * @return A instância única do cliente.
     */
    public static Client getInstance(String requested) {
        if (client == null) {
            client = new Client(requested);
        }
        return client;
    }
    /**
     * Obtém a categoria solicitada pelo cliente.
     *
     * @return A categoria solicitada pelo cliente.
     */
    public String getRequested() {
        return requested;
    }
}
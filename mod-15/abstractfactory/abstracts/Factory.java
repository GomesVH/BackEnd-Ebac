package edu.java.abstractfactory.abstracts;
/** @author gomesvh
 *
 * A classe abstrata que representa uma fábrica de motos abstrata.
 */
public abstract class Factory {
    /**
     * Cria uma moto com base na categoria solicitada pelo cliente.
     *
     * @param requested A categoria da moto solicitada.
     * @return Uma instância da moto criada.
     */
    public Bike create (String requested) {
        Bike bike = retrieveBike(requested);
        completeTank(bike);
        return bike;
    }
    /**
     * Completa o tanque da moto com um nível de combustível padrão.
     *
     * @param bike A moto à qual o tanque será completado.
     */
    public void completeTank (Bike bike) {
        Integer gasoline = 100;
        bike.fuel(gasoline);
    }
    /**
     * Método abstrato para recuperar uma moto com base na categoria solicitada.
     *
     * @param requested A categoria da moto solicitada.
     * @return Uma instância da moto recuperada.
     */
    public abstract Bike retrieveBike(String requested);
}
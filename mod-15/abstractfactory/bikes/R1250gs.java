package edu.java.abstractfactory.bikes;
import edu.java.abstractfactory.abstracts.Bike;
/** @author gomesvh
 * A classe que representa uma moto Off-Road específica do modelo R1250gs.
 */
public class R1250gs extends Bike {
    /**
     * Construtor para criar uma moto R1250gs com uma cor específica.
     *
     * @param color A cor da moto R1250gs.
     */
    public R1250gs(String color) {
        super(color);
    }
}
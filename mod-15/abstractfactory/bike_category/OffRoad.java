package edu.java.abstractfactory.bike_category;
import edu.java.abstractfactory.abstracts.Bike;
import edu.java.abstractfactory.abstracts.Factory;
import edu.java.abstractfactory.bikes.R1250gs;
/** @author gomesvh
 *
 * A classe que representa a categoria de motos Off-Road.
 */
public class OffRoad extends Factory {

    /**
     * Recupera uma moto Off-Road com base na categoria solicitada.
     *
     * @param requested A categoria da moto solicitada.
     * @return Uma instância da moto Off-Road recuperada, ou null se a categoria não for reconhecida.
     */
    @Override
    public Bike retrieveBike(String requested) {
        if ("offroad".equalsIgnoreCase(requested)) {
            return new R1250gs("Azul");
        }
        return null;
    }
}
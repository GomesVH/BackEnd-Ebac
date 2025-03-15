package edu.java.abstractfactory.bike_category;
import edu.java.abstractfactory.abstracts.Bike;
import edu.java.abstractfactory.abstracts.Factory;
import edu.java.abstractfactory.bikes.S1000rr;
/** @author gomesvh
 * A classe que representa a categoria de motos esportivas.
 */
public class Sport extends Factory {
    /**
     * Recupera uma moto esportiva com base na categoria solicitada.
     *
     * @param requested A categoria da moto esportiva solicitada.
     * @return Uma instância da moto esportiva recuperada, ou null se a categoria não for reconhecida.
     */
    @Override
    public Bike retrieveBike(String requested) {
        if ("Sport".equalsIgnoreCase(requested)) {
            return new S1000rr("Vermelha");
        }
        return null;
    }
}
package edu.java.abstractfactory.abstracts;
/** @author gomesvh
 *
 * A classe abstrata que representa uma moto genérica.
 */
public abstract class Bike {
    /**
     * A cor da moto.
     */
    private final String color;
    /**
     * O nível de combustível da moto, inicializado com 30% por padrão.
     */
    private Integer fuelSrouce = 30;
    /**
     * Construtor para inicializar uma moto com uma cor específica.
     *
     * @param color A cor da moto.
     */

    public Bike(String color) {
        this.color = color;
    }
    /**
     * Inicia a moto e exibe o nível atual de combustível.
     */
    public void start () {
        System.out.println("Ligando a moto... Tanque está " + fuelSrouce + "% abastecido !");
    }
    /**
     * Abastece a moto com um determinado nível de combustível.
     *
     * @param fuelSrouce O novo nível de combustível.
     */
    public void fuel (Integer fuelSrouce) {
        this.fuelSrouce = fuelSrouce;
    }
}
package edu.java.abstract_factory;
public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("B".equals(requestedGrade)) {
            return new CorolaCar(100, "Cheio", "Azul");
        } else {
            return null;
        }
    }
}
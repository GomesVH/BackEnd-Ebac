package edu.java.abstract_factory;
public class SemContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Brasilia(80, "Meio tanque", "Vermelha");
        } else {
            return null;
        }
    }
}
package edu.java.gomesvh;

/**
 * Classe para receber 4 notas, calcular a soma e a média final das notas.
 * @author gomesvh
 */
public class SistemaDeNotas {
    // Atributos
    private final double nota1;
    private final double nota2;
    private final double nota3;
    private final double nota4;
    private double somaDasNotas;
    private double mediaFinal;

    // Construtor
    public SistemaDeNotas(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    // Getters
    public double getSomaDasNotas() {
        return somaDasNotas;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    // Métodos
    public void somarNotas() {
        somaDasNotas = this.nota1 + this.nota2 + this.nota3 + this.nota4;
    }

    public void calcularMediaFinal() {
        somarNotas();
        mediaFinal = somaDasNotas / 4;
    }
}

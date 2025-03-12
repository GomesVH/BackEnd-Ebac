package edu.java.gomesvh;

/**
 * Classe para calcular a média de 4 notas.
 * Recebe 4 notas, possui métodos para somar essas notas e calcular a média.
 * @author gomesvh
 */
public class CalculadoraMedia {
    /** 
     * Atributos
     * As notas são definidas como final por não necessitarem de mudanças após a inicialização do construtor.
     */
    private final double nota1;
    private final double nota2;
    private final double nota3;
    private final double nota4;
    private double somaDasNotas;
    private double mediaFinal;

    /**
     * Construtor para inicializar as notas.
     * @param nota1 Nota 1
     * @param nota2 Nota 2
     * @param nota3 Nota 3
     * @param nota4 Nota 4
     */
    public CalculadoraMedia(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    /** 
     * Getters
     */
    public double getSomaDasNotas() {
        return somaDasNotas;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    /**
     * Método para somar as notas.
     */
    public void somarNotas() {
        somaDasNotas = this.nota1 + this.nota2 + this.nota3 + this.nota4;
    }

    /**
     * Método para calcular a média final das notas.
     * Chama o método somarNotas() para garantir que a soma está atualizada.
     */
    public void calcularMediaFinal() {
        somarNotas();
        mediaFinal = somaDasNotas / 4;
    }
}

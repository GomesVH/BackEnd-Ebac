package edu.java.gomesvh;

/**
 * Classe para demonstrar autoboxing, unboxing e casting (implícito e explícito).
 * @author gomesvh
 */
public class Wrapper {
    // Atributos
    private int valorInt;
    private double valorDoub;
    private Integer valorInteger;
    private Double valorDouble;
    private int valorInt1;
    private short valorShort;

    // Construtor
    public Wrapper() {}

    // Getters & Setters
    public int getValorInt() {
        return valorInt;
    }
    public void setValorInt(int valorInt) {
        this.valorInt = valorInt;
    }
    public double getValorDoub() {
        return valorDoub;
    }
    public void setValorDoub(double valorDoub) {
        this.valorDoub = valorDoub;
    }
    public Integer getValorInteger() {
        return valorInteger;
    }
    public void setValorInteger(Integer valorInteger) {
        this.valorInteger = valorInteger;
    }
    public Double getValorDouble() {
        return valorDouble;
    }
    public void setValorDouble(Double valorDouble) {
        this.valorDouble = valorDouble;
    }
    public int getValorInt1() {
        return valorInt1;
    }
    public void setValorInt1(int valorInt1) {
        this.valorInt1 = valorInt1;
    }
    public short getValorShort() {
        return valorShort;
    }
    public void setValorShort(short valorShort) {
        this.valorShort = valorShort;
    }

    // Métodos
    public void autoBoxInteger() {
        setValorInteger(getValorInt());
    }
    public void unboxingDouble() {
        setValorDoub(getValorDouble());
    }
    public void castingImplicito() {
        setValorInt1(getValorShort());
    }
    public void castingExplicito() {
        setValorShort((short) getValorInt1());
    }
}

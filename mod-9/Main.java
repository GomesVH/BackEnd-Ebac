package edu.java.gomesvh;

import java.util.Scanner;

/**
 * Classe principal para demonstrar autoboxing, unboxing e casting (implícito e explícito).
 * @author gomesvh
 */
public class Main {
    public static void main(String[] args) {
        // Instancia o Scanner e a classe Wrapper
        Scanner scan = new Scanner(System.in);
        Wrapper wrapperCast = new Wrapper();

        // Input de variáveis e chamada de métodos
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println(" * * * * * EXERCÍCIO DE AUTOBOXING, UNBOXING E CASTING (IMPLÍCITO E EXPLÍCITO) * * * * *");

        // Autoboxing
        System.out.println("-----------------------------------------\n");
        System.out.print("Digite um INT para autoboxing: ");
        wrapperCast.setValorInt(scan.nextInt());
        wrapperCast.autoBoxInteger();
        System.out.println("(Primitivo) int: [ " + wrapperCast.getValorInt() + " ] foi convertido para (Wrapper) Integer: [ " + wrapperCast.getValorInteger() + " ]\n");

        // Unboxing
        System.out.println("-----------------------------------------\n");
        System.out.print("Digite um DOUBLE usando ',' para unboxing: ");
        wrapperCast.setValorDouble(scan.nextDouble());
        wrapperCast.unboxingDouble();
        System.out.println("(Wrapper) Double: [ " + wrapperCast.getValorDouble() + " ] foi convertido para (Primitivo) double: [ " + wrapperCast.getValorDoub() + " ]\n");

        // Casting Implícito
        System.out.println("-----------------------------------------\n");
        System.out.print("Digite um SHORT para um CASTING IMPLÍCITO (INT = SHORT): ");
        wrapperCast.setValorShort(scan.nextShort());
        wrapperCast.castingImplicito();
        System.out.println("Foi realizado o CASTING IMPLÍCITO de um SHORT [ " + wrapperCast.getValorShort() + " ] para INT [ " + wrapperCast.getValorInt1() + " ]\n");

        // Casting Explícito
        System.out.println("-----------------------------------------\n");
        System.out.print("Digite um INT para um CASTING EXPLÍCITO (SHORT = (CAST) INT): ");
        wrapperCast.setValorInt1(scan.nextInt());
        wrapperCast.castingExplicito();
        System.out.println("Foi realizado o CASTING EXPLÍCITO de um INT [ " + wrapperCast.getValorInt1() + " ] para SHORT [ " + wrapperCast.getValorShort() + " ]\n");

        scan.close();
    }
}

package edu.java.gomesvh;

public class Main {
    public static void main(String[] args) {
        // Cria uma nova instância da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Fulano", 1.75f, (byte) 25);

        // Exibe informações usando getters e setters
        System.out.println("\n-----------------------------------------");
        System.out.println("Chamando Getters & Setters");
        System.out.println("Retorno: \n");
        System.out.println(
                pessoa1.getNome() + " tem " + pessoa1.getIdade() +
                " anos de idade e " + pessoa1.getAltura() + " de altura"
        );
        System.out.println("-----------------------------------------");

        // Chama o método andar()
        System.out.println("Chamando método andar()");
        System.out.println("Retorno: \n");
        pessoa1.andar();
        System.out.println("-----------------------------------------");

        // Chama o método comer() passando "Pão" como parâmetro
        System.out.println("Chamando método comer() passando 'Pão' como parâmetro & nome=Fulano;");
        System.out.println("Retorno: \n");
        pessoa1.comer("Pão");
        System.out.println("-----------------------------------------");
    }
}

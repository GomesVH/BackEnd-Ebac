Procedural é um paradigma antigo e ainda valido para como por exemplo em programação de baixo nível como por exemplo C, mas entrou em desuso e a POO vem dominando o mercado.

POO também é um paradigma de programação que um dos seus destaques é um código manutenível e de simples entendimento por tratar classes como entidades reais (Objeto é uma instância de uma classe) com seus próprios atributos e métodos( exemplo de atributos: nome, cpf, idade, sexo | exemplo de métodos: falar(), andar(), comer() ).
----------------------------------------
	public class Pessoa {

	   public String nome;
	   private Long cpf;
 	   short idade;

	   public Pessoa (String nome, Long cpf, short idade) {
	     this.nome = nome;
	     this.cpf = cpf;
	     this.idade = idade;
	   }

       	   public String getNome() {
             return nome;
           }

           public void setNome(String nome) {
             this.nome = nome;
           }

  	   public void andar() {
  	     System.out.println(nome + " Está andando");
  	   }
  	   public void falar() {
  	     System.out.println(nome + " Está falando");
  	   }
  	}
----------------------------------------
Só para complementar ainda existem conceitos não abordados referente ao método constructor, getters e setters e também e conceitos base como abstração, herança, polimorfismo e encapsulamento.
----------------------------------------

	---Algoritmo acordando---

-Ao acordar abrir os olhos
-Levantar da cama
-Pegar garrafa d'água
-Beber água
-Ir ao banheiro
-Escovar os dentes
-Verificar compromissos
   -Se houver compromisso {verificar prioridades}
-Tomar café da manhã
-Se o café estiver pronto {tomar}
   -senão -{fazer café() {-colocar X de água na panela,
   -enquanto água não ferve colocar pó no coador,
   -após água começar ferver ir colocando devagar no coador com pó de café até acabar a água, }}
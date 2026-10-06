package jogo.src;

public class Persona3{
    String nome;
  private int vida;

  public Persona3(String nomeEscolhido){
    this.nome = nomeEscolhido;
    this.vida = 100;
    System.out.println("Ninguém consegue escapar ao tempo. Ele entrega-nos a todos ao mesmo fim.");
  }
  

 
    void tomarPocaoCurativa(int cura){
        if (vida > 200){
            vida = 300;
        }
        System.out.println("Vida" + cura);
    }
    void receberDano(int dano){
        vida = vida - dano;
        if(vida <= 0){
        vida = 0;
        System.out.println("A tua jornada chegou ao fim antes de ter começado verdadeiramente...");
    }else{
        System.out.println(" O HP do está baixo! Por favor, tem cuidado"+ dano);

    }
}}
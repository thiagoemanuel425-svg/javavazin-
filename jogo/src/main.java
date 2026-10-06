package jogo.src;

public class main {
    public static void main(String[] args){
        Persona3  makoto = new Persona3("makoto java");
        Persona3 akihiko = new Persona3( "akihiko sanada");
      makoto.nome = "makoto java";
     makoto.nome = "akihiko sanada";
    System.out.println(" Iniciar jogo \n");

      makoto.receberDano(70);//60
     makoto.tomarPocaoCurativa( 20);
     makoto.tomarPocaoCurativa( 30);
     
     makoto.vida = 9999;
    System.out.println("vida atual");
    makoto.receberDano(5489);
    System.out.println("Vida Atual após o dano");
    }
}

package metodos;

public class main {
  
    public static void main(String[] args) {
        
        freddao freddao = new freddao();
        freddao.nome = "Freddie";
        freddao.microfone = " HUHUHUHUHUH";

        foxy foxy = new foxy();
        foxy.microfone = "ELE É O GUARDA NORTUNO";

        bonnie bonnie = new bonnie();
        bonnie.microfone = "braço esquerdo";

         System.out.println("Nome :" +freddao.nome);
         System.out.println(" \n ---Polimorfismo");

         freddao.jumpscare();

         chica chica  = new chica();
         chica.microfone = "cupcake";

         System.out.println("Nome :" +freddao.nome);
         System.out.println("Microfone ->" + chica.microfone);
         System.out.println(" \n ---Polimorfismo");

         freddao.jumpscare();
         chica.jumpscare();



    }
}

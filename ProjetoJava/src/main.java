package ProjetoJava.src;

public class main {
public static void main(String[] args){
 ContaCorrente minhaConta = new  ContaCorrente();
 minhaConta.nomeUser = "bob";
 minhaConta.saldo = 500.0;

 depositar acaodepositar = new depositar();
 acaodepositar.depositar(acaodepositar, 500);
 System.out.println("quantidade depositada ");
 sacar acaosacar = new sacar();
 acaosacar.sacar(acaosacar, 300);
 System.out.println("quantidade sacada " + acaosacar);


}
}
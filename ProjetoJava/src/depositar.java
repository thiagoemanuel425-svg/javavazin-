package ProjetoJava.src;

public class depositar extends ContaCorrente{
  
  void depositar(ContaCorrente contaAlvo, double valor, double saldo){
     contaAlvo.sacar();
    contaAlvo.saldo = contaAlvo.saldo + valor;
    System.out.println("deposito "+ valor);
    System.out.println("sacar " + valor);
  }
 
}

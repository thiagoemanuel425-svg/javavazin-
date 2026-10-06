package ProjetoJava.src;

public class sacar extends ContaCorrente{
    
    void sacar (ContaCorrente contaAlvo, double valor){
    if (contaAlvo.saldo >= valor){
    contaAlvo.saldo = contaAlvo.saldo + valor;
    System.out.println("Saque de R$" +valor + "realizar pagamento");
    }else{
        System.out.println("operação negada = saldo insuficiente\n");
    }
}
 
}
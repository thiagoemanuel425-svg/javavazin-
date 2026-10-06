package javaOO.javapoo1;

public class Main{


    public static void main(String[] args){

       lampada lampada = new lampada();
       lampada.cor ="branca";
       lampada.marca = "Positivo";
       lampada.Modelo = "messiah";
       lampada.Voltagem =7;
       lampada.tipo ="ledzin seco seco";
       System.out.println("cor -" + lampada.cor);
       System.out.println("Marca -" + lampada.marca);
       System.out.println("Modelo -" + lampada.Modelo);
       System.out.println("VOLTAGEM -" + lampada.Voltagem);
       System.out.println("tipo -" + lampada.tipo);
    }
}
package Topico01TiposPrimitivos;

public class Aula02TiposPrimitivos {
    public static void main(String [] args) {
    int idade = (int) 10000000000L;
    //assim estou forçando ele a transformar o numero em inteiro, que chamamos de casting
    long numeroGrande = 2000L;
    float salarioFloat = (int) 2555.99;
    byte idadeByte = 127;
    short idadeShort = 32000;
    boolean verdadeiro = true;
    boolean falso = false;
    char caractere = '\u0041';
    String nome = "um graaaaande texto";
    String nome2 = "Alisson";

    System.out.println("A idade é "+idade+" anos.");
    System.out.println(numeroGrande);
    System.out.println(idadeByte);
    System.out.println(idadeShort);
    System.out.println(verdadeiro);
    System.out.println(falso);
    System.out.println("char "+caractere);
    System.out.println(salarioFloat);
    System.out.println("Meu nome é "+nome2);
    System.out.println(nome);
    }
}
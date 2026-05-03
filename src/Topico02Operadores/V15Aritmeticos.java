package Topico02Operadores;

public class V15Aritmeticos {
    public static void main(String[] args) {
        // + - / * //
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero01+numero02);
        System.out.println("Valor = "+numero01+numero02);
        //diferente pois so concatena os numeros, isso é, junta eles
        System.out.println(numero01+numero02+" Valor = "+numero01+numero02);
        //aqui é soma, e depois como tem uma string,todo sinal de soma sera usado para concatenar
        int soma = numero01 + numero02;
        int multiplicacao = numero01 * numero02;
        int divisao = numero01 / numero02;
        System.out.println(soma);
        System.out.println(multiplicacao);
        System.out.println(divisao); 
        /*
        10/20 o certo seria 0.5, mas da zero pois so estamos usando int
        entao se usarmos o double, começa a aceitar valores fracionados
        */
       double divisao2 = numero01 / (double) numero02;
       System.out.println(divisao2);

        //% representa o resto da divisao
        int resto1 = 20 % 2;
        System.out.println(resto1);

        int resto2 = 20 % 3;
        System.out.println(resto2);
    }
}
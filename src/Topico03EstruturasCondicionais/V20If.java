package Topico03EstruturasCondicionais;

public class V20If{
    public static void main(String[] args) {
        if (true) {
            System.out.println("Dentro do if");
        }
        System.out.println("Fora do if");
    
        int idade = 15;
        if (idade > 18) {
            System.out.println("Autorizado.");
        }
        boolean isAutorizadoComprarBebida = idade >= 18;
        //se a idade for menor que 18, nao aparece nada
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado!");
        }
        if (isAutorizadoComprarBebida == false) {
            System.out.println("Não autorizado!");
        }
        //da de usar assim tambem
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado!");
        }
    }
}
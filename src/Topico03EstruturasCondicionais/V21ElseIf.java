package Topico03EstruturasCondicionais;

public class V21ElseIf {
    public static void main(String[] args) {
        int idade = 22;
        boolean isAutorizadoComprarBebida = idade >= 18;
        
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado!");
        }else{
            System.out.println("Não autorizado!");
        }
    }
}

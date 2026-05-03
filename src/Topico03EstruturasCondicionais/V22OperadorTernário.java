package Topico03EstruturasCondicionais;

public class V22OperadorTernário {
    public static void main(String[] args) {
        //doar se salario maior que 5000
        double salario = 3000;
        String mensagemDoar = "Eu vou doar.";
        String mensagemNaoDoar = "Ainda nao tenho condições.";
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar: mensagemNaoDoar;
        System.out.println(resultado);

        /*
        antes faria assim mas se for duas condições simples da de fzr usando o metodo acima
        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        //(condicao) ? verdadeiro : falso
        */        
    }    
}

package Topico03EstruturasCondicionais;

public class V23TabelaVerdade {
    public static void main(String[] args) {
        double salario = 45000;
        double taxa = 0, imposto = 0;
        if (salario > 0 && salario <= 34712) {
            taxa = 0.097;
        } else if ( salario >= 34712 && salario < 68508) {
            taxa = 0.3735;
        } else {
            taxa = 0.495;
        }
        imposto = salario * taxa;
        System.out.println(imposto);
    }
}
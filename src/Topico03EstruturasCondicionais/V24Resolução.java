package Topico03EstruturasCondicionais;

public class V24Resolução {
    public static void main(String[] args) {
        //€ 0   €  347122   € 9,7%
        //€  34713  € 68507 37,35%
        //€  68508  49,5%
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual >= 0 && salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual > 34712 &&salarioAnual <= 68507) {
            valorImposto =salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
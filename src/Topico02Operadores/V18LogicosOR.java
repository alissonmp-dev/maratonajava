package Topico02Operadores;

public class V18LogicosOR {
    public static void main(String[] args) {
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 5000;
        float valorPlayStation = 5000f;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel "+isPlayStationCincoCompravel);
    }
}
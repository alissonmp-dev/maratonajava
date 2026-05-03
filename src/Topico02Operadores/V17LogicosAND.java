package Topico02Operadores;

public class V17LogicosAND {
    public static void main(String[] args) {
        
        // && (AND) || (OR) !
        int idade = 29;
        float salario = 4500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);
    }    
}
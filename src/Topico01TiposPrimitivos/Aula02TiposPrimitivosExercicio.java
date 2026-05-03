package Topico01TiposPrimitivos;

public class Aula02TiposPrimitivosExercicio {
    public static void main(String[] args) {
        /*
        Crie variáveis para os campos descritos abaixo
        entre <> e imprima a seguinte mensagem:
        Eu <nome>, morando no endereço <endereço>, 
        confirmo que recebi o salário de <salario>, na data <data>.
        */
        String nome = "Alisson";
        String endereço = "Rua Dr. Nascimento 75";
        float salario = 5432.10f;
        String dataRcebimentoSalario = "15/03/2026";

        System.out.print("Eu, "+nome+" morando no endereço " +endereço);
        System.out.print(", confirmo que recebi o salário de R$ "+salario);
        System.out.print(" no dia "+dataRcebimentoSalario);
    }
}

package Topico02Operadores;

public class V19Atribuição {
    public static void main(String[] args) {
        // = += -= *= /= %=
        double bonus = 1800;
        bonus = bonus + 1000;
        System.out.println(bonus);
        double qtd = 1500;
        qtd += 1000; 
        // aqui é o mesmo que qtd = qtd + 1000;
        System.out.println(qtd);
        qtd -= 500;
        // aqui é o mesmo que qtd = qtd - 500;
        System.out.println(qtd);
        qtd *= 2.5f;
        System.out.println(qtd);
        qtd /= 4;
        System.out.println(qtd);
        qtd %= 2;
        System.out.println(qtd);

        int contador = 0;
        contador += 1;
        System.out.println(contador);
        contador++;
        System.out.println(contador);
        contador++;
        System.out.println(contador);
    }
}
package br.edu.unieuro.recusividade.nove;

public class Crescente {

    public static void main(String[] args) {
        crescence(13, 0);
    }

    private static void crescence(int numero, int atual) {
        if (numero < atual) {
            return;
        }
        System.out.println(atual);
        crescence(numero, atual + 1);
    }
}

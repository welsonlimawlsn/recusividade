package br.edu.unieuro.recusividade.dois;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(0, 1, 10));
    }

    private static long fibonacci(long atual, long proximo, int posicao) {

        if (posicao == 1) {
            return atual;
        }

        return fibonacci(proximo, atual + proximo, posicao - 1);
    }
}

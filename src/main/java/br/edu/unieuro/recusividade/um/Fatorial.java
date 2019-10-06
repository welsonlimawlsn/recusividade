package br.edu.unieuro.recusividade.um;

public class Fatorial {

    public static void main(String[] args) {
        System.out.println(fatorial(7));
    }

    private static long fatorial(long numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O numero não pode ser menor que 0");
        }

        if (numero == 0) {
            return 1;
        }

        return numero * fatorial(numero - 1);
    }
}

package br.edu.unieuro.recusividade.cinco;

public class Somatorio {

    public static void main(String[] args) {
        System.out.println(somatorio(5));
    }

    private static int somatorio(int numero) {
        if (numero == 1) {
            return 1;
        }
        return numero + somatorio(numero - 1);
    }
}

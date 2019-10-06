package br.edu.unieuro.recusividade.dez;

public class Decrescente {

    public static void main(String[] args) {
        decrescente(1000);
    }

    public static void decrescente(int numero) {
        if (numero < 0) {
            return;
        }
        System.out.println(numero);
        decrescente(numero - 1);
    }
}

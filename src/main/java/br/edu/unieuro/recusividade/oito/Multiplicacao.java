package br.edu.unieuro.recusividade.oito;

public class Multiplicacao {

    public static void main(String[] args) {
        System.out.println(multiplicacao(5, 7));
    }

    private static int multiplicacao(int x, int y) {
        if (y == 1) {
            return x;
        }
        return x + multiplicacao(x, y - 1);
    }
}

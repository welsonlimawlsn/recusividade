package br.edu.unieuro.recusividade.sete;

public class Ocorrencia {

    public static void main(String[] args) {

        System.out.println(ocorrencia(1417432414, 4, 0));
    }

    private static int ocorrencia(long numero, int x, int posicao) {
        char[] chars = String.valueOf(numero).toCharArray();
        if (posicao >= chars.length) {
            return 0;
        }
        return (Character.getNumericValue(chars[posicao]) == x ? 1 : 0) + ocorrencia(numero, x, posicao + 1);
    }
}

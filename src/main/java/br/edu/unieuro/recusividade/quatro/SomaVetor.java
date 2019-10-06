package br.edu.unieuro.recusividade.quatro;

public class SomaVetor {

    public static void main(String[] args) {
        System.out.println(somaVetor(new int[]{1, 2, 3, 4, 5}, 0));
    }

    private static int somaVetor(int[] vetor, int inicio) {
        if (inicio == vetor.length - 1) {
            return vetor[inicio];
        }
        return vetor[inicio] + somaVetor(vetor, inicio + 1);
    }
}

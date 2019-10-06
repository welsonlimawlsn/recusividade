package br.edu.unieuro.recusividade.seis;

public class InverteVetor {

    public static void main(String[] args) {
        double[] vetor = new double[100000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }
        long inicio = System.currentTimeMillis();
        inverteVetor(vetor, 0, vetor.length - 1);
        long fim = System.currentTimeMillis();
        System.out.println(fim - inicio);
    }

    private static void inverteVetor(double[] vetor, int inicio, int fim) {
        if (inicio > fim) {
            return;
        }
        double temp = vetor[inicio];
        vetor[inicio] = vetor[fim];
        vetor[fim] = temp;

        inverteVetor(vetor, inicio + 1, fim - 1);
    }
}

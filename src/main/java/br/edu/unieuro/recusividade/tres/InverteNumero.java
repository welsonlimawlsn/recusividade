package br.edu.unieuro.recusividade.tres;

public class InverteNumero {

    public static void main(String[] args) {
        System.out.println(inverteNumero(1234567891, 0, 9));
    }

    private static long inverteNumero(long numero, int inicio, int fim) {
        char[] chars = String.valueOf(numero).toCharArray();
        if (inicio == chars.length / 2) {
            return numero;
        }

        char temp = chars[inicio];
        chars[inicio] = chars[fim];
        chars[fim] = temp;

        return inverteNumero(Long.parseLong(new String(chars)), inicio + 1, fim - 1);
    }
}

package somafor;

import java.util.Scanner;

public class SomaFor {
    public static void main(String[] args) {
        int soma = 0, numero;
        Scanner leiaTeclado = new Scanner(System.in);
        for (int i = 0; i <= 14; i++) {
            System.out.println("Digite um número: ");
            numero = leiaTeclado.nextInt();
            soma = numero + soma;
        }
        System.out.println("A soma dos números digitados é: " + soma);
        leiaTeclado.close();
    }

}

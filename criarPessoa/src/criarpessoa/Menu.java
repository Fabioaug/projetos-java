package criarpessoa;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        criarPessoa ex = new criarPessoa();
        Scanner in = new Scanner(System.in);
        int entrada;

        while (true) {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Criar pessoa");
            System.out.println("2 - Mostrar pessoas");
            System.out.println("3 - Sair");
            entrada = in.nextInt();
            in.nextLine();

            switch (entrada) {
                case 1 -> ex.criarPessoas();
                case 2 -> ex.mostrarPessoas();
                case 3 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
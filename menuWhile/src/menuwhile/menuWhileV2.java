package menuwhile;

import java.util.Scanner;

public class menuWhileV2 {

    static void imprimirMensagem() {
        System.out.println(
                "1 - Vendas\n2 - Minha conexão voltou ao normal\n3 - Internet lenta ou sem conexão\n4 - Agendar uma visita\n5 - Suporte\n6 - Financeiro\n7 - Pós venda");
        System.out.println("Digite 0 para sair!");
    }

    public static void main(String[] args) {
        Scanner leiaTeclado = new Scanner(System.in);
        int opcao = -1;
        int entrada;

        System.out.println(
                "Bem-Vindo ao nosso sistema de Atendimento!\nDigite um número para acessar a função desejada: \n1 - Vendas\n2 - Minha conexão voltou ao normal\n3 - Internet lenta ou sem conexão\n4 - Agendar uma visita\n5 - Suporte\n6 - Financeiro\n7 - Pós venda");
        System.out.println("Digite 0 para sair!");

        while (opcao != 0) {
            opcao = leiaTeclado.nextInt();

            if (opcao == 1) {
                System.out.println(
                        "Seguir para vendas?\nDigite 1 para sim ou 9 para não!\nDigite 8, para voltar ao menu!");
                entrada = leiaTeclado.nextInt();
                if (entrada == 1) {
                    System.out.println("OK!");
                    opcao = 0;
                } else if (entrada == 8) {
                    imprimirMensagem();
                } else if (entrada == 9) {
                    System.out.println("Digite 8 para voltar ao menu ou digite 0 para sair!");
                }
            } else if (opcao == 2) {
                System.out.println(
                        "Sua conexão voltou ao normal?\nDigite 1 para sim ou 9 para não!\nDigite 8, para voltar ao menu!");
                entrada = leiaTeclado.nextInt();
                if (entrada == 1) {
                    System.out.println("OK!");
                    opcao = 0;
                } else if (entrada == 8) {
                    imprimirMensagem();
                } else if (entrada == 9) {
                    System.out.println("Digite 8 para voltar ao menu ou digite 0 para sair!");
                }
            } else if (opcao == 3) {
                System.out.println(
                        "Internet lenta ou sem conexão?\nDigite 1 para sim ou 9 para não!\nDigite 8, para voltar ao menu!");
                entrada = leiaTeclado.nextInt();
                if (entrada == 1) {
                    System.out.println("OK!");
                    opcao = 0;
                } else if (entrada == 8) {
                    imprimirMensagem();
                } else if (entrada == 9) {
                    System.out.println("Digite 8 para voltar ao menu ou digite 0 para sair!");
                }
            } else if (opcao == 4) {
                System.out.println(
                        "Agendar sua visita?\nDigite 1 para sim ou 9 para não!\nDigite 8, para voltar ao menu!");
                entrada = leiaTeclado.nextInt();
                if (entrada == 1) {
                    System.out.println("OK!");
                    opcao = 0;
                } else if (entrada == 8) {
                    imprimirMensagem();
                } else if (entrada == 9) {
                    System.out.println("Digite 8 para voltar ao menu ou digite 0 para sair!");
                }
            } else if (opcao == 5) {
                System.out.println(
                        "Seguir para o suporte?\nDigite 1 para sim ou 9 para não!\nDigite 8, para voltar ao menu!");
                entrada = leiaTeclado.nextInt();
                if (entrada == 1) {
                    System.out.println("OK!");
                    opcao = 0;
                } else if (entrada == 8) {
                    imprimirMensagem();
                } else if (entrada == 9) {
                    System.out.println("Digite 8 para voltar ao menu ou digite 0 para sair!");
                }
            } else if (opcao == 6) {
                System.out.println(
                        "Seguir para o financeiro?\nDigite 1 para sim ou 9 para não!\nDigite 8, para voltar ao menu!");
                entrada = leiaTeclado.nextInt();
                if (entrada == 1) {
                    System.out.println("OK!");
                    opcao = 0;
                } else if (entrada == 8) {
                    imprimirMensagem();
                } else if (entrada == 9) {
                    System.out.println("Digite 8 para voltar ao menu ou digite 0 para sair!");
                }
            } else if (opcao == 7) {
                System.out.println(
                        "Seguir para o pós venda?\nDigite 1 para sim ou 9 para não!\nDigite 8, para voltar ao menu!");
                entrada = leiaTeclado.nextInt();
                if (entrada == 1) {
                    System.out.println("OK!");
                    opcao = 0;
                } else if (entrada == 8) {
                    imprimirMensagem();
                } else if (entrada == 9) {
                    System.out.println("Digite 8 para voltar ao menu ou digite 0 para sair!");
                }
            } else if (opcao == 0) {
                System.out.println("Obrigado por usar nossos serviços!");
            } else {
                System.out.println("Número inválido! Digite um número válido ou 0 para sair.");
            }
        }

        leiaTeclado.close();
    }
}

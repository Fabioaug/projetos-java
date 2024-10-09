package criarFuncionario;

import java.util.Scanner;

public class Main {
    public static final CriarFuncionario criarfuncionario = new CriarFuncionario();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println(
                    "O que deseja fazer?\n1 - Criar funcionário\n2 - Mostrar folha de pagamento\n3 - Alterar remuneração\n4 - Sair!");
            int entrada = in.nextInt();
            in.nextLine();

            switch (entrada) {
                case 1 -> criarfuncionario.criarFuncionario();
                case 2 -> System.out.println(criarfuncionario.imprimir());
                case 3 -> alterarRemuneracao();
                case 4 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    public static void alterarRemuneracao() {
        System.out.println("Digite o número do crachá do funcionário para alterar: ");
        int cracha = in.nextInt();
        in.nextLine();

        for (Funcionario f : criarfuncionario.listaFuncionarios) {
            if (f.getCracha() == cracha) {
                if (f.getTipoVinculo() == 'n') {
                    System.out.println("Digite o novo valor do salário: ");
                    float novoSalario = in.nextFloat();
                    f.setSalario(novoSalario);
                } else if (f.getTipoVinculo() == 'h') {
                    System.out.println("Digite o novo valor do salário/hora: ");
                    float novoValorHora = in.nextFloat();
                    f.setValorHora(novoValorHora);

                    System.out.println("Digite a nova quantidade de horas trabalhadas: ");
                    float novoQtdeHoras = in.nextFloat();
                    f.setQtdeHora(novoQtdeHoras);
                }
                System.out.println("Remuneração alterada com sucesso!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }
}
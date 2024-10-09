package criarFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriarFuncionario {
    protected final List<Funcionario> listaFuncionarios = new ArrayList<>();
    private final Scanner in = new Scanner(System.in);

    public void criarFuncionario() {
        Funcionario funcionario = new Funcionario();

        System.out.println("Digite seu crachá: ");
        int cracha = in.nextInt();
        funcionario.setCracha(cracha);
        in.nextLine();

        System.out.println("Digite seu nome: ");
        String nome = in.nextLine();
        funcionario.setNome(nome);

        System.out.println("Digite seu tipo de vínculo ('n' para normal, 'h' para horista): ");
        String tipovinculo = in.nextLine();
        char tipoVinculo = tipovinculo.charAt(0);
        funcionario.setTipoVinculo(tipoVinculo);

        System.out.println("Digite o valor do desconto em porcentagem (0-100%): ");
        float valordesconto = in.nextFloat();
        funcionario.setValorDesconto(valordesconto / 100);

        if (tipoVinculo == 'n') {
            System.out.println("Digite o valor do salário: ");
            float salario = in.nextFloat();
            funcionario.setSalario(salario);
        } else if (tipoVinculo == 'h') {
            System.out.println("Digite o valor do salário por hora: ");
            float valorHora = in.nextFloat();
            funcionario.setValorHora(valorHora);

            System.out.println("Digite a quantidade de horas trabalhadas: ");
            float qtdeHoras = in.nextFloat();
            funcionario.setQtdeHora(qtdeHoras);
        }

        listaFuncionarios.add(funcionario);
        System.out.println("Funcionário criado com sucesso!");
    }

    public String imprimir() {
        StringBuilder folhaPagamento = new StringBuilder("Folha de pagamento:\n");
        for (Funcionario funcionario : listaFuncionarios) {
            folhaPagamento.append(funcionario.imprimir()).append("\n-------------------\n");
        }
        return folhaPagamento.toString();
    }
}
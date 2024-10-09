package Empresa.Funcionarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    protected static CriarFuncionario criarFuncionario = new CriarFuncionario();
    public static FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("O que deseja fazer?\n1 - Criar funcionário\n2 - Mostrar folha de pagamento\n3 - Alterar remuneração\n4 - Sair!");
            int entrada = in.nextInt();
            in.nextLine();

            switch (entrada) {
                case 1 -> criarFuncionario.criarFuncionario();
                case 2 -> funcionarioDAO.listarFuncionarios();
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
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o crachá do funcionário para alterar a remuneração: ");
        int cracha = in.nextInt();
        in.nextLine();

        System.out.println("Digite o novo valor do salário por hora (0 para manter o valor atual): ");
        float novoValorHora = in.nextFloat();
        System.out.println("Digite o novo valor do salário mensal (0 para manter o valor atual): ");
        float novoSalario = in.nextFloat();
        System.out.println("Digite o novo valor do desconto em porcentagem (0-100%): ");
        float novoDesconto = in.nextFloat() / 100;

        String sql = "UPDATE funcionarios SET valorHora = ?, salario = ?, valorDesconto = ? WHERE cracha = ?";

        try (Connection conexao = ConexaoDB.conectar();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {

            pstmt.setFloat(1, novoValorHora);
            pstmt.setFloat(2, novoSalario);
            pstmt.setFloat(3, novoDesconto);
            pstmt.setInt(4, cracha);

            int linhasAfetadas = pstmt.executeUpdate();
            if (linhasAfetadas > 0) {
                System.out.println("Remuneração atualizada com sucesso.");
            } else {
                System.out.println("Funcionário não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar remuneração: " + e.getMessage());
        }
    }
}

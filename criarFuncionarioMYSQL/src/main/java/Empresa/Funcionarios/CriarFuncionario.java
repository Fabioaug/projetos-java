package Empresa.Funcionarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class CriarFuncionario {
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
        String tipoVinculoInput = in.nextLine();
        char tipoVinculo = tipoVinculoInput.charAt(0);
        funcionario.setTipoVinculo(tipoVinculo);

        System.out.println("Digite o valor do desconto em porcentagem (0-100%): ");
        float valorDesconto = in.nextFloat();
        funcionario.setValorDesconto(valorDesconto / 100);

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

        inserirFuncionarioNoBanco(funcionario);
        System.out.println("Funcionário criado e salvo no banco de dados com sucesso!");
    }

    public void inserirFuncionarioNoBanco(Funcionario funcionario) {
        String sql = "INSERT INTO funcionarios (cracha, nome, tipoVinculo, valorHora, qtdeHora, salario, valorDesconto) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conexao = ConexaoDB.conectar();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, funcionario.getCracha());
            pstmt.setString(2, funcionario.getNome());
            pstmt.setString(3, String.valueOf(funcionario.getTipoVinculo()));
            pstmt.setFloat(4, funcionario.getValorHora());
            pstmt.setFloat(5, funcionario.getQtdeHora());
            pstmt.setFloat(6, funcionario.getSalario());
            pstmt.setFloat(7, funcionario.getValorDesconto());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir funcionário no banco de dados: " + e.getMessage());
        }
    }
}

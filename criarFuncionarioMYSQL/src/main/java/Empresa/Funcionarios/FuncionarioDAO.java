package Empresa.Funcionarios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionarioDAO {

    public void listarFuncionarios() {
        String sql = "SELECT * FROM funcionarios";

        try (Connection conexao = ConexaoDB.conectar();
             Statement s = conexao.createStatement();
             ResultSet rs = s.executeQuery(sql)) {

            if (conexao == null) {
                System.out.println("Falha na conexão com o banco de dados.");
                return;
            }

            while (rs.next()) {
                System.out.println("Crachá: " + rs.getInt("cracha"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Tipo de Vínculo: " + rs.getString("tipoVinculo"));
                System.out.println("Valor Hora: " + rs.getFloat("valorHora"));
                System.out.println("Quantidade Horas: " + rs.getFloat("qtdeHora"));
                System.out.println("Salário: " + rs.getFloat("salario"));
                System.out.println("Desconto: " + rs.getFloat("valorDesconto"));
                System.out.println("-------------------");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar funcionários: " + e.getMessage());
        }
    }
}

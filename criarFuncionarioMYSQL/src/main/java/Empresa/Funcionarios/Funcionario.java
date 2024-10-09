package Empresa.Funcionarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float calcularSalario() {
        return valorHora * qtdeHora;
    }

    public float calcularValorReceber() {
        if (tipoVinculo == 'n') {
            return salario - (salario * valorDesconto);
        } else {
            return calcularSalario() - (calcularSalario() * valorDesconto);
        }
    }
    public void salvarFuncionario(Connection conexao) {
        String sql = "INSERT INTO funcionarios (cracha, nome, tipoVinculo, valorHora, qtdeHora, salario, valorDesconto) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, this.cracha);
            stmt.setString(2, this.nome);
            stmt.setString(3, String.valueOf(this.tipoVinculo));
            stmt.setFloat(4, this.valorHora);
            stmt.setFloat(5, this.qtdeHora);
            stmt.setFloat(6, this.salario);
            stmt.setFloat(7, this.valorDesconto);
            stmt.executeUpdate();
            System.out.println("Funcionário salvo no banco de dados.");
        } catch (SQLException e) {
            System.out.println("Erro ao salvar funcionário: " + e.getMessage());
        }
    }

    public static Funcionario buscarFuncionarioPorCracha(Connection conexao, int cracha) {
        String sql = "SELECT * FROM funcionarios WHERE cracha = ?";
        Funcionario funcionario = null;
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, cracha);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                funcionario = new Funcionario();
                funcionario.setCracha(rs.getInt("cracha"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setTipoVinculo(rs.getString("tipoVinculo").charAt(0));
                funcionario.setValorHora(rs.getFloat("valorHora"));
                funcionario.setQtdeHora(rs.getFloat("qtdeHora"));
                funcionario.setSalario(rs.getFloat("salario"));
                funcionario.setValorDesconto(rs.getFloat("valorDesconto"));
                System.out.println("Funcionário encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar funcionário: " + e.getMessage());
        }
        return funcionario;
    }
}


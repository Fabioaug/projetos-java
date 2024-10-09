package Empresa.Funcionarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoDB {

    public static Connection conectar() {
        Connection conexao = null;
        Properties prop = new Properties();

        try (FileInputStream input = new FileInputStream("src/main/config/db.properties")) {
            prop.load(input);

            String url = prop.getProperty("db.url");
            String user = prop.getProperty("db.user");
            String password = prop.getProperty("db.password");

            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão com o banco de dados MySQL estabelecida.");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo de propriedades: " + e.getMessage());
        }
        return conexao;
    }
}

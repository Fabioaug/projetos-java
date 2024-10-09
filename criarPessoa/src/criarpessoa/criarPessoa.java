package criarpessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class criarPessoa extends Pessoa {

    private final List<Pessoa> listaPessoas = new ArrayList<>();

    public void criarPessoas() {
        Scanner in = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite o nome da pessoa: ");
        String nome = in.nextLine();
        pessoa.setNome(nome);

        System.out.println("Digite o CPF da pessoa: ");
        String cpf = in.nextLine();
        pessoa.setCPF(cpf);

        int idade = -1;
        while (idade < 0) {
            System.out.println("Digite a idade da pessoa: ");
            if (in.hasNextInt()) {
                idade = in.nextInt();
                if (idade < 0) {
                    System.out.println("Erro: A idade não pode ser negativa");
                }
            } else {
                System.out.println("Erro: Por favor, insira um número inteiro");
                in.next();
            }
        }
        pessoa.setIdade(idade);

        in.nextLine();

        System.out.println("Digite o sexo da pessoa (M/F): ");
        String sexo = in.nextLine();
        char Sexo = sexo.charAt(0);
        pessoa.setSexo(Sexo);

        listaPessoas.add(pessoa);
        System.out.println("Pessoa criada com sucesso!");
    }

    public void mostrarPessoas() {
        if (listaPessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa foi criada ainda");
            return;
        }

        System.out.println("Lista de pessoas cadastradas:");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("CPF: " + pessoa.getCPF());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Sexo: " + pessoa.getSexo());
            System.out.println("------------------------------");
        }

    }
}

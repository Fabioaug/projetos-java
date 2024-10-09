package quizjava;

import java.util.*;

public class Quiz {
       private ArrayList<Pergunta> perguntas;
    private int pontuacao;

    public Quiz(ArrayList<Pergunta> perguntas) {
        this.perguntas = perguntas;
        this.pontuacao = 0;
    }

    public void iniciarQuiz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Quiz sobre Playstation 2, boa sorte!");

        for (Pergunta pergunta : perguntas) {
            System.out.println(pergunta.getPergunta());
            String[] opcoes = pergunta.getOpcoesResposta();
            for (int i = 0; i < opcoes.length; i++) {
                System.out.println((char) ('A' + i) + ") " + opcoes[i]);
            }

            String respostaUsuario = scanner.nextLine().toUpperCase();

            if (respostaUsuario.length() == 1 && respostaUsuario.charAt(0) == pergunta.getRespostaCorreta()) {
                System.out.println("Muito Bem, você acertou!");
                pontuacao++;
            } else {
                System.out.println("Que pena, você errou!");
            }
        }
        System.out.println("            ");
        System.out.println("Fim do Quiz!");
        System.out.println("Você acertou:" + pontuacao + " de " + perguntas.size());
        System.out.println("Obrigado por participar!");
        scanner.close();
    }
}

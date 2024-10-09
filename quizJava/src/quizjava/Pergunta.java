package quizjava;

public class Pergunta {
     private String pergunta;
    private String[] opcoesResposta;
    private char respostaCorreta;

    public Pergunta(String pergunta, String[] opcoesResposta, char respostaCorreta) {
        this.pergunta = pergunta;
        this.opcoesResposta = opcoesResposta;
        this.respostaCorreta = respostaCorreta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String[] getOpcoesResposta() {
        return opcoesResposta;
    }

    public char getRespostaCorreta() {
        return respostaCorreta;
    }
}

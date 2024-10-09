package quizjava;

import java.util.*;

public class PS2 {
    public static void main(String[] args) {
        ArrayList<Pergunta> perguntas = new ArrayList<>();

        String[] opcoes1 = { "1998", "2000", "2002", "2004", "2006" };

        String[] opcoes2 = { "4 MB", "8 MB", "16 MB", "32 MB", "64 MB" };

        String[] opcoes3 = { "32-bit para 64-bit", " 128-bit para 256-bit", "256-bit para 512-bit",
                "64-bit para 128-bit", "512-bit para 1024-bit" };

        String[] opcoes4 = { "Gran Turismo 3: A-Spec", "Final Fantasy X", " Grand Theft Auto: San Andreas",
                "Metal Gear Solid 2: Sons of Liberty", "The Sims 2" };

        String[] opcoes5 = { "Sony Computer Entertainment", " Microsoft", "Nintendo", "Sega", "Atari" };

        String[] opcoes6 = { "Gran Turismo 2", "Gran Turismo 4", "Gran Turismo 5", "Gran Turismo 6",
                "Gran Turismo 3: A-Spec" };

        String[] opcoes7 = { "Network Adapter", "PlayStation Live", "Online Connector", "Multiplayer Link",
                "Internet Hub" };

        String[] opcoes8 = { "Xbox, GameCube, Dreamcast", "PlayStation 3, Xbox 360, Wii",
                "PlayStation 1, Nintendo 64, Sega Saturn", "Atari 2600, Intellivision, ColecoVision",
                "Xbox One, PlayStation 4, Nintendo Switch" };

        String[] opcoes9 = { "DualShock 2", "DualShock 3", "DualShock 4", "DualSense", "DualShock Evolution" };

        String[] opcoes10 = { " PlayStation 2 Slim (modelo SCPH-70000)", "PlayStation 2 Pro (modelo SCPH-80000)",
                "PlayStation 2 Mega (modelo SCPH-100000)", "PlayStation 2 Super Slim (modelo SCPH-90000)",
                " PlayStation 2 Ultra (modelo SCPH-110000)" };

        String[] opcoes11 = { "God of War, Shadow of the Colossus, Final Fantasy X",
                "Halo, Gears of War, Forza Motorsport",
                "Super Mario Sunshine, The Legend of Zelda: The Wind Waker, Metroid Prime",
                " Grand Theft Auto: San Andreas, Metal Gear Solid 2: Sons of Liberty, Devil May Cry",
                "Call of Duty 2, Ratchet & Clank, Gran Turismo 3: A-Spec" };

        String[] opcoes12 = { "Emotion Engine", "Cell Broadband Engine", " PowerPC G5", "Xenon", "MIPS R5900" };

        String[] opcoes13 = { "2", "6", "10", "4", "8" };

        String[] opcoes14 = { "FIFA 14", "Pro Evolution Soccer 2014", ") Madden NFL 12", "NBA 2K13", " WWE 2K14" };

        String[] opcoes15 = { "Discos a Laser", "Discos de Vinil", "Mini DVDs", "Discos Blu-ray", "CDs de áudio" };

        perguntas.add(new Pergunta("Questão 1: Qual foi o ano de lançamento do PlayStation 2?", opcoes1, 'B'));

        perguntas.add(new Pergunta(
                "Questão 2: Qual foi a capacidade máxima de armazenamento de um Memory Card do PlayStation 2?", opcoes2,
                'B'));

        perguntas.add(new Pergunta(
                "Questão 3: Quais eram as principais melhorias em termos de processamento em relação ao PlayStation original?",
                opcoes3, 'D'));

        perguntas.add(new Pergunta("Questão 4: Qual foi o jogo mais vendido para o PlayStation 2?", opcoes4, 'C'));

        perguntas.add(new Pergunta("Questão 5: Que empresa desenvolveu o PlayStation 2?", opcoes5, 'A'));

        perguntas.add(
                new Pergunta("Questão 6:Qual foi o primeiro jogo da série 'Gran Turismo' lançado para o PlayStation 2?",
                        opcoes6, 'E'));

        perguntas.add(
                new Pergunta("Questão 7: Qual era o nome do periférico que permitia a conexão online do PlayStation 2?",
                        opcoes7, 'A'));

        perguntas.add(new Pergunta(
                "Questão 8: Quais foram os principais concorrentes do PlayStation 2 durante a sua geração?", opcoes8,
                'A'));

        perguntas.add(new Pergunta("Questão 9: Qual era o nome do controle padrão do PlayStation 2?", opcoes9, 'A'));

        perguntas.add(new Pergunta("Questão 10: Qual foi a última versão de hardware lançada para o PlayStation 2?",
                opcoes10, 'D'));

        perguntas.add(
                new Pergunta("Questão 11: Quais foram alguns dos jogos exclusivos mais icônicos do PlayStation 2?",
                        opcoes11, 'A'));

        perguntas.add(
                new Pergunta("Questão 12: Qual era o nome do processador principal utilizado no PlayStation 2?",
                        opcoes12, 'E'));

        perguntas.add(
                new Pergunta("Questão 13: Quantos controles eram suportados simultaneamente pelo PlayStation 2?",
                        opcoes13, 'D'));

        perguntas.add(new Pergunta("Questão 14: Qual foi o último jogo lançado oficialmente para o PlayStation 2?",
                opcoes14, 'E'));

        perguntas.add(new Pergunta(
                "Questão 15: Além de jogos, o que mais o PlayStation 2 permitia reproduzir através do seu leitor de discos?",
                opcoes15, 'E'));

        Quiz quiz = new Quiz(perguntas);
        quiz.iniciarQuiz();
    }
}

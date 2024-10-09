package criarpessoa;

public class Pessoa {

    // atributos
    private String CPF;
    private String Nome;
    private char Sexo;
    private int Idade;

    // métodos
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setIdade(int Idade) {
        if (Idade >= 0) {
            this.Idade = Idade;
        } else {
            System.out.println("Idade inválida");
        }
    }

    public int getIdade() {
        return Idade;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public char getSexo() {
        return Sexo;
    }

}

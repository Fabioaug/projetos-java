package org.criarfuncionario;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Funcionario {
    @Id
    @NotNull(message = "O crachá não pode ser nulo")
    private int cracha;

    @NotBlank(message = "O nome não pode estar em branco")
    @Size(max = 100, message = "O nome não pode ter mais de 100 caracteres")
    private String nome;

    @NotNull(message = "O tipo de vínculo não pode ser nulo")
    private char tipoVinculo;

    @DecimalMin(value = "0.0", message = "O valor da hora deve ser maior ou igual a 0")
    private float valorHora;

    @DecimalMin(value = "0.0", message = "A quantidade de horas deve ser maior ou igual a 0")
    private float qtdeHora;

    @DecimalMin(value = "0.0", message = "O salário deve ser maior ou igual a 0")
    private float salario;

    @DecimalMin(value = "0.0", message = "O valor do desconto deve ser maior ou igual a 0")
    private float valorDesconto;

    // Getters e Setters

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
}

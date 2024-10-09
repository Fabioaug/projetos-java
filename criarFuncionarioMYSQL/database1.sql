CREATE DATABASE empresa;

USE empresa;

CREATE TABLE Funcionarios (
    cracha INT unsigned PRIMARY KEY, 
    nome VARCHAR(100) NOT NULL,
    tipoVinculo CHAR(1) NOT NULL,
    valorHora DECIMAL(10, 2),
    qtdeHora DECIMAL(10, 2),
    salario DECIMAL(10, 2),
    valorDesconto DECIMAL(10, 2)
);

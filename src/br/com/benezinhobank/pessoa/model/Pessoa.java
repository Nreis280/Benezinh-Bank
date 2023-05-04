package br.com.benezinhobank.pessoa.model;

import java.time.LocalDate;

public abstract class Pessoa {

    private String nome;

    LocalDate nascimento;
    private  PessoaFisica pessoa;

    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate nascimento, PessoaFisica pessoa) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.pessoa = pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public PessoaFisica getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", pessoa=" + pessoa +
                '}';
    }
}

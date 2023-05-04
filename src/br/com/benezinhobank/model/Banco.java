package br.com.benezinhobank.model;

public class Banco {

    private String nome;



    public Banco() {
    }



    public String getNome() {
        return nome;
    }
    public Banco(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

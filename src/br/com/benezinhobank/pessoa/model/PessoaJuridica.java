package br.com.benezinhobank.pessoa.model;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa {


    private String CNPJ;

    private String razaoSocial;


    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, LocalDate nascimento, PessoaFisica pessoa, String CNPJ, String razaoSocial) {
        super(nome, nascimento, pessoa);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}

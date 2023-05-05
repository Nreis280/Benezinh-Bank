package br.com.benezinhobank.pessoa.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

public class PessoaJuridica extends Pessoa {


    private String CNPJ;

    private String razaoSocial;

    Pessoa[] socios;


    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, LocalDate nascimento,
                          PessoaFisica pessoa, String CNPJ,
                          String razaoSocial, Pessoa[] socios) {
        super(nome, nascimento, pessoa);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.socios = socios;
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

    public Pessoa[] getSocios() {
        return socios;
    }

    public void setSocios(Pessoa[] socios) {
        this.socios = socios;
    }


    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + CNPJ + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", socios=" + Arrays.toString(socios) +
                "} " + super.toString();
    }
}

package br.com.benezinhobank.model;

import br.com.benezinhobank.pessoa.model.Pessoa;

public class ContaCorrente extends Conta{

    private double limete;
    private Agencia agencia;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, Agencia agencia, Pessoa titular, double saldo, double limete) {
        super(numero, agencia, titular, saldo);
        this.limete = limete;
    }

    public double getLimete() {
        return limete;
    }

    public void setLimete(double limete) {
        this.limete = limete;
    }


    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limete=" + limete +
                "} " + super.toString();
    }
}

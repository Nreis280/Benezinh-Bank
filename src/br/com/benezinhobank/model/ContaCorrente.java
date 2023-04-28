package br.com.benezinhobank.model;

import br.com.benezinhobank.pessoa.model.Pessoa;

public class ContaCorrente extends Conta{

    private double limete;

    public ContaCorrente() {
    }

    public ContaCorrente(Agencia agencia, Pessoa titular, double saldo, double limete) {
        super(agencia, titular, saldo);
        this.limete = limete;
    }

    public double getLimete() {
        return limete;
    }

    public void setLimete(double limete) {
        this.limete = limete;
    }
}

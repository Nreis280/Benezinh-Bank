package br.com.benezinhobank.model;

import br.com.benezinhobank.pessoa.model.Pessoa;

public class ContaCorrente extends Conta{

    private double limete;
    private Agencia agencia;

    public ContaCorrente() {
    }

    public ContaCorrente(String numero, Agencia agencia, Pessoa titular,
                         double saldo, double limete, Agencia agencia1) {
        super(numero, agencia, titular, saldo);
        this.limete = limete;
        this.agencia = agencia1;
    }

    public double getLimete() {
        return limete;
    }

    public void setLimete(double limete) {
        this.limete = limete;
    }

    @Override
    public Agencia getAgencia() {
        return agencia;
    }

    @Override
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public boolean sacar(double valor){

        double valorDisponivel = getSaldo() + getLimete();

        if (valor<=0) return false;

        if (getSaldo() < valor) return false;

        setSaldo(getSaldo() - valor);
        return true;
    }


    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limete=" + limete +
                ", agencia=" + agencia +
                "} " + super.toString();
    }
}

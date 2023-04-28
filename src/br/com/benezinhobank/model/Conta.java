package br.com.benezinhobank.model;

import br.com.benezinhobank.pessoa.model.Pessoa;

public abstract class Conta {

     private Agencia agencia;
     Pessoa titular;
     private double saldo;

     public Conta() {
     }

     public Conta(Agencia agencia, Pessoa titular, double saldo) {
          this.agencia = agencia;
          this.titular = titular;
          this.saldo = saldo;
     }

     public Agencia getAgencia() {
          return agencia;
     }

     public void setAgencia(Agencia agencia) {
          this.agencia = agencia;
     }

     public Pessoa getTitular() {
          return titular;
     }

     public void setTitular(Pessoa titular) {
          this.titular = titular;
     }

     public double getSaldo() {
          return saldo;
     }

     public void setSaldo(double saldo) {
          this.saldo = saldo;
     }



}

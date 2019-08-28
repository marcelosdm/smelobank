package br.com.smelobank.banco.model;

/**
 * ContaPoupanca
 */
public class ContaPoupanca extends Conta {

  public ContaPoupanca(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
  public double deposita(double valor) {
    return super.saldo += valor;
  }

  @Override
  public String toString() {
    return "Conta Poupança, " + super.toString();
  }
}
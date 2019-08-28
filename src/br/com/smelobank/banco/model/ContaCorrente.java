package br.com.smelobank.banco.model;

/**
 * ContaCorrente
 */
public class ContaCorrente extends Conta implements Tributavel {

  public ContaCorrente(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
  public void saca(double valor) throws SaldoInsuficienteException {
    double valorDepositar = valor + 0.20;
    super.saca(valorDepositar);
  }

  @Override
  public double deposita(double valor) {
    return super.saldo += valor;
  }

  @Override
  public double getValorImposto() {
    return super.saldo * 0.01;
  }

  @Override
  public String toString() {
    return "Conta Corrente, " + super.toString();
  }
}
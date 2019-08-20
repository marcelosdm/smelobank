/**
 * ContaCorrente
 */
public class ContaCorrente extends Conta {

  public ContaCorrente(int agencia, int numero) {
    super(agencia, numero);
  }

  @Override
  public boolean saca(double valor) {
    double valorDepositar = valor + 0.20;
    return super.saca(valorDepositar);
  }

  @Override
  public double deposita(double valor) {
    return super.saldo += valor;
  }
}
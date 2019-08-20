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

}
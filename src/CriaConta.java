/**
 * CriaConta
 */
public class CriaConta {

  public static void main(String[] args) {
    Conta conta = new Conta();
    Cliente cliente = new Cliente();
    conta.setTitular(cliente);
    conta.deposita(1000.00);

    double valorSaque = 50.00;
    conta.saca(valorSaque);

    double valorDeposito = 1000.00;
    conta.deposita(valorDeposito);

    System.out.println("Valor conta: R$" + conta.getSaldo());

  }
}
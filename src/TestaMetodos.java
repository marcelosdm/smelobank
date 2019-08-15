/**
 * TestaMetodos
 */
public class TestaMetodos {

  public static void main(String[] args) {
    Conta contaDoMarcelo = new Conta();
    Conta contaDaLivia = new Conta();
    double deposito = contaDoMarcelo.deposita(1000);
    System.out.println("Depósito de R$" + deposito);

    contaDoMarcelo.saca(100);
    System.out.println("Saldo atual de R$" + contaDoMarcelo.saldo);

    contaDoMarcelo.transfere(700, contaDaLivia);
    System.out.println("Conta da Lívia. Saldo de R$" + contaDaLivia.saldo);
    System.out.println("Conta do Marcelo. Saldo de R$" + contaDoMarcelo.saldo);
  }
}
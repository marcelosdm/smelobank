/**
 * TestaContas
 */
public class TestaContas {

  public static void main(String[] args) throws SaldoInsuficienteException {
    ContaCorrente cc = new ContaCorrente(2322, 828282);
    ContaPoupanca pp = new ContaPoupanca(0304, 101010);

    cc.deposita(1500.0);
    cc.transfere(2500, pp);

    System.out.println(cc.getSaldo());
    System.out.println(pp.getSaldo());

    cc.saca(100);

    System.out.println(cc.getSaldo());
  }
}
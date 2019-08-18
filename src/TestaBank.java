public class TestaBank {
  public static void main(String[] args) {
    Conta conta1 = new Conta(2322, 992929);
    Cliente cliente1 = new Cliente("Marcelo Melo");
    conta1.setTitular(cliente1);

    Conta conta2 = new Conta(2322, 202020);
    Cliente cliente2 = new Cliente("Lívia Oliveira");

    conta1.deposita(1500);
    conta1.transfere(500, conta2);
    System.out.println("Tranferência para o destinatário: " + cliente2.getNome());

  }
}

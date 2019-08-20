/**
 * TestaGetSet
 */
public class TestaGetSet {

  public static void main(String[] args) {
    Conta conta1 = new ContaPoupanca(2322, 229342);
    conta1.setNumero(2322);
    System.out.println(conta1.getNumero());

    Cliente marcelo = new Cliente();

    conta1.setTitular(marcelo);

  }
}
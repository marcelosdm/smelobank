/**
 * TestaGetSet
 */
public class TestaGetSet {

  public static void main(String[] args) {
    Conta conta1 = new Conta();
    conta1.setNumero(2322);
    System.out.println(conta1.getNumero());

    Cliente marcelo = new Cliente();
    marcelo.setNome("Marcelo Melo");

    conta1.setTitular(marcelo);
    System.out.println(conta1.getTitular().getNome());

    conta1.getTitular().setProfissao("desenvolvedor");
  }
}
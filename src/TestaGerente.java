public class TestaGerente {
  public static void main(String[] args) {
    Gerente g1 = new Gerente();
    g1.setNome("Danilo");
    g1.setCpf("12312312312");
    g1.setSalario(12000);
    g1.setSenha(123);

    boolean autenticou = g1.autentica(123);
    System.out.println(autenticou);

    System.out.println(g1.getNome());
    System.out.println(g1.getCpf());
    System.out.println(g1.getSalario());

    System.out.println(g1.getBonificacao());
  }
}

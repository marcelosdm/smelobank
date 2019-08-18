public class TestaFuncionario {
  public static void main(String[] args) {
    Funcionario d1 = new Funcionario("Marcelo");

    d1.setNome("Marcelo Melo");
    d1.setCpf("34939292923");
    d1.setSalario(6500);

    System.out.println(d1.getNome());
    System.out.println(d1.getCpf());
    System.out.println(d1.getSalario());

  }
}

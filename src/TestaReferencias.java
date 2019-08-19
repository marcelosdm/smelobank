/**
 * TestaReferencias
 */
public class TestaReferencias {

  public static void main(String[] args) {
    Gerente g1 = new Gerente();
    g1.setNome("Xande");
    g1.setSalario(8000.0);

    Developer d = new Developer();
    d.setSalario(6500.0);

    Support s = new Support();
    s.setSalario(2500.0);

    ControleBonificacao controle = new ControleBonificacao();
    controle.registra(g1);
    controle.registra(d);
    controle.registra(s);

    System.out.println(controle.getSoma());
  }
}
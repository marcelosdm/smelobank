/**
 * Support
 */
public class Support extends Funcionario {

  // public double bonificacao() {
  // return super.getBonificacao() + 150;
  // }

  public double getBonificacao() {
    return getSalario() * 0.2;
  }
}
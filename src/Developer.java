/**
 * Developer
 */
public class Developer extends Funcionario {

  public double bonificacao() {
    return super.getBonificacao() + 200;
  }
}
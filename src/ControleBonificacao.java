/**
 * ControleBonificacao
 */
public class ControleBonificacao {

  private double soma;

  public void registra(Funcionario f) {
    double bonifica = f.getBonificacao();
    this.soma += bonifica;
  }

  public double getSoma() {
    return this.soma;
  }

}
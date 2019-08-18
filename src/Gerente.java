public class Gerente extends Funcionario {
  public Gerente(String nome) {
    super(nome);
    // TODO Auto-generated constructor stub
  }

  private int senha;

  public void setSenha(int senha) {
    this.senha = senha;
  }

  public boolean autentica(int senha) {
    if (this.senha == senha) {
      return true;
    }
    return false;
  }
}

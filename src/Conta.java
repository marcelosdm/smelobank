/**
 * Conta
 */
public abstract class Conta {

  protected double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  private static int total = 0;

  public Conta(int agencia, int numero) {
    Conta.total++;
    System.out.println("Criando a conta " + numero);
    System.out.println("O total de contas é: " + Conta.total);
    this.agencia = agencia;
    this.numero = numero;
    this.saldo = 100;
  }

  public abstract double deposita(double valor);

  public boolean saca(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    }
    return false;
  }

  public boolean transfere(double valor, Conta destino) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      destino.deposita(valor);
      return true;
    }
    return false;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    if (numero <= 0) {
      System.out.println("O número da conta não pode ser número negativo ou zero.");
      return;
    }
    this.numero = numero;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int agencia) {
    if (agencia <= 0) {
      System.out.println("O número da agência não pode ser negativo ou zero.");
      return;
    }
    this.agencia = agencia;
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public static int getTotal() {
    return Conta.total;
  }
}
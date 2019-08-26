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

  public void saca(double valor) throws SaldoInsuficienteException {
    if (this.saldo < valor) {
      throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor a ser sacado: " + valor);
    }
    this.saldo -= valor;
  }

  public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
    this.saca(valor);
    destino.deposita(valor);
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    if (numero < 1) {
      throw new IllegalArgumentException("Número de conta inválido");
      // System.out.println("O número da conta não pode ser número negativo ou
      // zero.");
      // return;
    }
    this.numero = numero;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int agencia) {
    if (agencia < 1) {
      throw new IllegalArgumentException("Número de agência inválido");
      // System.out.println("O número da agência não pode ser negativo ou zero.");
      // return;
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
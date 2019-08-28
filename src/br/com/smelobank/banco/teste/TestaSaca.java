package br.com.smelobank.banco.teste;

import br.com.smelobank.banco.model.Conta;
import br.com.smelobank.banco.model.ContaCorrente;
import br.com.smelobank.banco.model.SaldoInsuficienteException;

/**
 * TestaSaca
 */
public class TestaSaca {

  public static void main(String[] args) {
    Conta conta = new ContaCorrente(123, 321);

    conta.deposita(200.0);

    try {
      conta.saca(200.0);
    } catch (SaldoInsuficienteException e) {
      System.out.println("Exception: " + e.getMessage());
      e.printStackTrace();
    }

    System.out.println(conta.getSaldo());
  }
}
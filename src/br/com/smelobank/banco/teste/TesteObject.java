package br.com.smelobank.banco.teste;

import br.com.smelobank.banco.model.ContaCorrente;
import br.com.smelobank.banco.model.ContaPoupanca;

/**
 * Teste
 */
public class Teste {

  public static void main(String[] args) {
    Object cc = new ContaCorrente(123, 123);
    Object cp = new ContaPoupanca(321, 321);

    System.out.println(cc);
    System.out.println(cp);
  }
}
package br.com.smelobank.banco.teste;

import br.com.smelobank.banco.model.CalculadorImposto;
import br.com.smelobank.banco.model.ContaCorrente;
import br.com.smelobank.banco.model.SeguroVida;

/**
 * TestaTributos
 */
public class TestaTributos {

  public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(2322, 121212);
    cc.deposita(1000);

    SeguroVida sv = new SeguroVida();

    CalculadorImposto calc = new CalculadorImposto();
    calc.registra(cc);
    calc.registra(sv);

    System.out.println(calc.totalImposto);
  }
}
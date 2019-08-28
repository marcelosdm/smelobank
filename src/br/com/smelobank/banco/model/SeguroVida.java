package br.com.smelobank.banco.model;

/**
 * SeguroVida
 */
public class SeguroVida implements Tributavel {

  @Override
  public double getValorImposto() {
    return 100;
  }

}
package br.com.smelobank.banco.model;

/**
 * Developer
 */
public class Developer extends Funcionario {

  // public double bonificacao() {
  // return super.getBonificacao() + 200;
  // }

  public double getBonificacao() {
    return getSalario() * 0.2;
  }
}
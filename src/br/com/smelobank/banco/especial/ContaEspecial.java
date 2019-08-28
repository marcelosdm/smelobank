package br.com.smelobank.banco.especial;

import br.com.smelobank.banco.model.Conta;

/**
 * ContaEspecial
 */
public class ContaEspecial extends Conta {

  public ContaEspecial(int agencia, int numero) {
    super(agencia, numero);
    // TODO Auto-generated constructor stub
  }

  @Override
  public double deposita(double valor) {
    return 0;
  }

}
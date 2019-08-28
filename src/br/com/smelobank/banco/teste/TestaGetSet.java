package br.com.smelobank.banco.teste;

import br.com.smelobank.banco.model.Cliente;
import br.com.smelobank.banco.model.Conta;
import br.com.smelobank.banco.model.ContaPoupanca;

/**
 * TestaGetSet
 */
public class TestaGetSet {

  public static void main(String[] args) {
    Conta conta1 = new ContaPoupanca(2322, 229342);
    conta1.setNumero(2322);
    System.out.println(conta1.getNumero());

    Cliente marcelo = new Cliente();

    conta1.setTitular(marcelo);

  }
}
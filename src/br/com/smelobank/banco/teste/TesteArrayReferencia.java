package br.com.smelobank.banco.teste;

import br.com.smelobank.banco.model.ContaCorrente;

/**
 * TesteArrayReferencia
 */
public class TesteArrayReferencia {

  public static void main(String[] args) {
    ContaCorrente[] contas = new ContaCorrente[5];

    ContaCorrente cc1 = new ContaCorrente(111, 111);
    contas[0] = cc1;

    ContaCorrente cc2 = new ContaCorrente(222, 222);
    contas[1] = cc2;

    System.out.println(contas[0].getNumero());

  }
}
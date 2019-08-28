package br.com.smelobank.banco.teste;

import br.com.smelobank.banco.model.Developer;
import br.com.smelobank.banco.model.Funcionario;

public class TestaFuncionario {
  public static void main(String[] args) {
    Funcionario d1 = new Developer();

    d1.setNome("Marcelo Melo");
    d1.setCpf("34939292923");
    d1.setSalario(6500);

    System.out.println(d1.getNome());
    System.out.println(d1.getCpf());
    System.out.println(d1.getSalario());
    System.out.println(d1.getBonificacao());

  }
}

package br.com.smelobank.banco.model;

/**
 * Classe que representa um cliente no Smelobank
 * 
 * @author Marcelo Melo
 * @version 0.1
 */
public class Cliente implements Autenticavel {

  private AutenticaUtil autenticador;

  public Cliente() {
    this.autenticador = new AutenticaUtil();
  }

  @Override
  public void setSenha(int senha) {
    this.autenticador.setSenha(senha);
  }

  @Override
  public boolean autentica(int senha) {
    return this.autenticador.autentica(senha);
  }
}
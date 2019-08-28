package br.com.smelobank.banco.teste;

/**
 * TesteString
 */
public class TesteString {

  public static void main(String[] args) {
    String nome = "Marcelo";
    String sobrenome = new String("Melo");

    // sobrenome.replace("Melo", "Silva");
    // System.out.println(sobrenome);

    // String nomeDoMeio = sobrenome.replace("Melo", "Silva");
    // System.out.println(nomeDoMeio);

    // String maiusculo = sobrenome.toUpperCase();
    // System.out.println(maiusculo);

    // String sub = nome.substring(3);
    // System.out.println(sub);

    for (char i = 0; i < nome.length(); i++) {
      System.out.println(nome.charAt(i));
    }
  }
}
package aula10.exemplos;

public class Pessoa {
  String nome;
  String sobrenome;
  // É acessível diretamente da classe
  // Único para todas as instâncias
  static int contPessoa = 0;

  public Pessoa(String nome, String sobrenome){
    this.nome = nome;
    this.sobrenome = sobrenome;
    contPessoa++;
  }

  // É acessível diretamente da classe
  static int getQuantidade(){
    return contPessoa;
  }

  String obterDados(){
    return "Nome: "+nome+" "+sobrenome;
  }
}

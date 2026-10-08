package aula10.exemplos.acesso.model;

public class Pessoa {
  protected String nome;
  private String sobrenome;
  // Sem modificador
  int idade;
  public String mail;

  public Pessoa(){}

  public Pessoa(String nome, String sobrenome){
    this.nome = nome;
    setSobrenome(sobrenome);
  }


  // Realizando acesso indireto pelo encapsulamento
  // O getter permite obter o valor do atributo privado
  public String getSobrenome(){
    return sobrenome;
  }

  // O setter permite alterar o valor do atributo privado
  public void setSobrenome(String sobrenome){
    if(sobrenome.length()>0){
      this.sobrenome = sobrenome;
    }
  }


}

package aula08.exemplosPoo.exemploVetorObjetos;

public class Pessoa {
  String nome;
  String sobrenome;
  String mail;

  Pessoa(String nome, String sobrenome){
    this.nome = nome;
    this.sobrenome = sobrenome;
  }

  Pessoa(){

  }

  String apresentar(){
    return "Nome: "+nome+" "+sobrenome;
  }
}

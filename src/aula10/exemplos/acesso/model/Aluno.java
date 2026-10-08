package aula10.exemplos.acesso.model;

public class Aluno {
  Pessoa p1 = new Pessoa();

  public Aluno(){
    p1.idade = 18;
    p1.nome = "Jonas";
    //Não podemos acessar o sobrenome porque ele é protegido
    //p1.sobrenome = "Souza"
    p1.mail = "jonas@gmail.com";
  }
}

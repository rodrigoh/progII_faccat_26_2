package aula09.exemploAluno;

public class Aluno {
  String nome;
  float notaUm;
  float notaDois;
  float notaTres;


  // Construtor da classe Aluno
  Aluno(){

  }

  Aluno(String nome){
    this.nome = nome;
  }

  Aluno(String nome, float n1, float n2, float n3){
    this.nome = nome;
    notaUm = n1;
    notaDois = n2;
    notaTres = n3;
  }

  float calculaMedia(){
    return (notaUm+notaDois+notaTres)/3;
  }

  String retornaStatus(){
    float media = calculaMedia();
    if(media>=8)
      return "aprovado";
    else if(media>=3)
      return "recuperação";
    else
      return "reprovado";
  }
}

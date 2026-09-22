package aula08.exemplosPoo.exemploAluno;

public class Aluno {
  String nome;
  float notaUm;
  float notaDois;
  float notaTres;

  float calculaMedia(){
    return (notaUm+notaDois+notaTres)/3;
  }

  String retornaStatus() {
    float media = calculaMedia();
    if (media >= 8)
      return "aprovado";
    else if(media >= 3)
      return "recuperação";
    else
      return "reprovado";
  }
}

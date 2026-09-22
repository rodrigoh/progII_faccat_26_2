package aula08.exemplosPoo.exemploAlunoVetor;

public class Aluno {
  String nome;
  float[] notas = new float[3];
  int contNota = 0;

  float calculaMedia(){
    float soma = 0;
    for(float nota:notas){
      soma+=nota;
    }
    return (soma)/3;
  }

  boolean adicionaNota(float nota){
    if(contNota<3){
      notas[contNota] = nota;
      contNota++;
      return true;
    }
    return false;
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

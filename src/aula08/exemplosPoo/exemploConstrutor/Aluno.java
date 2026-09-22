package aula08.exemplosPoo.exemploConstrutor;

public class Aluno {
  String nome;
  String matricula;
  float[] notas = new float[3];
  int contNota=0;

  // Criando um método construtor
  // Construtor tem exatamente o mesmo nome da classe (portanto é o único método com a inicial maiúscula
  // Não tem tipo de retorno

  Aluno(String nome, String matricula){
    this.nome = nome;
    this.matricula = matricula;
  }

  Aluno(String nome, String matricula, float[] notas){
    this.nome = nome;
    this.matricula = matricula;
    this.notas = notas;
    contNota = notas.length;
  }

  // Se depois de criar o meu construtor eu precisar ter o construtor vazio, devo declarar manualmente
  Aluno(){
  }

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

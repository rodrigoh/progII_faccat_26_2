package aula10.exemplos.acesso.exemploAluno;

public class Aluno {
  private String nome;
  private String matricula;
  private float notaUm;
  private float notaDois;

  public Aluno(String nome, String matricula){
    this.nome = nome;
    this.matricula = matricula;
  }

  public String getMatricula(){
    return matricula;
  }

  public void setMatricula(String matricula){
    this.matricula = matricula;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public float getNotaUm(){
    return notaUm;
  }

  public float getNotaDois(){
    return notaDois;
  }

  public void setNotaUm(float nota){
    if(nota>=0 && nota<=10)
      notaUm = nota;
  }

  public void setNotaDois(float nota){
    if(nota>=0 && nota<=10)
      notaDois = nota;
  }
}

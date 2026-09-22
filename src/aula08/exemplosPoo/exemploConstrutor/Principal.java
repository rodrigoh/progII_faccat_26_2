package aula08.exemplosPoo.exemploConstrutor;

public class Principal {
  static void main() {
    Aluno alunoUm = new Aluno("Jonas", "a123");

    IO.println("Dados do aluno "+alunoUm.nome+" matrícula "+alunoUm.matricula);

    // Como eu criei o meu próprio construtor o Java não cria mais o construtor vazio
    Aluno alunoDois = new Aluno();


    Aluno alunoTres = new Aluno("Ana", "a124", new float[] {8,7,6});
  }
}

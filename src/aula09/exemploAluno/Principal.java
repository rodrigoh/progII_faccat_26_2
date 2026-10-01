package aula09.exemploAluno;

public class Principal {
  static void main(String[] args) {
    Aluno alunoUm = new Aluno("Jonas");
    alunoUm.notaUm = 8;
    alunoUm.notaDois = 9;
    alunoUm.notaTres = 10;

    float media = alunoUm.calculaMedia();
    String status = alunoUm.retornaStatus();

    IO.println("O aluno "+alunoUm.nome);
    IO.println("Tem média %.2f".formatted(media));
    IO.println("E está "+status);


    Aluno alunoDois = new Aluno("Ana",8,9,7);

    media = alunoDois.calculaMedia();
    status = alunoDois.retornaStatus();

    IO.println("O aluno "+alunoDois.nome);
    IO.println("Tem média %.2f".formatted(media));
    IO.println("E está "+status);

    Aluno alunoTres = new Aluno();
  }
}

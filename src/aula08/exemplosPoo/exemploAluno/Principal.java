package aula08.exemplosPoo.exemploAluno;

public class Principal {
  static void main() {
    Aluno a1 = new Aluno();
    a1.nome = "Jonas";
    a1.notaUm = 6;
    a1.notaDois = 10;
    a1.notaTres = 8;
    IO.println("O aluno "+a1.nome+" tem média "+a1.calculaMedia()+" e está "+a1.retornaStatus());
  }
}

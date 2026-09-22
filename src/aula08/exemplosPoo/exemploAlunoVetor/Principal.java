package aula08.exemplosPoo.exemploAlunoVetor;

public class Principal {
  static void main() {
    Aluno a1 = new Aluno();
    a1.nome = "Jonas";
    a1.adicionaNota(6);
    a1.adicionaNota(10);
    a1.adicionaNota(8);
    IO.println("O aluno "+a1.nome+" tem média "+a1.calculaMedia()+" e está "+a1.retornaStatus());
  }
}

package aula10.exemplos.acesso.exemploAluno;

public class CadastroAluno {
  static void main() {
    Aluno a1 = new Aluno("Jonas","a123");
    a1.setNotaUm(8.5f);
    a1.setNotaDois(10);
    IO.println(a1.getNotaUm());
    IO.println(a1.getNotaDois());
    a1.setNotaUm(11);
    IO.println(a1.getNotaUm());
    IO.println(a1.getNotaDois());


  }
}

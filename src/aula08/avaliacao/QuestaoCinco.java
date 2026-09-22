package aula08.avaliacao;

public class QuestaoCinco {
  static void altera(int num, int[] vetor) {
    num = 10;
    vetor[0] = 10;
  }

  static void main(String[] args) {
    int x = 5;
    int[] v = {5, 5, 5};
    altera(x, v);
    System.out.println(x + " " + v[0]);
  }
}

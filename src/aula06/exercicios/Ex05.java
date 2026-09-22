package aula06.exercicios;

public class Ex05 {
  static void main() {
    int[] vetor = {18, 7, 12, 3, 15, 20, 6, 11, 5, 19, 2, 9, 17, 10, 4, 8, 14, 1, 16, 13};
    IO.println(Utilidade.mostraFormatado(vetor,"vetor"));
    vetor = Utilidade.ordenaVetor(vetor);
    IO.println(Utilidade.mostraFormatado(vetor,"vetor"));
  }
}

package aula05.exemplosVetores;

public class Exemplo01 {
  static void main() {
    //String, Double, double, char, Pessoas
    //tipo[] nome = new tipo[capacidade];
    //vetor de 10 números inteiros com indices de 0 a 10
    int[] vetor = new int[10];

    //Lendo valores do teclado
    for (int i = 0; i < 10; i++) {
      vetor[i] = Integer.parseInt(IO.readln("vetor["+i+"]: "));
    }

    //Mostrando o vetor na tela
    for (int i = 0; i < 10; i++) {
      IO.print(vetor[i]+" ");
    }
  }
}

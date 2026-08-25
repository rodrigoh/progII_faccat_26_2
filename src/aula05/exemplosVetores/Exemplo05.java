package aula05.exemplosVetores;

import java.util.Random;

public class Exemplo05 {

  static void main() {

    Random aleatorio = new Random();

    int[] vetor = new int[20];

    IO.println("Gerando um vetor aleatório");
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(60);
    }

    for(int i : vetor){
      IO.print(i+" ");
    }

  }
}

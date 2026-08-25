package aula05.exemplosVetores;

public class Exemplo03 {
  static void main() {
    int[] vetor = {1,5,7,2,10};

    IO.println("Dados em vetor 1");
    for (int i = 0; i <vetor.length; i++) {
      IO.print(vetor[i]+" ");
    }

    int[] vetorDois= new int[vetor.length];
    //Faz com que os dois vetores apontem para o mesmo espaço de memória
    //vetorDois = vetor;

    //Cópia manual
    for (int i = 0; i < vetor.length; i++) {
      vetorDois[i] = vetor[i];
    }

    //Cópia usando o System.arrayCopy
    System.arraycopy(vetor,0,vetorDois,0,vetor.length);

    vetorDois[2] = 100;

    IO.println("\nDados em vetor 2");
    for (int i = 0; i < vetorDois.length; i++) {
      IO.print(vetorDois[i]+" ");
    }

    IO.println("\nDados em vetor 1");
    for (int i = 0; i <vetor.length; i++) {
      IO.print(vetor[i]+" ");
    }
  }
}

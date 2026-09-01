package aula06.exercicios;


import java.util.Random;

/**
 * Criar um vetor A com 5 elementos, carregar ele com números
 * aleatórios. Declarar um vetor B. Copiar todos os elementos do
 * Vetor A para o Vetor B e mostrar os dois na tela;
 */
public class Ex01 {

  //1 2 3 4 5

  static String mostra(int[] vetor){
    String retorno = "\nDados no vetor\n";
    for(int i:vetor)
      retorno+=i+" ";
    return retorno;
  }

  static void main() {
    int[] vetorA = Utilidade.geraVetor(5);
    int[] vetorB = new int[5];

    // Cópia manual
    for (int i = 0; i < vetorA.length; i++) {
      vetorB[i] = vetorA[i];
    }

    // Cópia "automática"
    //System.arraycopy(vetorA,0,vetorB,0,vetorA.length);

    //Mostrar os vetores na tela
    IO.println(mostra(vetorA));

    IO.println(Utilidade.mostraFormatado(vetorA, "vetorA"));
    IO.println(Utilidade.mostraFormatado(vetorB, "vetorB"));

  }
}

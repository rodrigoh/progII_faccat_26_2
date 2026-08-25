package aula05.exemplosVetores;

import java.util.Random;

public class Exemplo06 {

  static int[] geraVetor(int capacidade){
    Random aleatorio = new Random();
    int[] lista = new int[capacidade];
    for (int i = 0; i < lista.length; i++) {
      lista[i] = aleatorio.nextInt(1,capacidade*2);
    }
    return lista;
  }

  static void mostraVetor(int[] vetor){
    for (int valor : vetor){
      IO.print(valor+" ");
    }
  }

  static int soma(int[] vetor){
    int soma = 0;
    for (int i = 0; i < vetor.length; i++) {
      soma+=vetor[i];
    }
    return soma;
  }

  static int[] menorMaior(int[] vetor){
    int menor = 0;
    int maior = 0;
    for (int i = 0; i < vetor.length; i++) {
      if(i==0){
        maior = vetor[i];
        menor = vetor[i];
      }
      if(vetor[i]>maior){
        maior = vetor[i];
      }
      if(vetor[i]<menor){
        menor = vetor[i];
      }
    }
    return new int[] {menor,maior};
  }

//  static int[] menorMaior(int[] vetor){
//    int menor = vetor[0];
//    int maior = vetor[0];
//    for (int i = 0; i < vetor.length; i++) {
//      if(vetor[i]>maior){
//        maior = vetor[i];
//      }
//      if(vetor[i]<menor){
//        menor = vetor[i];
//      }
//    }
//    return new int[] {menor,maior};
//  }

  static void main() {
    int[] vetor = geraVetor(10);
    IO.println("Dados no vetor:");
    mostraVetor(vetor);
    int somaValores = soma(vetor);
    IO.println("\nA soma dos elementos acima vale: "+somaValores);
    int[] menorMaior = menorMaior(vetor);
    IO.println("O menor elemento da lista é "+menorMaior[0]+" e o maior é "+menorMaior[1]);
  }
}

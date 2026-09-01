package aula06.exemplosMatrizes;

import java.util.Random;

public class Exemplo03 {
  static void mostra(int[][] matriz){
    for(int[] linha: matriz){
      for(int c:linha){
        IO.print("%02d ".formatted(c));
      }
      IO.println();
    }
  }
  static void main() {
    Random aleatorio = new Random();
    int[][] matriz = new int[5][5];
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        matriz[l][c] = aleatorio.nextInt(50);
      }
    }
    IO.println("\nDados na matriz:");
    mostra(matriz);

    IO.println("\nElementos na diagonal principal");
    for (int i = 0; i < 5; i++) {
      IO.print(matriz[i][i]+" ");
    }

    IO.println("\nElementos na diagonal secundária");
    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        if(l+c==matriz.length-1){
          IO.print(matriz[l][c]+" ");
        }
      }
    }
  }
}

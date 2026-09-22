package aula06.exemplosMatrizes;

public class Exemplo02 {
  static void main() {
    int[][] matriz = {{1,2,3,4,5},{6,7,8,10,11},{9,10,11,12,20}};

    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        IO.print("%02d ".formatted(matriz[l][c]));
      }
      IO.println();
    }
    IO.println("\nUsando o for simplificado\n");
    for(int[] linha: matriz){
      for(int c:linha){
        IO.print("%02d ".formatted(c));
      }
      IO.println();
    }
  }
}

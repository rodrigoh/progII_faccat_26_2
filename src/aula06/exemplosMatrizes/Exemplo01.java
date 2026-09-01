package aula06.exemplosMatrizes;

public class Exemplo01 {
  static void main() {
    //Declarando uma matriz
    //tipo[][] nome = new tipo[linhas][colunas]
    int[][] matriz  = new int[5][3];
    for (int l = 0; l < 5; l++) {
      for (int c = 0; c < 3; c++) {
        matriz[l][c] = Integer.parseInt(IO.readln("matriz[%d][%d]: ".formatted(l,c)));
      }
    }

    IO.println("A matriz tem "+matriz.length+" linhas");
    IO.println("A matriz tem "+matriz[0].length+" colunas");

    for (int l = 0; l < matriz.length; l++) {
      for (int c = 0; c < matriz[l].length; c++) {
        IO.print("%02d ".formatted(matriz[l][c]));
      }
      IO.println();
    }
  }
}

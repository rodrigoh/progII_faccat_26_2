package aula08.avaliacao;

import java.util.Random;

public class QuestaoOito {
  static void main() {
    Random aleatorio = new Random();
    int[] vx = new int[10];
    int[] vy = new int[10];
    int[] vr = new int[20];

    IO.println("Dados do vetor x");
    for (int i = 0; i < vx.length; i++) {
      vx[i] = aleatorio.nextInt(10,30);
      IO.print(vx[i]+" ");
    }
    IO.println("\nDados do vetor x");
    for (int i = 0; i < vy.length; i++) {
      vy[i] = aleatorio.nextInt(10,30);
      IO.print(vy[i]+" ");
    }
    IO.println("\nDados no vr");
    int ix = 0;
    int iy = 0;
    for (int i = 0; i < vr.length; i++) {
      //impares de r tenham os elementos do vx
      //pares de r tenham os elementos de y
      if(i%2==0){
        vr[i] = vx[ix];
        ix++;
      }
      else{
        vr[i] = vy[iy];
        iy++;
      }
      IO.print(vr[i]+" ");
    }
  }
}

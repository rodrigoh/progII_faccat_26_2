package aula08.avaliacao;

import java.util.Random;

public class QuestaoOitoOpc2 {

  static int[] geraVetor(int tamanho, int inicio, int fim){
    Random aleatorio = new Random();
    int[] vetor = new int[tamanho];
    for (int i = 0; i < tamanho; i++) {
      vetor[i] = aleatorio.nextInt(inicio, fim);
    }
    return vetor;
  }

  static void mostraVetor(int[] vetor, String nome){
    IO.println("Dados no "+nome);
    for(int i:vetor)
      IO.print(i+" ");
    IO.println("\n");
  }

  static void main() {
    Random aleatorio = new Random();
    int[] vx = geraVetor(10,10,30);
    int[] vy = geraVetor(10,10,30);
    int[] vr = new int[20];

    mostraVetor(vx,"vetor x");
    mostraVetor(vy,"vetor y");

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

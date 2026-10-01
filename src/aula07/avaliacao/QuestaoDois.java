package aula07.avaliacao;

public class QuestaoDois {
  static void main() {
    int i;
    int[] va = new int[10];
    int[] vb = new int[10];
    for(i=0;i<10;i++)
      va[i] = i+1;
    for(int j=0;j<10;j++)
      vb[j] = va[--i];
    IO.println("\nVetor A");
    for(int e:va)
      IO.print(e+" ");

    IO.println("\nVetor B");
    for(int e:vb)
      IO.print(e+" ");

  }
}

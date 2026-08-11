package aula03.exemploFor;

public class Exemplo01 {
  static void main() {
    //for(inicialização; teste; passo)
    for(int i=0;i<10;i++){
      IO.print(i+" ");
    }
    int j;
    IO.println("\nExemplo 2, declarando uma variável fora");
    for(j=0;j<20;j+=2)
      IO.print(j+" ");
    IO.println("\n"+j);
    IO.println("\nUsar o for sem algum dos elementos");
    j=2;
    for(;j<20;){
      IO.print(j+" ");
      j+=2;
    }
    IO.println("\nPodemos usar mais de uma variável");
    for(int k=0, t=9; k<10 && t>=0; k++, t--){
      IO.println("k="+k+", t="+t);
    }
  }
}

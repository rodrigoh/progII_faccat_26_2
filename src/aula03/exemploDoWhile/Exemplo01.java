package aula03.exemploDoWhile;

public class Exemplo01 {
  static void main() {
    int i = 10;
    while(i<10){
      IO.print(i+" ");
      i++;
    }
    do{
      IO.print(i+" ");
      i++;
    }
    while(i<10);
  }
}

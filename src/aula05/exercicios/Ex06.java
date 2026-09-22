package aula05.exercicios;

public class Ex06 {

  static boolean ePrimo(int numero){
    int contDiv = 0;
    for (int i = 1; i <=numero; i++) {
      if(numero%i==0){
        contDiv++;
      }
    }
    return contDiv==2;
  }

  static void main() {
    for (int i = 1; i < 1000; i++) {
      if(ePrimo(i)) {
        IO.print(i + " ");
      }
    }
  }
}

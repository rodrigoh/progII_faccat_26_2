package aula02.exemploWhile;

public class Exemplo02 {
  static void main() {
    int num = Integer.parseInt(IO.readln("Digite um número de 1 a 10: "));
    while (num<1 || num>10){
      num = Integer.parseInt(IO.readln("Eu disse entre 1 e 10: "));
    }

    int cont = 1;
    while(cont<=10){
      int mult = cont * num;
      IO.println(cont+" * "+num+" = "+mult);
      //IO.println("%d * %d = %d".formatted(cont,num,mult));
      cont++;
    }
  }
}

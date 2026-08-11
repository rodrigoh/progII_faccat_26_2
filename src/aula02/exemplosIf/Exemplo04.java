package aula02.exemplosIf;

public class Exemplo04 {
  static void main() {
    int idade = Integer.parseInt(IO.readln("Qual sua idade: "));
    //Operador ternário (teste?valor_se_verdadeiro:valor_se_falso)
    IO.println("Você é "+(idade>=18?"maior de idade":"menor de idade"));
    boolean valor = idade>=18;
    IO.println("É maior de idade "+(valor?"Sim":"Não"));
  }
}

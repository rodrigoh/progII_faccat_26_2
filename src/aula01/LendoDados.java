package aula01;

public class LendoDados {
  static void main() {
    //Lendo uma String do teclado
    String nome = IO.readln("Qual seu nome: ");

    //Lendo um número inteiro do teclado
    int numero = Integer.parseInt(IO.readln("Digite um número: "));

    //Lendo um float do teclado
    float valor = Float.parseFloat(IO.readln("Digite um número real: "));

    //Lendo um double do teclado
    double valorDouble = Double.parseDouble(IO.readln("Digite outro número real: "));

    //Lendo um char do teclado
    char letra = IO.readln("Digite uma letra").charAt(0);
  }
}

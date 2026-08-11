package aula02;

public class LendoTeclado {
  static void main() {
    String nome = IO.readln("Digite seu nome: ");

    //Lendo um float do teclado
    float altura = Float.parseFloat(IO.readln(nome+" qual sua altura em metros: "));

    //Lendo um inteiro do teclado
    int idade = Integer.parseInt(IO.readln(nome+" qual sua idade: "));

    IO.println("O nome é "+nome+" tem "+altura+" metros e "+idade+" anos");

    IO.println("O nome é %s tem %.2f metros e %d anos".formatted(nome,altura,idade));

  }
}

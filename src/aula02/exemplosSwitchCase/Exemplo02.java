package aula02.exemplosSwitchCase;

public class Exemplo02 {
  static void main() {
    int dia = Integer.parseInt(IO.readln("Entre com um dia da semana (1-7): "));

    switch (dia){
      case 1->{
        IO.println("É domingo");
        IO.println("É fim de semana");
      }
      case 2-> IO.println("É segunda-feira");
      case 3-> IO.println("É terça-feira");
      case 4-> IO.println("É quarta-feira");
      case 5-> IO.println("É quinta-feira");
      case 6-> IO.println("É sexta-feira");
      case 7-> {
        IO.println("É sábado");
        IO.println("É fim de semana");
      }
      default -> IO.println("O valor "+dia+" não corresponde a nenhum dia da semana.");
    }
  }
}

package aula02.exemplosSwitchCase;

public class Exemplo01 {
  static void main() {
    int dia = Integer.parseInt(IO.readln("Informe um dia da semana: "));
    switch (dia){
      case 1:
        IO.println("É domingo");
        IO.println("É fim de semana");
        break;
      case 2:
        IO.println("É segunda-feira");
        break;
      case 3:
        IO.println("É terça-feira");
        break;
      case 4:
        IO.println("É quarta-feira");
        break;
      case 5:
        IO.println("É quinta-feira");
        break;
      case 6:
        IO.println("É sexta-feira");
        break;
      case 7:
        IO.println("É sábado");
        IO.println("É fim de semana");
        break;
      default:
        IO.println("O valor "+dia+" não corresponde a nenhum da semana");
    }
  }
}

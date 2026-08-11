package aula02.exemplosSwitchCase;

public class Exemplo03 {
  static void main() {
    String mes = IO.readln("Informe um mês:").toLowerCase();

    switch (mes){
      case "janeiro"-> IO.println("Estamos em férias");
      case "fevereiro","março","abril","maio"-> IO.println("Estamos no primeiro semestre");
      case "agosto","setembro","outubro"-> IO.println("Estamos no segundo semestre");
    }
    if(mes.equals("fevereiro")
            || mes.equals("março")
            ||mes.equals("abril")
            ||mes.equals("maio"))
      IO.println("Estamos no primeiro semestre");
  }
}

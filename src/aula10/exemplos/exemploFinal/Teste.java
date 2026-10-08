package aula10.exemplos.exemploFinal;


public class Teste {
  static void main() {
    IO.println("O valor de PI é "+Operacoes.PI);
    Operacoes op = new Operacoes(10);
    IO.println("O valor de valor é "+ op.getValor());
  }
}

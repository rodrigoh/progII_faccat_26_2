package exemplos;

import aula10.exemplos.acessoConta.Conta;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Banco {
  static void main() {
    Conta c1 = new Conta("Jonas", "123456");
    IO.println(c1.getIdentificador());
    c1.depositar(1000);
    IO.println(c1.getIdentificador());

    Pessoa p1 = new Pessoa();
    p1.setData(LocalDate.of(2026,10,5));
    IO.println(p1.getData());
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    IO.println(formatter.format(p1.getData()));

  }
}

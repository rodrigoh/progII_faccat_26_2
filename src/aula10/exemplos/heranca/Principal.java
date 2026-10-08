package aula10.exemplos.heranca;

import java.time.LocalDate;

public class Principal {
  static void main() {
    Motorista m1 = new Motorista("Jonas", "Souza", "jonas@empresa.com");
    m1.setNome("Jonas");
    m1.setSobrenome("Souza");
    m1.setEndereco("Rua a bairro b");
    m1.setMail("jonas@empresa.com");
    m1.setSalario(3000);
    m1.setTelefone("5198789658");
    m1.setDataContrato(LocalDate.of(2026,10,5));

    Medico medico = new Medico("Ana", "Souza","ana@empresa.com","acb5677");

  }
}

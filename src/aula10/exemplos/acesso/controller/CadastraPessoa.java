package aula10.exemplos.acesso.controller;

import aula10.exemplos.acesso.model.Pessoa;

public class CadastraPessoa {
  static void main() {
    Pessoa p1 = new Pessoa();
    p1.mail = "jonas@gmail.com";
    // Agora é possível realizar acesso aos atributos privados
    p1.setSobrenome("Silva");
    IO.println(p1.getSobrenome());
  }
}

package aula10.exemplos;

public class Principal {
  static void main() {
    Pessoa p1 = new Pessoa("Jonas","Silva");
    Pessoa p2 = new Pessoa("Ana","Souza");
    // Acessando um método diretamente da classe
    IO.println("Até o momento temos %d pessoas".formatted(Pessoa.getQuantidade()));
  }
}

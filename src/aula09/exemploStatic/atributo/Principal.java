package aula09.exemploStatic.atributo;

public class Principal {
  static void main() {
    Conta c1 = new Conta("Jonas","123456");
    Conta c2 = new Conta("Ana","123456");

    c1.nomeBanco = "Banco FACCAT";

    // O atributo nomeBanco é único para todas as instâncias
    IO.println(c1.nomeBanco);
    IO.println(c2.nomeBanco);

    // Existe mesmo que não seja criada nenhuma instância
    Conta.nomeBanco = "Banco teste";

    IO.println(c1.nomeBanco);
    IO.println(c2.nomeBanco);

  }
}

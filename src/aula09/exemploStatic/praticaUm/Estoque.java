package aula09.exemploStatic.praticaUm;

public class Estoque {
  static void main() {
    Produto p1 = new Produto("Mesa",500.99,"A12");
    Produto p2 = new Produto("Computador", 4599.99,"C10");
    Produto p3 = new Produto("Mouse", 82.90,"A14");
    IO.println(p1.mostraInformacoes());
    IO.println(p2.mostraInformacoes());
    IO.println(p3.mostraInformacoes());
    IO.println("Quantos produtos tem cadastrados? "+Produto.obterContagem());
  }
}

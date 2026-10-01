package aula09.exemploStatic.praticaUm;

public class Produto {

  String nome;
  double preco;
  String codigo;

  static int quantProdutos;

  Produto(String nome, Double preco, String codigo){
    this.nome = nome;
    this.codigo = codigo;
    this.preco = preco;
    quantProdutos++;
  }

  static int obterContagem(){
    return quantProdutos;
  }

  String mostraInformacoes(){
    return "Nome: "+nome+" Preço R$ %.2f ".formatted(preco)+" Código: "+codigo;
  }
}

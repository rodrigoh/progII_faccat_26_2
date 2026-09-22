package aula08.exemplosPoo.carroBasico;

public class CadastroCarro {

  static void main() {
    // Criando a primeira instância de Carro
    // NomeClasse nomeInstância = new NomeClasse();
    Carro c1 = new Carro();
    c1.marca = "VW";
    c1.modelo = "fusca";
    c1.km = 85989;
    c1.cor = "azul";
    c1.anoFabricacao = 1980;

    c1.andar();
    c1.frear();
    c1.abastecer();

    // Segunda instância do Objeto Carro
    Carro c2 = new Carro();
    c2.marca = "Fiat";
    c2.modelo = "500";
    c2.km = 95333;
    c2.cor = "vermelho";
    c2.anoFabricacao = 1960;

    c2.andar();
    c2.frear();
    c2.abastecer();

    // Terceira instância do objeto Carro
    Carro c3 = new Carro();
    c3.marca = "Porsche";
    c3.modelo = "356";
    c3.km = 125352;
    c3.cor = "verde";
    c3.anoFabricacao = 1960;

    c3.andar();
    c3.frear();
    c3.abastecer();

    Carro carro = new Carro();

  }
}

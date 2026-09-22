package aula08.exemplosPoo.carroMelhorado;

public class Teste {
  static void main() {
    Carro carro = new Carro();
    carro.marca = "fiat";
    carro.modelo = "uno";
    carro.cor = "branco";
    carro.anoFabricacao = 2010;
    carro.velocidadeMaxima = 200;
    carro.km = 350000;
    carro.capacidadeTanque = 50;

    if(carro.abastecer(30)) {
      IO.println("Veículo " + carro.modelo + " abastecido");
    }
    else{
      IO.println("Veículo " + carro.modelo + " não tem capacidade para tanto combustível");
    }

    // enviando uma mensagem para o carro, para andar a 80 km/h
    carro.andar(80);

    while(carro.velocidadeAtual>0){
      carro.frear();
    }




  }
}

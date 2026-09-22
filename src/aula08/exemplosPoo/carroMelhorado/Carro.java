package aula08.exemplosPoo.carroMelhorado;

public class Carro {
  String marca;
  String modelo;
  String cor;
  int km;
  int anoFabricacao;
  float capacidadeTanque;
  float combustivelAtual;
  int velocidadeMaxima;
  int velocidadeAtual;

  void andar(int velocidade){
    if(velocidade+velocidadeAtual<velocidadeMaxima){
      velocidadeAtual+=velocidade;
    }
    IO.println("Veículo "+marca+" "+modelo+" está andando a "+velocidadeAtual+" km/h");
  }

  void frear(){
    if(velocidadeAtual>0)
      velocidadeAtual-=20;
    IO.println("Veículo "+marca+" "+modelo+" está andando a "+velocidadeAtual+" km/h");
  }

  boolean abastecer(float quantidade){
    if(combustivelAtual+quantidade<capacidadeTanque) {
      combustivelAtual += quantidade;
      return true;
    }
    return false;
  }
}

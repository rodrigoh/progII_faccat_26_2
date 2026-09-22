package aula08.exemplosPoo.carroBasico;

public class Carro {
  String marca;
  String modelo;
  String cor;
  int km;
  int anoFabricacao;

  void andar(){
    IO.println("Veículo "+marca+" "+modelo+" está andando...");
  }

  void frear(){
    IO.println("Veículo "+marca+" "+modelo+" está parado");
  }

  void abastecer(){
    IO.println("Veículo "+marca+" "+modelo+" está abastecendo...");
  }
}

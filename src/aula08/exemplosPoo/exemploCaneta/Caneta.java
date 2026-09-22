package aula08.exemplosPoo.exemploCaneta;

public class Caneta {

  // Atributos (características ou estados)
  String fabricante;
  String cor;
  int quantTinta;

  // Ações
  void escrever(String texto){
    if(quantTinta>0){
      IO.println("Caneta "+fabricante+" escrevendo: "+texto);
      quantTinta--;
    }
  }
}

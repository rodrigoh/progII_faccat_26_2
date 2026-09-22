package aula08.exemplosPoo.exemploCaneta;

public class Principal {
  static void main() {
    Caneta bicAzul = new Caneta();
    bicAzul.fabricante = "BIC";
    bicAzul.cor = "Azul";
    bicAzul.quantTinta = 15;

    for (int i = 0; i < 20; i++) {
      bicAzul.escrever("linha "+i+" do texto...");
    }
  }
}

package aula03.exemploDoWhile;

public class Exemplo02 {
  static void main() {
    char resp='s';
    while(resp=='s'){
      resp = IO.readln("Deseja continuar (s - sim n - não): ").charAt(0);
    }
    //Usando o do...while
    char resposta;
    do{
      resposta = IO.readln("Deseja continuar (s - sim n - não): ").charAt(0);
    }
    while (resposta=='s');
  }
}

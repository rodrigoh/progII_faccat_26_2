package aula08.exemplosPoo.exemploVetorObjetos;

public class Principal {
  static void main() {
    // Criando um vetor de Pessoas
    Pessoa[] lista = new Pessoa[10];

    int contPessoa = 0;

    char continuar = 's';

    while(continuar=='s'){
      String nome = IO.readln("Qual o nome: ");
      String sobrenome = IO.readln("Qual o sobrenome: ");
      String mail = IO.readln("Qual o e-mail: ");
      lista[contPessoa] = new Pessoa(nome,sobrenome);
      lista[contPessoa].mail = mail;
      contPessoa++;
      continuar = IO.readln("Tem mais pessoas (s = sim n = não): ").toLowerCase().charAt(0);
    }

    for (int i = 0; i < contPessoa; i++) {
      IO.println(lista[i].apresentar());
    }

  }
}

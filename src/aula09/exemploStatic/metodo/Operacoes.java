package aula09.exemploStatic.metodo;

import java.util.Random;

public class Operacoes {

  // Os métodos podem ser acessados diretamente da classe
  static int somaVetor(int[] vetor){
    int soma = 0;
    for (int i:vetor)
      soma+=i;
    return soma;
  }

  static int leInteiro(String mensagem){
    return Integer.parseInt(IO.readln(mensagem+": "));
  }

  static int[] geraVetor(int tamanho){
    Random aleatorio = new Random();
    int[] vetor = new int[tamanho];
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(tamanho*2);
    }
    return vetor;
  }
}

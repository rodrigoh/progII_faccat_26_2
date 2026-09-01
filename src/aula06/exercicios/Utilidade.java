package aula06.exercicios;

import java.util.Random;

public class Utilidade {

  static int[] geraVetor(int capacidade){
    Random aleatorio = new Random();
    //tipo[] nome = new tipo[capacidade]
    int[] vetor = new int[capacidade];
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = aleatorio.nextInt(capacidade*2);
    }
    return vetor;
  }

  static String mostraFormatado(int[] vetor, String nome){
    String retorno = "\nDados no vetor "+nome+"\n[";
    for (int i = 0; i < vetor.length-1; i++) {
      retorno+=vetor[i]+", ";
    }
    retorno+=vetor[vetor.length-1];
    return retorno+"]";
  }

  static String mostraFormatado(int[] vetor, String nome, int quant){
    String retorno = "\nDados no vetor "+nome+"\n[";
    for (int i = 0; i < quant-1; i++) {
      retorno+=vetor[i]+", ";
    }
    retorno+=vetor[quant-1];
    return retorno+"]";
  }

  static double leDouble(String mensagem){
    return Double.parseDouble(IO.readln(mensagem+": "));
  }

  static double leNota(String mensagem){
    double nota = leDouble(mensagem);
    while(nota<0 || nota>10)
      nota = leDouble("Nota inválida, digite outra: ");

    return nota;
  }

  static int[] ordenaVetor(int[] vetor){
    for (int i = 0; i < vetor.length; i++) {
      for(int j=0; j < vetor.length ; j++){
        if(vetor[i]<vetor[j]){
          int aux = vetor[i];
          vetor[i] = vetor[j];
          vetor[j] = aux;
        }
      }
    }
    return vetor;
  }

  static boolean ePermutacao(int[] v1, int[] v2){
    if(v1.length!=v2.length)
      return false;

    for (int i=0;i<v1.length;i++){
      boolean achei = false;
      for (int j=0;j<v2.length;j++){
        if(v1[i]==v2[j])
          achei = true;
      }
      if(!achei)
        return false;
    }
    return true;
  }
}

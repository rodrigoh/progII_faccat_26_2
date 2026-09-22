package aula08.avaliacao;

public class QuestaoSete {

  //a
  static void mostraVetor(int[] vetor){
    for(int i:vetor)
      IO.print(i+" ");
  }

  //b
  static int soma(int[] vetor){
    int soma = 0;
    for(int i=0;i<vetor.length;i++)
      soma+=vetor[i];
    return soma;
  }

  //c
  static double calculaMedia(int[] vetor){
    double soma = soma(vetor);
    return soma/vetor.length;
  }

  //d
  static int acimaMedia(int[] vetor, double media){
    int cont=0;
    for (int i = 0; i < vetor.length; i++) {
      if(vetor[i]>media)
        cont++;
    }
    return cont;
  }

  static void main() {
    int[] vetor = {9,8,10,5,6,7,10,5};
    IO.println("Dados no vetor");
    mostraVetor(vetor);
    double media = calculaMedia(vetor);
    IO.println("\nMédia dos elementos %.3f".formatted(media));
    IO.println("Estão acima desta média "+acimaMedia(vetor,media));
  }
}

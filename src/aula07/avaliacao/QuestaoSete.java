package aula07.avaliacao;

public class QuestaoSete {
  //a
  static void mostraVetor(int[] vetor){
    for(int i:vetor)
      IO.print(i+" ");
  }
  //b
  static int soma(int[] vetor){
    int soma = 0;
    for(int i:vetor)
      soma+=i;
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
    int[] numeros = {4,5,2,3,9,10,7};
    mostraVetor(numeros);
    double media = calculaMedia(numeros);
    int contAcima = acimaMedia(numeros, media);
    IO.println("A média dos números acima vale %.3f".formatted(media));
    IO.println("Estão acima desta média "+contAcima+" valores");
  }

}

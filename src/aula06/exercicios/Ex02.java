package aula06.exercicios;

/**
 * Faça um programa para ler 10 números DIFERENTES a serem armazenados
 * em um vetor. Os dados deverão ser armazenados no vetor na ordem que
 * forem sendo lidos, sendo que caso o usuário digite um número que já
 * foi digitado anteriormente, o programa deverá pedir para ele digitar
 * outro número. Note que cada valor digitado pelo usuário deve ser
 * pesquisado no vetor, verificando se ele existe entre os números
 * que já foram fornecidos. Exibir na tela o vetor final que foi digitado.
 */
public class Ex02 {
  static void main(String[] args) {
    int[] vetor = new int[10];
    for(int i=0;i<vetor.length;){
      int num = Integer.parseInt(IO.readln("vetor["+i+"]: "));
      boolean achei = false;
      for (int j = 0; j < i; j++) {
        if(num==vetor[j]){
          achei = true;
        }
      }
      if(!achei){
        vetor[i] = num;
        i++;
      }
    }
    IO.println(Utilidade.mostraFormatado(vetor,"vetor"));
  }
}

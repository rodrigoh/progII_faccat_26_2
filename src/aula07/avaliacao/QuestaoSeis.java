package aula07.avaliacao;

public class QuestaoSeis {
  static void main() {
    int total = 0;
    for(int i = 0; i < 3; i++) {
      int parcial = i * 2;
      total += parcial;
    }
    //A variável parcial não existe fora do for
    //System.out.println(total + parcial);
  }
}

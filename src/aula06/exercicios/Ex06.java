package aula06.exercicios;

public class Ex06 {
  static void main() {
    int[] v1 = {1, 2, 3, 4, 5};
    int[] v2 = {3, 1, 4, 2, 5};

    if(Utilidade.ePermutacao(v1,v2))
      IO.println("Os vetores v1 e v2 são uma permutação");
    else
      IO.println("Os vetores v1 e v2 não são uma permutação");

  }
}

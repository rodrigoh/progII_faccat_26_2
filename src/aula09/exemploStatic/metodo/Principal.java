package aula09.exemploStatic.metodo;

public class Principal {
  static void main() {
    int[] vetor = Operacoes.geraVetor(10);
    for(int i:vetor){
      IO.print(i+" ");
    }
    int soma = Operacoes.somaVetor(vetor);
    IO.println("\nA soma dos elementos vale "+soma);

    // Ao usar as funções do Java estamos usando métodos estáticos
    int num = Integer.parseInt("9");

  }
}

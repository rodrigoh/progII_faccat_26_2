package aula06.exercicios;

/**
 * Leia números de matrículas de alunos e armazene-os em um vetor
 * até o vetor ser preenchido por 10 matrículas. Esses números são
 * distintos, ou seja, o vetor não armazenará valores repetidos.
 * Para cada aluno calcule a média de 3 notas. Armazenar a
 * média em outro vetor. Ao final mostrar cada aluno e suas
 * respectivas notas (médias)
 */
public class Ex04 {
  static void main(String[] args) {
    int[] matriculas = new int[10];
    int i=0;
    while(i<matriculas.length){
    //for(int i=0;i<matriculas.length;){
      int mat = Integer.parseInt(IO.readln("Informe a matrícula do aluno "+(i+1)+"º : "));
      boolean achei = false;
      for (int j = 0; j < i; j++) {
        if(mat==matriculas[j]){
          achei = true;
        }
      }
      if(!achei){
        matriculas[i] = mat;
        i++;
      }
      else{
        IO.println("\nMatrícula "+mat+" já cadastrada.");
      }
    }
    //Segunda parte
    double[] medias = new double[10];
    for (int j = 0; j < matriculas.length; j++) {
      IO.println("Lendo as notas do aluno "+matriculas[j]);
      double n1 = Utilidade.leNota("N1: ");
      double n2 = Utilidade.leNota("N2: ");
      double n3 = Utilidade.leNota("N3: ");
      medias[j] = (n1+n2+n3)/3;
    }

    //Terceira parte
    for (int j = 0; j < matriculas.length; j++) {
      IO.println("Matrícula %d, tem média %.2f".formatted(matriculas[j],medias[j]));
    }


  }

}

package aula02.exemplosIf;

public class Exemplo01 {
  static void main() {
    /*
    Resumo dos operadores relacionais

    > significa maior que
    < significa menor que
    >= significa maior ou igual a
    <= significa menor ou igual a
    != diferente de
    == igual a
     */
    /*
    Operadores lógicos

    && É um E lógico, significa que ambos os termos da equação lógica
    precisam ser verdadeiros para ter um resultado verdadeiro
    || É um OU lógico, significa que pelo menos um dos termos da equação
    lógica precisa ser verdadeiro para o resultado ser verdadeiro
    ^ É um XOR e funciona com o OU lógico, porém só da verdade quando os termos da equação
    forem diferentes. Ex true ^ false = true, true ^ true = false;
    ! É um não lógico, que simplesmente inverte o resultado de uma equação lógica

     */
    float n1 = Float.parseFloat(IO.readln("Qual a primeira nota: "));
    float n2 = Float.parseFloat(IO.readln("Qual a segunda nota: "));

    float media = (n1+n2)/2;

    if(media>=8)
      IO.println("O aluno está aprovado com média "+media);
    else if(media>=6)
      IO.println("O aluno está em recuperação com média "+media);
    else
      IO.println("Ops! Não foi dessa vez.");
  }
}

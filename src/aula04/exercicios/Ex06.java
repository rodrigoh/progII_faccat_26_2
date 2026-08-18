package aula04.exercicios;

/**
 * Faça um programa que solicite ao usuário digitar dois valores, em seguida, exiba na tela qual dos dois é o maior.
 * OBS: o usuário poderá informar valores iguais, logo, o sistema deve dizer que foram digitados valores iguais.
 */
public class Ex06 {
    static void main() {
        int n1 = Integer.parseInt(IO.readln("n1: "));
        int n2 = Integer.parseInt(IO.readln("n2: "));
        if(n1==n2)
            IO.println("Os valores são iguais");
        else if(n1<n2)
            IO.println("O maior valor é n2 que vale "+n2);
        else
            IO.println("O maior valor é n1 que vale "+n1);
    }
}

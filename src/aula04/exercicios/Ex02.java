package aula04.exercicios;

/**
 * Faça um programa que leia o nome e a idade de 1 nadador e exiba na tela o nome da categoria a qual este nadador pertence.
 * A categoria dos nadadores é dada pela seguinte tabela:
 */
public class Ex02 {
    static void main() {
        String nome = IO.readln("Qual seu nome? ");
        int idade = Integer.parseInt(IO.readln(nome+" qual sua idade? "));
        if(idade>=5 && idade<=7)
            IO.println(nome+" pertence a categoria Infantil A");
        else if(idade>=8 && idade<=10)
            IO.println(nome+" pertence a categoria Infantil B");
        else if(idade>=11 && idade<=13)
            IO.println(nome+" pertence a categoria Juvenil A");
        else if(idade>=14 && idade<=17)
            IO.println(nome+" pertence a categoria Juvenil B");
        else if(idade>=18)
            IO.println(nome+" pertence a categoria adulto");
        else
            IO.println(nome+" não se enquadra em nenhuma categoria");
    }
}

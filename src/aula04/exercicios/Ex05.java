package aula04.exercicios;

/**
 * Crie um programa que teste se o valor que usuário digitou está entre 10 e 15 e exibe alguma mensagem na tela.
 */
public class Ex05 {
    static void main() {
        int numero = Integer.parseInt(IO.readln("digite um número entre 10 e 15: "));

        if(numero>=10 && numero<=15)
            IO.println("Número está no intervalo esperado");
        else
            IO.println("Número não está no intervalo esperado");
    }
}

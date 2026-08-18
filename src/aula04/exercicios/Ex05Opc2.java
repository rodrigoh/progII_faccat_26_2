package aula04.exercicios;

/**
 * Crie um programa que teste se o valor que usuário digitou está entre 10 e 15 e exibe alguma mensagem na tela.
 */
public class Ex05Opc2 {
    static void main() {
        int numero = Integer.parseInt(IO.readln("digite um número entre 10 e 15: "));
        while(numero<10 || numero>15)
            numero = Integer.parseInt(IO.readln("Precisa estar entre 10 e 15: "));

        IO.println("Número está no intervalo esperado");
    }
}

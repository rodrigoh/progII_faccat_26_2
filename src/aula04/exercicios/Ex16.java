package aula04.exercicios;

/**
 * Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número.
 * Observação: Não utilize a função de potência da linguagem.
 */
public class Ex16 {
    static void main() {
        int base = Integer.parseInt(IO.readln("Qual o valor da base: "));
        int expoente = Integer.parseInt(IO.readln("Qual o valor do expoente: "));
        int resposta = 1;
        for (int i = 0; i < expoente; i++) {
            resposta*=base;
        }
        IO.println(base+"^"+expoente+"="+resposta);
    }
}

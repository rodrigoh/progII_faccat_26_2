package aula04.exercicios;

/**
 * Crie um programa em que o usuário informa o nome de um mês (ex: janeiro) e o programa exibe o número correspondente a esse mesmo mês (ex: 1);
 */
public class Ex01 {
    static void main() {
        String mes = IO.readln("Qual o nome do mês: ").toLowerCase();
        switch (mes){
            case "janeiro"-> IO.println("O número do mês é 1");
            case "fevereiro"-> IO.println("O número do mês é 2");
            case "março"-> IO.println("O número do mês é 3");
            case "abril"-> IO.println("O número do mês é 4");
            case "maio"-> IO.println("O número do mês é 5");
            case "junho"-> IO.println("O número do mês é 6");
            case "julho"-> IO.println("O número do mês é 7");
            case "agosto"-> IO.println("O número do mês é 8");
            case "setembro"-> IO.println("O número do mês é 9");
            case "outubro"-> IO.println("O número do mês é 10");
            case "novembro"-> IO.println("O número do mês é 11");
            case "dezembro"-> IO.println("O número do mês é 12");
            default -> IO.println("A palavra "+mes+" não corresponde a nenhum mês");
        }
    }
}

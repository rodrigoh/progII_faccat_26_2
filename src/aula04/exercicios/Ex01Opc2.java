package aula04.exercicios;

/**
 * Crie um programa em que o usuário informa o nome de um mês (ex: janeiro) e o programa exibe o número correspondente a esse mesmo mês (ex: 1);
 */
public class Ex01Opc2 {
    static void main() {
        String mes = IO.readln("Qual o nome do mês: ").toLowerCase();
        if(mes.equals("janeiro"))
            IO.println("O número do mês é 1");
        else if(mes.equals("fevereiro"))
            IO.println("O número do mês é 2");
        else if(mes.equals("março"))
            IO.println("O número do mês é 3");
        else if(mes.equals("abril"))
            IO.println("O número do mês é 4");
        //...
        else
            IO.println("A palavra "+mes+" não corresponde a nenhum mês");
    }
}

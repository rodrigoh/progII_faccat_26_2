package aula04.exercicios;

/**
 * A calculadora de Luciana pifou, justo quando ela precisa fazer vários cálculos. Ela tem um computador, mas não sabe que um dos
 * acessórios do Windows é uma calculadora. Sendo estudante de programação, Luciana resolveu fazer um programa. A especificação que
 * bolou prevê que programa leia dois números inteiros (o que atende suas necessidades) e em seguida um símbolo de operação. Se este
 * for '+', o programa soma os números, se '-', subtrai, se '*' multiplica e se '/' divide. Se o símbolo for diferente desses, é
 * mostrada uma mensagem de erro. O programa, antes de dividir, critica se o divisor é zero e mostra uma mensagem de erro.
 * Implemente um programa que construa essa calculadora para Luciana
 */
public class Ex08 {
    static void main() {
        String opc;
        do{
            IO.println("Selecione uma operação");
            IO.println("+ -> para soma");
            IO.println("- -> para subtração");
            IO.println("* -> para multiplicação");
            IO.println("/ -> para divisão");
            IO.println("s -> para sair");
            opc = IO.readln(": ").toLowerCase();
            if(!opc.equals("s")){
                int n1 = Integer.parseInt(IO.readln("Qual o primeiro operador: "));
                int n2 = Integer.parseInt(IO.readln("Qual o segundo operador"));
                switch (opc){
                    case "+"-> IO.println(n1+opc+n2+"="+(n1+n2));
                    //IO.println("%d %c %d = %d".formatted(n1,opc,n2,n1+n2));
                    case "-"-> IO.println(n1+opc+n2+"="+(n1-n2));
                    case "*"-> IO.println(n1+"*"+n2+"="+(n1*n2));
                    case "/"->{
                        if(n2!=0)
                            IO.println(n1+opc+n2+"="+(n1/n2));
                        else
                            IO.println("Não é possível dividir por zero");
                    }
                }
            }
        }
        while (!opc.equals("s"));
    }
}

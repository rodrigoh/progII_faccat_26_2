package aula04.exemplosMetodos;

public class Exemplo02 {

    static int resultado;

    //tipo retorno (int, float, double, void...) nome(tipo nome, tipo2, nome2...){}
    static void soma(int n1, int n2){
        resultado = n1+n2;
    }


    static void main() {
        int num1 = Integer.parseInt(IO.readln("Digite um número: "));
        int num2 = Integer.parseInt(IO.readln("Digite outro número: "));
        soma(num1, num2);
        IO.println("A soma de "+num1+" com "+num2+" = "+resultado);
    }
}

package aula04.exemplosMetodos;

public class Exemplo01 {

    //tipo retorno (int, float, double, void...) nome(tipo nome, tipo2, nome2...){}
    static int soma(int n1, int n2){
        return n1+n2;
    }


    static void main() {
        int num1 = Integer.parseInt(IO.readln("Digite um número: "));
        int num2 = Integer.parseInt(IO.readln("Digite outro número: "));
        int resposta = soma(num1, num2);
        IO.println("A soma de "+num1+" com "+num2+" = "+resposta);
    }
}

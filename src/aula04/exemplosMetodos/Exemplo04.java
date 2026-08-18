package aula04.exemplosMetodos;

public class Exemplo04 {
    //Integer, Float, String, Pessoa
    //int, float, char, double, boolean
    //void
    static int leNumero(String mensagem){
        return Integer.parseInt(IO.readln(mensagem+": "));
    }

    static int potencia(int base, int expoente){
        int resposta = 1;
        for (int i = 0; i < expoente; i++) {
            resposta*=base;
        }
        return resposta;
    }

    static void main() {
        int base = leNumero("Qual o valor da base");
        int expoente = leNumero("Qual o valor do expoente");
        int resultado = potencia(base,expoente);
        IO.println(base+"^"+expoente+"="+resultado);
    }
}

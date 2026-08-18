package aula04.exemplosMetodos;

public class Exemplo03 {

    static int leNumero(String mensagem){
        return Integer.parseInt(IO.readln(mensagem+": "));
    }

    static float leFloat(String mensagem){
        return Float.parseFloat(IO.readln(mensagem+": "));
    }

    static String leString(String mensagem){
        return IO.readln(mensagem+": ");
    }

    static void main() {
        String nome = leString("Qual seu nome");
        int idade = leNumero(nome+" qual sua idade");
        float altura = leFloat(nome+" qual sua altura em metros");
        IO.println("%s tem %d e mede %.2f metros".formatted(nome,idade,altura));
    }
}

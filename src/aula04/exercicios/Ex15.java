package aula04.exercicios;

/**
 * Escreva um programa para ler 2 números e escrever a soma dos inteiros existentes entre os 2 números lidos
 * (incluindo os números lidos na soma). Exemplo: Números lidos: 2 e 5 Resultado: 2+3+4+5 = 14. Observação:
 * Considere que o segundo valor lido será sempre maior que o primeiro valor lido.
 */
public class Ex15 {
    static void main() {
        int n1 = Integer.parseInt(IO.readln("Qual o primeiro número: "));
        int n2 = Integer.parseInt(IO.readln("Qual o segundo número: "));
        while(n2<=n1){
            n2 = Integer.parseInt(IO.readln("O valor precisa ser maior que "+n1+": "));
        }

        int soma = 0;
        for(int i=n1;i<n2;i++){
            soma+=i;
            IO.print(i+" + ");
        }
        soma+=n2;
        IO.println(n2+" = "+soma);
    }
}

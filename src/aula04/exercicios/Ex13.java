package aula04.exercicios;

/**
 * Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente.
 */
public class Ex13 {
    static void main() {
        int a = Integer.parseInt(IO.readln("A: "));
        int b = Integer.parseInt(IO.readln("B: "));
        //Validando para que o usuário não digite valores iguais (opcional)
        while(b==a)
            b = Integer.parseInt(IO.readln("O valor precisa ser diferente de "+a+": "));
        int c = Integer.parseInt(IO.readln("C: "));
        while(c==a || c==b){
            c = Integer.parseInt(IO.readln("O valor precisa ser diferente de "+a+" e "+b+": "));
        }
        /** Todas as combinações
         * A B C
         * A C B
         * B A C
         * B C A
         * C A B
         * C B A
         **/
        if(a<b && b<c)
            IO.println("A ordem é %d, %d e %d".formatted(a,b,c));
        else if(a<c && c<b)
            IO.println("A ordem é %d, %d e %d".formatted(a,c,b));
        else if(b<a && a<c)
            IO.println("A ordem é %d, %d e %d".formatted(b,a,c));
        else if(b<c && c<a)
            IO.println("A ordem é %d, %d e %d".formatted(b,c,a));
        else if(c<a && a<b)
            IO.println("A ordem é %d, %d e %d".formatted(c,a,b));
        else
            IO.println("A ordem é %d, %d e %d".formatted(c,b,a));
    }
}

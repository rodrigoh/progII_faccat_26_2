package aula04.exemplosMetodos;

public class Exemplo05 {

    static boolean ePrimo(int numero){
        int contDiv = 0;
        for (int i = 1; i <= numero; i++) {
            if(numero%i==0)
                contDiv++;
            //Se já encontrar mais que dois divisores inteiros para o número já posso retornar false
            if(contDiv>2)
                return false;
        }
        return contDiv==2;
    }

    static void main() {
        IO.println("São primos entre 1 e 1000");
        for(int i=1;i<1000;i++){
            if(ePrimo(i))
                IO.print(i+" ");
        }
    }
}

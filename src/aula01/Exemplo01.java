package aula01;

public class Exemplo01 {
  static void main(){
    //Para imprimir uma mensagem na tela
    IO.println("Mensagem a ser impressa na tela");
    //Para declarar e inicializar variáveis
    //Inteira int nome = valor
    //O tipo objeto relacionado é o Integer
    int numero = 10;

    //float
    //Todas as constantes de ponto flutuante no java são consideradas double
    //O tipo objeto relacionado é o Float
    //Podemos realizar a conversão de tipo usando (float) 5.5 ou 5.5f
    float numeroFloat = (float) 5.5;
    //float numeroFloat = 5.5f;

    //double
    //O tipo objeto relacionado é o Double
    double numeroDouble = 10.2;

    //Armazenar uma palavra ou texto
    String texto = "Agora estou escrevendo um texto em uma variável Java";

    //Para armazenar uma letra
    //O relacionado objeto é o Character
    char letra = 'a';

    //Ainda temos o tipo boolean
    boolean flag = true;

    String nome = "Jonas";
    double altura = 1.8;
    int idade = 20;

    //Imprimindo os valores das variáveis na tela
    IO.println("A pessoa chama "+nome+" tem "+idade+" anos e mede "+altura+"metros");

    //Imprimindo usando o método formatted da classe String
    IO.println("A pessoa chama %s tem %d anos e mede %.2f metros".formatted(nome,idade,altura));
    //System.out.printf("A pessoa chama %s tem %d anos e mede %.2f metros",nome,idade,altura);




  }
}

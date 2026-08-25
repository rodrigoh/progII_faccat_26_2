package aula05.exemplosVetores;

import java.util.Random;

public class Exemplo04 {
  static void main() {
    Random aleatorio = new Random();

    //gerar um número inteiro aleatório
    int numero = aleatorio.nextInt();
    IO.println("Número aleatório "+ numero);
    numero = aleatorio.nextInt(10);
    IO.println("Número aleatório até 10"+numero);
    numero = aleatorio.nextInt(-10,10);
    IO.println("Número aleatório entre -10 e 10 "+numero);

    float valor = aleatorio.nextFloat();
    IO.println("Valor real aleatório "+valor);

    boolean bitAleatorio = aleatorio.nextBoolean();

    IO.println("Cara ou Coroa "+(bitAleatorio?"Cara":"Coroa"));

    char letra = (char) aleatorio.nextInt(65,90);
    IO.println("Letra aleatória: "+letra);
  }
}

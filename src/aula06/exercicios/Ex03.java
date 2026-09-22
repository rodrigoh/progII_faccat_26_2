package aula06.exercicios;

/**
 * Declare três vetores com até 100 números, o primeiro deve receber
 * números aleatórios, o segundo deve receber os números pares do primeiro
 * vetor e o terceiro os números ímpares do primeiro vetor. Ao final
 * mostrar os três vetores
 */
public class Ex03 {
  static void main() {
    int[] va = Utilidade.geraVetor(100);
    int[] vp = new int[100];
    int[] vi = new int[100];
    int ip = 0;
    int ii = 0;
    for (int i = 0; i < va.length; i++) {
      if(va[i] %2==0){
        vp[ip] = va[i];
        ip++;
      }
      else{
        vi[ii] = va[i];
        ii++;
      }
    }
    IO.println(Utilidade.mostraFormatado(va,"va"));
    IO.println(Utilidade.mostraFormatado(vp,"vp",ip));
    IO.println(Utilidade.mostraFormatado(vi,"vi",ii));

  }
}

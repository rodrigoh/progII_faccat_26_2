package aula05.exercicios;

import java.util.Random;

public class Ex03 {

  static int dado(){
    Random aleatorio = new Random();
    return aleatorio.nextInt(1,7);
  }

  static void main() {
    int f1 = 0;
    int f2 = 0;
    int f3 = 0;
    int f4 = 0;
    int f5 = 0;
    int f6 = 0;

    for (int i = 0; i < 1_000_000; i++) {
      int face = dado();
      switch (face){
        case 1->f1++;
        case 2->f2++;
        case 3->f3++;
        case 4->f4++;
        case 5->f5++;
        case 6->f6++;
      }
    }

    float pf1 = f1 / (float) 1_000_000 * 100;
    float pf2 = f2 / (float) 1_000_000 * 100;
    float pf3 = f3 / (float) 1_000_000 * 100;
    float pf4 = f4 / (float) 1_000_000 * 100;
    float pf5 = f5 / (float) 1_000_000 * 100;
    float pf6 = f6 / (float) 1_000_000 * 100;

    IO.println("Face 1 do dado saiu %d x representando %.2f %% do total".formatted(f1,pf1));
    IO.println("Face 2 do dado saiu %d x representando %.2f %% do total".formatted(f2,pf2));
    IO.println("Face 3 do dado saiu %d x representando %.2f %% do total".formatted(f3,pf3));
    IO.println("Face 4 do dado saiu %d x representando %.2f %% do total".formatted(f4,pf4));
    IO.println("Face 5 do dado saiu %d x representando %.2f %% do total".formatted(f5,pf5));
    IO.println("Face 6 do dado saiu %d x representando %.2f %% do total".formatted(f6,pf6));
  }
}

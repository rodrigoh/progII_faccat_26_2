package aula07.avaliacao;

public class QuestaoUm {
  static void main() {
    int x = 12;
    int r = x++;
    int y = x + r++;
    if(r==12)
      x = y++;
    else if(r<12)
      x -=y;
    else
      x-=10;

    IO.println("x=%d, y=%d e r=%d".formatted(x,y,r));
  }
}

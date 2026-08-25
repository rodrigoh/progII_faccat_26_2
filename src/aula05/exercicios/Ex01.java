package aula05.exercicios;

public class Ex01 {

  static double leDouble(String mensagem){
    return Double.parseDouble(IO.readln(mensagem+": "));
  }

  static double calculaDelta(double a, double b, double c){
    return b*b-4*a*c;
  }

  static double calculaX(double a, double b, double d, char opc){
    if(opc=='+')
      return (-b+Math.sqrt(d))/(2*a);
    else
      return (-b-Math.sqrt(d))/(2*a);
  }

//  static double calculaX(double a, double b, double d, char opc){
//    double x;
//    if(opc=='+')
//      x = (-b+Math.sqrt(d))/(2*a);
//    else
//      x = (-b-Math.sqrt(d))/(2*a);
//    return x;
//  }
  static void main() {
    IO.println("Dada a equação ax² + bx + c = 0 informe:");
    double a = leDouble("a");
    double b = leDouble("b");
    double c = leDouble("c");
    double d = calculaDelta(a,b,c);
    if(d>=0){
      double x1 = calculaX(a,b,d,'+');
      double x2 = calculaX(a,b,d,'-');
      IO.println("As raízes da equação são");
      IO.println("x1 = %.2f".formatted(x1));
      IO.println("x2 = %.2f".formatted(x2));
    }
    else{
      IO.println("A equação não possui raízes no conjunto dos reais");
    }
  }
}

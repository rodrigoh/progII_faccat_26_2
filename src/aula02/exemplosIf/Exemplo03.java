package aula02.exemplosIf;

public class Exemplo03 {
  static void main() {
    //Ler um usuário e uma senha do teclado e verificar se é admin com a senha
    //0123456
    String usuarioValido = "admin";
    String senhaValida = "0123456";

    String usuario = IO.readln("Qual seu usuário: ");
    String senha = IO.readln("Qual sua senha: ");

    //if(usuario.equals("admin") && senha.equals("0123456"))
    if(usuario.equals(usuarioValido) && senha.equals(senhaValida))
      IO.println("Bem vindo "+usuario);
    else
      IO.println("Usuário ou senha inválidos");
  }
}

package aula04.exercicios;

/**
 * Usando o comando de seleção condicional simples “IF”, faça um programa que leia uma senha de 8 caracteres inteiros e
 * verifique se a senha informada equivale a senha predefinida no programa. Se for válida informe na tela "Acesso Autorizado.
 * Caso a senha não estiver correta informe "Acesso negado"
 */
public class Ex03 {
    static void main() {
        String senhaPadrao = "01234567";
        String usuarioPadrao = "admin";

        String usuario = IO.readln("Qual seu usuário: ");
        String senha = IO.readln("Qual sua senha: ");

        if(senha.equals(senhaPadrao) && usuario.equals(usuarioPadrao))
            IO.println("Acesso autorizado para o usuário "+usuario);
        else
            IO.println("Usuário ou senha inválidos");
    }
}

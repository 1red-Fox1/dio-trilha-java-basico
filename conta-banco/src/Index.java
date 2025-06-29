import java.util.Scanner;

public class Index {
    public static void main (String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = input.next();
        String mensagem = switch (nome) {
            case "Levi" -> "Nome foda";
            case "Ryan" -> "Meio meeh";
            case "Josivaldo" -> "Nome bosta";
            default -> "Que caralha de nome é esse?";
        };
        System.out.println("E o seu nome é: " + mensagem);
    }
}

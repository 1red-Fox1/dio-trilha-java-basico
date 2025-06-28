import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número da sua conta: ");
        int numero = input.nextInt();
        
        System.out.println("Digite o número da sua agência: ");
        String agencia = input.next();
        
        System.out.println("Digite o seu nome: ");
        String nome = input.next();

        System.out.println("Digite o valor do seu saldo: ");
        double saldo = input.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
                            nome, agencia, numero, saldo);
    }
}

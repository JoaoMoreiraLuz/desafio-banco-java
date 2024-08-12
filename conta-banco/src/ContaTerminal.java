import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //ToDO: conhecer e importar a classe scanner
        //Exibir as mensagens para o nosso usuario
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu primeiro nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu número de conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", e seu saldo " + saldo + " já está disponível para saque!");
    }
}

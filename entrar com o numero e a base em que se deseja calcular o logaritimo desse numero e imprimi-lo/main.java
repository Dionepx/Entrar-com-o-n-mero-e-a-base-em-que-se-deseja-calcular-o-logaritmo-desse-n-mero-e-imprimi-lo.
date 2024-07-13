import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o logaritimando: ");
        int log = sc.nextInt();

        System.out.println("Entre com a base: ");
        int base = sc.nextInt();

        double result = Math.log(log) / Math.log(base);

        System.out.println("Resposta = " + result);
    }
}
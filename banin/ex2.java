import java.util.Scanner;
public class ex2 {
    public static void main (String[] arqs) {
        Scanner Teclado = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite um número para A: ");
        a = Teclado.nextInt();
        System.out.println("Digite um número para B: ");
        b = Teclado.nextInt();
        c = a + b;
        if (a >= 0 && b >= 0) {
            System.out.println("O valor da soma é: " + c);
        } else {
            System.out.println("Dados de entrada são inválidos.");
        }

    }
}
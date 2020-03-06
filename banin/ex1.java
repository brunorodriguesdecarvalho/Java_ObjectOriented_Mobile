import java.util.Scanner;

public class ex1 {
    public static void main (String[] arqs){
        Scanner Teclado = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Digite um número para A: ");
        a = Teclado.nextInt();
        System.out.println("Digite um número para B: ");
        b = Teclado.nextInt();
        System.out.println("O número digitado para A foi: " + a);
        System.out.println("O número digitado para A foi: " + b);
        c = a + b;
        System.out.println("A soma de A com B resulta em: " + c);
    }
}
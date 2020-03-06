import java.util.Scanner;

public class ex3 {
    public static void main (String[] arqs) {
        Scanner Teclado = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite um valor para A:");
        a = Teclado.nextInt();
        System.out.println("Digite um valor para B:");
        b = Teclado.nextInt();
        System.out.println("Valor de A = " + a);
        System.out.println("Valor de B = " + b);
        c = a + b;
        if ( ( a > 0 && b > 0 ) || ( a < 0 && b < 0 ) ) {
            System.out.println("A soma resulta em: " + c);
        } else {
            System.out.println("Os valores não tem o mesmo sinal! Fim do programa.");            
        }
    }
}
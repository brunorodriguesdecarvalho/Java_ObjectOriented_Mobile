import java.util.Scanner;
class Ex6 {
    public static void main (String[] arqs) {
        Integer numIntValor = -1;
        Scanner numIntLer = new Scanner(System.in);

        while (numIntValor != 0) {
            System.out.println("Digite um valor: ");
            numIntValor = numIntLer.nextInt();
            if (numIntValor > 0) {
                System.out.println("O valor digitado foi: "+numIntValor+". É um valor positivo.\n");
            } else if (numIntValor < 0) {
                System.out.println("O valor digitado foi: "+numIntValor+". É um valor negativo.\n");
            } else {
                System.out.println("O valor digitado foi 0, portanto o programa foi encerrado.\n");
            }
        }
    }
}
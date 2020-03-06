import java.util.Scanner;
public class ex4 {
    public static void main (final String[] arqs) {
        float a, b, c;
        System.out.println("\nAtribua os valores do lado de um triângulo para identificar se é possível construir um triângulo com essas medidas.\n");

        // Entrada do usuário com os valores.
        final Scanner Tc = new Scanner(System.in);
        System.out.println("Digite o valor A: ");
        a = Tc.nextInt();
        System.out.println("Digite o valor B: ");
        b = Tc.nextInt();
        System.out.println("Digite o valor C: ");
        c = Tc.nextInt();
        System.out.println("\nValor de A: " + a);
        System.out.println("Valor de B: " + b);
        System.out.println("Valor de C: " + c +"\n");

        // Como descobrir o lado maior
        if ((a > b) && (a > c)) {
            if ((b+c) <= a) {
                System.out.print("Apesar do lado A("+a+") ser o maior, a soma de B("+b+") com C("+c+") resulta em "+(b+c)+", que é menor ou igual a A("+a+"). Portanto, não é possível formar um triângulo.\n");
            } else {
                System.out.println("O maior lado é o A. Os dados inseridos formam um triângulo, pois a soma dos lados menores [B(" +b+ ") + C("+c+")] = [" + (b + c) + "] é maior que o lado maior A (" +a+").\n");
            }
        }
        else if ((b > a) && (b > c)) {
            if ((a+c) <= b) {
                System.out.print("Apesar do lado B("+b+") ser o maior, a soma de A("+a+") com C("+c+") resulta em "+(a+c)+", que é menor ou igual a B("+b+"), sendo impossível formar um triângulo.\n");
            } else {
                System.out.println("O maior lado é o b. Os dados inseridos formam um triângulo, pois a soma dos lados menores [A(" +a+ ") + C("+c+")] = [" + (a + c) + "] é maior que o lado maior B (" +b+").\n");
            }
        } 
        else if ((c > a) && (c > b)) {
            if ((a+b) <= c) {
                System.out.print("Apesar do lado C("+c+") ser o maior, a soma de A("+a+") com B("+b+") resulta em "+(a+b)+", que é menor ou igual a C("+c+"), sendo impossível formar um triângulo.\n");
            } else {
                System.out.println("O maior lado é o C. Os dados inseridos formam um triângulo, pois a soma dos lados menores [A(" +a+ ") + B("+b+")] = [" + (a + b) + "] é maior que o lado maior C (" +c+").\n");
            }
        }
        else {
            System.out.println("Você precisa estudar mais Java. Um dos lados é maior do que o outro.\n");
        }

        // Fim do programa
        System.out.print("\nPrograma encerrado.\n\n");
    }
}
import java.util.Scanner;

public class L1Pgm02 {

  public static void main(String[] args) {
    Scanner leTeclado;
    int a, b, r;
    
    leTeclado = new Scanner(System.in);
    System.out.println("Digite um valor para a: ");
    a = leTeclado.nextInt();
    System.out.println("Digite um valor para b: ");
    b = leTeclado.nextInt();
    if ((a > 0) && (b > 0)) {
      r = a + b;
      System.out.println("Soma de " + a + " com " + b + " = " + r);
    }
    else 
      System.out.println("Dados de entrada sao invalidos");
    leTeclado.close();
  }
  
}
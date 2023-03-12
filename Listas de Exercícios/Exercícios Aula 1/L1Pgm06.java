import java.util.Scanner;

public class L1Pgm06 {

  public static void main(String[] args) {
    Scanner leTeclado;
    int x;
    
    leTeclado = new Scanner(System.in);
    x = 1;
    while (x != 0) {
      System.out.println("Digite um numero");
      x = leTeclado.nextInt();
      if (x > 0)
        System.out.println(x + " = positivo");
      else if (x < 0)
        System.out.println(x + " = negativo");
    }
    leTeclado.close();
  }
}
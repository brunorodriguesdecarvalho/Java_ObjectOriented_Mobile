import java.util.Scanner;

public class L1Pgm05 {

  public static void main(String[] args) {
    Scanner leTeclado;
    String nome;
    double peso;
    String categoria;
    
    leTeclado = new Scanner(System.in);
    System.out.println("Qual o nome do lutador? ");
    nome = leTeclado.nextLine();
    System.out.println("Qual o peso do lutador? ");
    peso = leTeclado.nextDouble();
    if (peso < 65)
      categoria = "Pena";
    else if (peso < 72)
      categoria = "Leve";
    else if (peso < 79)
      categoria = "Ligeiro";
    else if (peso < 86)
      categoria = "Meio Medio";
    else if (peso < 93)
      categoria = "Medio";
    else if (peso < 100)
      categoria = "Meio Pesado";
    else
      categoria = "Pesado";
    System.out.println("O lutador " + nome + " pesa " + peso + " kg e se enquadra na categoria " + categoria);
    leTeclado.close();
  }
  
}

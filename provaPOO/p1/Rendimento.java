import java.util.*;

class Rendimento
{
   public static void main(String args[])
   {
      double valorApp,taxa;
      final int ANO = 12;
      double mes[]= new double [ANO];
      Scanner input = new Scanner(System.in);
      System.out.println("o valor da taxa mensal foi de: ");
      taxa = input.nextDouble();
      System.out.println("o valor inicial investido: ");
      valorApp = input.nextDouble();  
      
      mes[0] = valorApp;
      //criar um vetor que armazena o valor inicial(ok) e looping que altera os valores por 12 meses(ok)  
      for (int i=1; i<ANO;i++)
      {
         mes[i] = mes[i-1] + mes[i-1]*taxa;
         System.out.printf("%do mes: O valor retornado: %.2f\n",(i+1),mes[i]);
      }
      System.out.printf("Investimento inicial: %.2f\n",mes[0]);
        
   }
}
import java.util.Scanner;

class Seq
{
   public static void main(String args[])
   {
      Scanner entrada = new Scanner(System.in);
      
      //ATRIBUIR VALORES PARAMETROS X E Y
      System.out.printf("Inicio do programa em Java que calcula a sequencia de pares\n");
      System.out.printf("o valor de x: ");
      int x = entrada.nextInt();
      System.out.printf("o valor de y: ");
      int y = entrada.nextInt();      
      
      //DETERMINAR O QUADRANTE
      if (x==0 && y==0)
         System.out.printf("Origem\n");
      else 
         if (x<0 && y>0)
            System.out.printf("Primeiro quadrante\n");
         else if(x>0 && y>0)
            System.out.println("Segundo quadrante\n");
         else
            if(x<0 && y<0)
               System.out.println("Terceiro quadrante\n");
            else
               System.out.println("Quarto quadrante");
            
            
      System.out.printf("fim do programa"); 
   }
}
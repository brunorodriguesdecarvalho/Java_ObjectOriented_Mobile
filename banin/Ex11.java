import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Ex11 {
    public static void main(String[] arqs) {
        Scanner tcl = new Scanner(System.in); 
        int qtd = -1;
        Random aleatorio = new Random();
        ArrayList<Double> vetor = new ArrayList<Double>();
        
        //Input da quantidade de elementos aleatórios que serão gerados
        while (qtd > 50 || qtd <= 0) {
            System.out.println("\nDigite um número entre 1 e 50:");
            qtd = tcl.nextInt();
            if (qtd > 50 || qtd < 0) {
                System.out.print("Valor digitado fora dos limites. Tente novamente.\n");
            }
            else {System.out.print("Valor digitado: "+qtd+".\n\n");}
        }

        //Geração de valores aleatórios, com base no input do usuário
        for (int i=0; i<qtd; i++) {
            double a = Math.floor((aleatorio.nextDouble()) * 100);
            vetor.add(a);
        }
        Collections.sort(vetor);
        System.out.println("Valores aleatórios gerados:"+vetor+".\n");

        //Busca do número perfeito:
        System.out.println("Busque por um número no vetor: ");
        double b = tcl.nextDouble();
        if (vetor.contains(b)) {System.out.println("O valor "+b+" ESTÁ condido no Vetor.");} 
        else {System.out.println("O valor "+b+" NÃO está condido no Vetor.");}
    }
}

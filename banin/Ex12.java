import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Ex12 {
    public static void main(String[] arqs) {
        Scanner tcl = new Scanner(System.in);
        double digitado = -1;
        ArrayList<Double> vetor = new ArrayList<Double>();
        Random aleatorio = new Random();
        double b = - 1;
        
        while (digitado <= 0 || digitado > 50) {
            System.out.println("Digite um número entre 0 e 50"); 
            digitado = tcl.nextDouble();
            if (digitado <= 0 || digitado > 50) {
                System.out.println(digitado+" fora dos limites de 0 e 50.");
            }
        }

        for (double i=0; i<digitado; i++) {
            Double a = Math.floor(aleatorio.nextDouble()*100);
            vetor.add(a);
        }
        Collections.sort(vetor);
        System.out.println("O vetor: "+vetor+".");

        //Existe no vetor:
        do {
            System.out.println("Digite um valor para buscar no vetor (se quiser encerrar, digite 0): ");
            b = tcl.nextDouble();
            if (vetor.contains(b)){System.out.println("Vetor CONTÉM o valor "+b+".");}
            else {System.out.println("Vetor NÃO contém o valor "+b+".");}
        } while (b != 0);
        
    }
}
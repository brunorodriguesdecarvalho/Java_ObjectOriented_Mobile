import java.util.Scanner;
import java.util.ArrayList;
public class Ex10{
    public static void main(String[] arqs){
        Scanner tcl = new Scanner(System.in);
        float N = 0;
        ArrayList<Float> A = new ArrayList<Float>();
        ArrayList<Float> NEG = new ArrayList<Float>();
        ArrayList<Float> POS = new ArrayList<Float>();
        System.out.println("Digite um valor para N(qtd de elementos): ");
        N = tcl.nextInt();
        float digitado = 0;
        for (int i=1; N>=i ; i++){
            System.out.println("Digite um valor para incluir em N: ");
            digitado = tcl.nextInt();
            A.add(digitado);
            if (digitado<0) {NEG.add(digitado);}
            else if (digitado>=0) {POS.add(digitado);}
            else {System.out.println("Tem algo errado! Estude mais JAVA!!!");}
        }
        System.out.println("\nO que foi digitado: "+A+".");
        System.out.println("O que foi incluído no Vetor POS: "+POS+".");
        System.out.println("Quantidade de elementos negativos: "+POS.size()+".");
        System.out.println("O que foi incluído no Vetor NEG: "+NEG+".");
        System.out.println("Quantidade de elementos negativos: "+NEG.size()+".\n");
    }
}
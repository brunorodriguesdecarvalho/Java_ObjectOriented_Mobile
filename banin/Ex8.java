import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ex8 {
    public static void main(String[] arqs){
        //ler dois números chamados de min e max
        int min, max, minx, maxx;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite um valor mínimo: ");
        min = tcl.nextInt();
        System.out.println("Digite um valor máximo: ");
        max = tcl.nextInt();
        minx = 0;
        maxx = 0;

        if (min > max) {minx = max; maxx=min;} else {minx = min; maxx = max;}

        System.out.println("Max: "+maxx+". Mín: "+minx+".\n");

        //iniciar um laço 
        ArrayList<Integer> bd = new ArrayList<Integer>();
        int x = 1;
        int soma = 0;
        while (x != 0){
            System.out.println("\nDigite um valor para X: ");
            x = tcl.nextInt();
            if ((x >= minx) && (x <= maxx)) {
                bd.add(x);
                System.out.println("Adicionado o valor "+x+" ao bd");
                soma += x;
            } else {
                System.out.println("Valor "+x+" fora do intervalo ["+minx+":"+maxx+"]. Valor ignorado.");
            }
        }
        Collections.sort(bd);
        System.out.println("\nO que foi digitado: "+bd+".\n");
        System.out.println("Total de itens digitados: "+bd.size()+".\n");
        System.out.println("Soma dos valor digitados: "+soma+".\n");
    }
}
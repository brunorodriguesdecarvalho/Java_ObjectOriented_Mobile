import java.util.*;

public class Cartesiano {
    public static void main (String args []){

        int n, x,y;
        String s,r = null;

        Scanner q = new Scanner(System.in);
        Scanner pares = new Scanner (System.in);

        System.out.println("Insira a quantidade de pares a serem lidos: ");
        n = q.nextInt();

        double arrayPares[][] = new double [n][2];
        Scanner par = new Scanner (System.in);

        for (int i=0;i<n;i++){
            for (int j=0;j<2;j++) {
                if (j==0)
                    s = "x";
                else
                    s = "y";
                System.out.printf("Insira %s%d: ",s, i + 1);
                arrayPares[i][j] = par.nextDouble();
            }
        }
        for (int i=0;i<n;i++){
            if (arrayPares[i][0]==0 && arrayPares[i][1]==0)
                r = "Origem";
            if (arrayPares[i][0]==0 && arrayPares[i][1]!=0)
                r = "Eixo X";
            if (arrayPares[i][0]!=0 && arrayPares[i][1]==0)
                r = "Eixo Y";
            if (arrayPares[i][0]>0 && arrayPares[i][1]>0)
                r = "Q1";
            if (arrayPares[i][0]<0 && arrayPares[i][1]>0)
                r = "Q2";
            if (arrayPares[i][0]<0 && arrayPares[i][1]<0)
                r = "Q3";
            if (arrayPares[i][0]>0 && arrayPares[i][1]<0)
                r = "Q4";
            System.out.printf("\nCoordenada %d: (%.2f, %.2f) - %s",i+1,(arrayPares[i][0]), (arrayPares[i][1]), r);
        }
    }
}
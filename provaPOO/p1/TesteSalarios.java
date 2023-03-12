import java.util.Scanner;
public class TesteSalarios {
    public static void main(String[] args) {
        int n = 15, abaixo=0, acima=0, namedia=0;
        double total = 0, media;

        double v[] = new double [n];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.printf("Insira o salário do %do funcionário: R$ ", i + 1);
            v[i] = s.nextDouble();
        }
        for (int j=0;j<n;j++){
            total += v[j];
        }

        media = total/n;

        for (int k=0;k<n;k++) {
            if (v[k] > media) {
                acima += 1;
            }
            if (v[k] < media) {
                abaixo += 1;
            }
            if (v[k]==media) {
                namedia += 1;
            }
        }

        System.out.printf("\nMédia = R$ %.2f\n%02d trabalhadores acima da média salarial\n%02d trabalhadores na média salarial\n%02d trabalhadores abaixo da média salarial", media,acima,namedia,abaixo);
    }
}
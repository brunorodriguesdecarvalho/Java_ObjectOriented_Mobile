import java.util.Scanner;
public class Calcdiv {
    public static void main(String[] args) {

        float prestacao=0;
        //Habilitar leitura de dados
        Scanner entrada_dados = new Scanner(System.in);

        //Mensagem ao usuário para avisar início do programa
        System.out.println("\nBem vindo ao programa Java para cálculo de dívidas.\n");

        //Solicita valor da dívida ao usuário
        System.out.println("Por favor digite o valor atual da dívida:");

        //Guarda informação na variável
        float divida_atual = entrada_dados.nextFloat();

        //Solicita valor fixo da taxa de juros
        System.out.println("Por favor digite o valor fixo da taxa de juros (ex: digitar 5 para taxa igual a 5%):");

        //Guarda informação na variável
        float juros = entrada_dados.nextFloat();

        //Solicita valor da quantidade de prestações
        System.out.println("Por favor digite a quantidade de prestações para quitação:");

        //Guarda informação na variável
        int parcelas = entrada_dados.nextInt();

        float total = divida_atual;
        float restante = total - prestacao;
        int mes = 0;

        for (int i=parcelas;i>=0;i--){
            if (mes==0){
                total = divida_atual;
                prestacao = 0;
                restante = divida_atual;
            } else {
                total = restante * (1 + (juros / 100));
                prestacao = total / (i+1);
                restante = total - prestacao;
            }
            System.out.printf("Mês: %02d / Dívida total: %.2f / Prestação: %.2f / Dívida restante: %.2f\n", mes, total ,prestacao, restante);
            mes += 1;
        }
    }
    }
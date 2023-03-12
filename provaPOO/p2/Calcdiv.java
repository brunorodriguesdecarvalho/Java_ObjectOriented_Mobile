import java.util.Scanner;
public class Calcdiv {
    public static void main( String args[] ) {
        //Habilitar leitura de dados
        Scanner entrada_dados = new Scanner( System.in );

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

        //Apresenta valor total a ser pago
        System.out.printf("\nO valor total a ser pago: %.2f\n",divida_atual*(1+(juros/100)));

        //Apresenta o valor da cada prestação
        System.out.printf("O valor de cada parcela: %.2f, a ser pago em %d prestações fixas.\n",(divida_atual*(1+(juros/100)))/parcelas, parcelas);

        //Avisa usuário sobre o final do programa
        System.out.printf("\nFim do programa!");
    ] 
}
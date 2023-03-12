import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        //Habilitar leitura de dados
        Scanner entrada_dados = new Scanner( System.in );

        //Mensagem ao usuário para avisar início do programa
        System.out.println("\nBem vindo ao programa Java para cálculo Fibonacci.\n");

        //Solicita posição do termo na escala Fibonacci
        System.out.println("Por favor digite o valor do termpo da escala de Fibonacci (aceita apenas números inteiros positivos!):");

        //Guarda valor da posição do termo
        int termo = entrada_dados.nextInt();

        //Verifica se entrada do usuário é maior que zero e menor que 46 (limite Inteiro)
        if (termo>0 && termo <46) {
            
            //Corrige a posição do termo para Array
            termo++;

            //Declara o vetor com a quantidade de termos informada
            int escala[] = new int[termo];

            //Definição de valores iniciais da escala e apresentação na tela
            escala[0] = 0;
            escala[1] = 1;

            //Se quiser ver cada um dos termos, remover o comentário das próximas duas linha
            //System.out.printf("Valor do termo 0: 0\n");
            //System.out.printf("Valor do termo 1: 1\n");

            //Continuação do preenchimento do vetor com os valores da escala Fibonacci até o número do termo informado
            for (int i = 2; i< escala.length; i++) {

                //Definição da escala de Fibonacci                
                escala[i] = escala[i-1] + escala[i-2];

                //Se quiser ver cada um dos termos, remover o comentário da próxima linha
                //System.out.printf("Valor do termo %d: %d\n", i, escala[i]);
            }

            //Exibe a posição (termo) na escala Fibonacci e o valor correspondente
            int i = termo-1;
            System.out.printf("\nValor do termo %d: %d\n", i, escala[i]);

        } else {
            System.out.println("\nO valor do termo não é positivo ou menor que 46.\n");   
        }

        //Avisa usuário sobre o final do programa
        System.out.printf("\nFim do programa!");
    }
}
import java.util.Scanner; //para o teclado ler
import java.util.ArrayList; //para criar o ArrayList: um vetor auto-ajustável.
import java.util.Collections; //para ordenar a ArrayList;
public class Ex7 {
    public static void main(String[] arqs) {

    // Permita digitar enquanto não for digitado zero:
        // 1) Define o tipo e o nome das variáveis e já cria o objeto:
        ArrayList<Integer> bancodedados = new ArrayList<Integer>();
        // 2) Define e cria o leitor:
        Scanner teclado = new Scanner(System.in);
        // 3) Inicializa a variável que grava o valor do teclado:
        int lido = 1;
        // 4) Inicia o laço de repetição para sair apenas quando digitar zero
        do {
            // 4.1) Pede para o usuário digitar algo:
            System.out.println("\nDigite um número:");
            // 4.2) Guarda na variável lido o próximo valor inteiro que for digitado 
            lido = teclado.nextInt();
            // 4.3) Guarda na ArrayList o que foi digitado, se for maior que 0:
            if (lido > 0) {bancodedados.add(lido);}  
        } while(lido > 0);
        // 5) Indica para o usuário que o programa acabou:
        // 5.1) Finalizar 
        System.out.println("\nFinal do programa (digitou ZERO ou um valor negativo para sair).\n");
        // 5.2) Ordena os valores do menor para o maior:
        Collections.sort(bancodedados);
        // 5.3) Exibe o que foi coletado e ordenado;
        System.out.println("O que foi coletado :"+bancodedados);
        // 5.3) Exibir o maior valor e o menor valor:
        System.out.println("O MAIOR valor entre os elementos da ArrayList: " +bancodedados.get(bancodedados.size()-1));
        System.out.println("O MENOR valor entre os elementos da ArrayList: " +bancodedados.get(0));
        // 5.4) Exibir a quantidade, a soma e a média dos valores>:
        System.out.println("A quantidade de elementos dentro da ArrayList: " +bancodedados.size());
        // 5.4.1) Para somar os valores, criar um for:
        int soma = 0;
        for (int i=0; bancodedados.size() > i; i++) {
            soma += bancodedados.get(i);
        }
        System.out.println("A soma dos valores é: "+soma);
        System.out.println("A média dos valores é: "+(soma/(bancodedados.size())+".\n"));
    }
}
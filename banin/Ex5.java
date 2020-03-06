import java.util.Scanner;

public class Ex5 {
    public static void main(final String[] arqs) {
        Scanner Tcl = new Scanner(System.in);
        String nome;
        String categoria;
        Float peso;
        
        System.out.print("Digite um nome: ");
        nome = Tcl.nextLine();
        System.out.print("Digite um peso (apenas valores numéricos, por favor): ");
        peso = Tcl.nextFloat();

        if (peso < 65 ) { 
            categoria = "Pena";
        } else if (peso < 72 ) {
            categoria = "Leve";
        } else if (peso < 79 ) {
            categoria = "Ligeiro";
        } else if (peso < 86 ) {
            categoria = "Meio médio";
        } else if (peso < 93 ) {
            categoria = "Médio";
        } else if (peso < 100 ) {
            categoria = "Meio pesado";
        }else if (peso >= 100 ) {
            categoria = "Pesado";
        }else {
            System.out.print("Erro!!!");
            categoria = "Erro";
        }
        System.out.print("\nO lutador "+ nome + " pesa " + peso + " kilogramas e se enquadra na categoria " + categoria+".\n");
    }
}
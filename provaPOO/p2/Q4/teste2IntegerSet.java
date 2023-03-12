public class teste2IntegerSet {
    public static void main(String args[]) {
        int a[] = {0,3,4};
        int b[] = {1,3,100};
        IntegerSet A = new IntegerSet (a);
        IntegerSet B = new IntegerSet (b);
        System.out.println("\n\nConjunto A:\n");
        A.itens();
        System.out.println("\n\nConjunto B:\n");
        B.itens();
        System.out.println("\n\nConjunto C: União dos Conjuntos A e B\n");
    }
}

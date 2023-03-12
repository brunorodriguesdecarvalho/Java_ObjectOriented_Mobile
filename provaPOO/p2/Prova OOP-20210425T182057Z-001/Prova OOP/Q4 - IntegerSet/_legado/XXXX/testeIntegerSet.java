import java.util.*;

public class testeIntegerSet {
    public static void main(String args[]) {
        int a[] = {1,2,3};
        int b[] = {4,5,6};
        int c[] = new int[100];
        IntegerSet A = new IntegerSet (a);
        IntegerSet B = new IntegerSet (b);
        IntegerSet C = new IntegerSet (c);
//        A.itens();
//        A.insertElement(4);
//        A.itens();
//        A.deleteElement(3);
//        A.itens();

        C = A.union(B);
        C.itens();
    }
}

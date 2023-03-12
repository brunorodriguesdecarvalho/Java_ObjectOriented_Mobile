import java.util.*;

public class testeIntegerSet {
    public static void main(String args[]) {
        int b[] = {1,2,3};
        int c[] = {4,5,6};
        IntegerSet A = new IntegerSet (b);
        IntegerSet B = new IntegerSet (c);
        A.itens();
        A.insertElement(4);
        A.itens();
        A.deleteElement(3);
        A.itens();
        //C = A.union(B)
    }
}

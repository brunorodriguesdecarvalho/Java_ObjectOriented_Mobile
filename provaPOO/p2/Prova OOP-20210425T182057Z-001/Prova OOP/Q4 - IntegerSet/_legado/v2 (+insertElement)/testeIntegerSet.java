import java.util.*;

public class testeIntegerSet {
    public static void main(String args[]) {
        int b[] = {1,2,3};
        IntegerSet A = new IntegerSet (b);
        A.itens();
        A.insertElement(4);
        A.itens();
    }
}

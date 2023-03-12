public class IntegerSet {
    private int n, i, x;
    private final int min = 0;
    private final int max = 101;
    private int [] A = new int[max];
    private boolean [] B = new boolean[max];


    public IntegerSet(int A[]){
        convertVetor(A);
    }

    public boolean[] convertVetor(int A[]){
        for (i=0;i<A.length;i++){
            if ((A[i]>=min)&&(A[i]<max)){
                n = A[i];
                B[n] = true;
            }
        }
        return B;
    }

    public boolean[] inserirBool(boolean B[], int a){
        if ((a>=min)&&(a<max)){
            if (B[a]==false);
//                A[] = new int [a];
                B[a] = true;
        }
        return B;
    }

    public int [] inserirInteiro(int A[], int a){
        if ((a>=min)&&(a<max)){
            if (B[a] == true);
                A = new int [a];
        }
        return A;
    }

//    public void checkVetor(int A[], boolean B[]){
//        for (i=0;i<B.length;i++){
//            if (B[i]== true)
//                A[i] = i;
//        }
//    }

    public void itens(){
        for (i=min;i<B.length;i++){
            System.out.printf("%03d: %b\n",i, B[i]);
        }
    }

    public void insertElement(int a){
        inserirInteiro (A,a);
        inserirBool(B, a);
        }
}


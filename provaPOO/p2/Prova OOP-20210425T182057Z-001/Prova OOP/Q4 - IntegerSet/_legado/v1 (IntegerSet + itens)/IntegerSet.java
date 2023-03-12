public class IntegerSet {
    private int n, i, x;
    private final int min = 0;
    private final int max = 101;
    private int [] A = new int[max];
    private boolean [] B = new boolean[max];


    public IntegerSet(int A[]){
        lerVetor(A);
    }

    public boolean[] lerVetor(int A[]){
        for (i=0;i<A.length;i++){
            if ((A[i]>=min)&&(A[i]<max)){
                n = A[i];
                B[n] = true;
            }
        }
        return B;
    }

//    public void exibirV(B[]){
//        for (i=min;i<=max;i++){
//            System.out.printf("%d", B[i]);
//        }
//    }


    public void itens(){
        for (i=min;i<B.length;i++){
            System.out.printf("%d: %b; ",i, B[i]);
        }
    }

}

public class IntegerSet {
    private int n, i, x;
    private final int min = 0;
    private final int max = 101;
    private int [] A = new int[max];
    private boolean [] B = new boolean[max];
    private String [] S = new String[max];
    private IntegerSet I;

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

    public boolean [] removerBool(boolean B[], int a){
        if (B[a]==true){
            B[a] = false;
        }
        return B;
    }

    public int [] removerInteiro(int A[], int a){
        if (B[a] == true)
            for (i=0;i<A.length;i++){
                if (A[i]==a)
                    A[i]= Integer.parseInt(null); //verificar com a professora
        }
        return A;
    }

    public boolean[] inserirVetBool(IntegerSet X) {
        for (i=0;i<B.length;i++){
            if (B[i]==false)
                B[i]=true;
        }
        return B;
    }

    public int [] inserirVetInt(IntegerSet X) {
        for (i=0;i<B.length;i++){
            if (B[i]==true){
                A = new int [i];
            }
        }
        return A;
    }

    public void itens(){
        for (i=min;i<B.length;i++){
            System.out.printf("%03d: %b\n",i, B[i]);
        }
    }

    public void insertElement(int a){
        inserirInteiro (A,a);
        inserirBool(B, a);
        }

    public void deleteElement(int a){
        removerInteiro(A,a);
        removerBool(B,a);
    }

    public IntegerSet union(IntegerSet X) {
        inserirVetInt(X);
        inserirVetBool(X);
        return X;
    }

}


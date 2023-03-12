public class IntegerSet {
    private int n, i, x;
    private final int min = 0;
    private final int max = 101;
    private int [] A = new int[max];
    private boolean [] B = new boolean[max];
    private String [] S = new String[max];

    public IntegerSet(int A[]){
        convertVetor(A);
    }

    private IntegerSet(boolean B[]){
        this.B = B;
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

    public IntegerSet union (IntegerSet X){
        boolean O[] = new boolean [max];
        for (int i=0;i<max;i++){
            O[i] = this.B[i] || X.B[i];
        }
        return new IntegerSet(O);
    }

    public IntegerSet intersection (IntegerSet X){
        boolean O [] = new boolean[max];
        for (i=0;i<max;i++){
            O[i] = this.B[i] && X.B[i];
        }
        return new IntegerSet(O);
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



}


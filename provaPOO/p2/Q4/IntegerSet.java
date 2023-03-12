public class IntegerSet {
    private int i;
    private final int min = 0;
    private final int max = 101;
    private int [] A = new int[max];
    private boolean [] Bool = new boolean[max];


    public IntegerSet(int A[]){
        convertVetor(A);
    }

    public boolean[] convertVetor(int A[]){
        for (i=0;i<A.length;i++){
            if ((A[i]>=min)&&(A[i]<max)){
                Bool[A[i]] = true;
            }
        }
        return Bool;
    }

    public boolean[] inserirBool(boolean B[], int a){
        if ((a>=min)&&(a<max)){
            if (Bool[a]==false);
                Bool[a] = true;
        }
        return Bool;
    }

    public int [] inserirInteiro(int A[], int a){
        if ((a>=min)&&(a<max)){
            if (Bool[a] == true);
                A = new int [a];
        }
        return A;
    }

    public void itens(){
        for (i=min;i<Bool.length;i++){
            System.out.printf("%03d: %b\n",i, Bool[i]);
        }
    }

    public void insertElement(int a){
        inserirInteiro (A,a);
        inserirBool(Bool, a);
        }
    
    public boolean[] removerBool(boolean Bool[], int a){
        if ((a>=min)&&(a<max)){
            if (Bool[a]==true);
                Bool[a]=false;
        }
        return Bool;
    }

    public void deleteElement(int a){
        removerBool(Bool, a);
        }

}


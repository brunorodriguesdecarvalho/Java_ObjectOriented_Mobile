public class TesteFuncionario {
    public static void main (String args[]){
        Programador p;
        Instrutor i;

        p = new Programador ("José", "jose@gmail.com", "Python");
        p.exibeDados();

        i = new Instrutor("Pedro", "pedro@gmail.com", "Java");
        i.exibeDados();
    }
}
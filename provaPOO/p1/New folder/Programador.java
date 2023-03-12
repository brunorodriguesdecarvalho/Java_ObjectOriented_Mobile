public class Programador extends Funcionario{
    private String linguagem;
    private double salario=5000;

    public Programador (String nome, String mail, String linguagem){
        super (nome, mail);
        setLinguagem(linguagem);
    }
    public double pagamento(){
        return salario;
    }

    public void setLinguagem(String ling){
        this.linguagem = ling;
    }
    public String getLinguagem(){
        return linguagem;
    }

    public <salario> void setSalario(double salario){
        this.salario = salario;
    }

    public void exibeDados(){
        System.out.println("\nInformações do Programador:");
        super.exibeDados();
        System.out.printf("Linguagem: %s\nSalário: R$ %.2f\n", linguagem, salario);
    }
}
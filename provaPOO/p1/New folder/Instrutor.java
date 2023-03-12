public class Instrutor extends Funcionario{
    private String disciplina;
    private int horasMensais=100;
    private double valorHoraAula=10;

    public Instrutor (String nome, String mail, String disciplina){
        super (nome, mail);
        setDisciplina (disciplina);
    }

    public void setDisciplina(String disc){
        this.disciplina = disc;
    }
    public String getDisciplina(){
        return disciplina;
    }

    public void setHorasMensais(int horas) {
        horasMensais = horas;
    }
    public void setValorHoraAula(double vlr){
        valorHoraAula = vlr;
    }

    public double pagamento(){
        return horasMensais*valorHoraAula;
    }

    public void exibeDados(){
        System.out.println("\nInformações do Instrutor:");
        super.exibeDados();
        System.out.printf("Disciplina: %s\nHoras Trabalhadas: %d\nValor/Hora: R$ %.2f\nPagamento: R$ %.2f\n", disciplina, horasMensais, valorHoraAula, pagamento());
    }

}
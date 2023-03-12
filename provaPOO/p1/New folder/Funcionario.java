public abstract class Funcionario {
    protected String nome, mail;
    public Funcionario (String nome, String mail){
        setNome(nome);
        setMail(mail);
    }
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return nome;
    }
    public void setMail(String m){
        this.mail = m;
    }
    public String getMail(){
        return mail;
    }

    public abstract double pagamento();

    public void exibeDados(){
        System.out.println("Nome: "+nome);
        System.out.println("E-mail: "+mail);
    }
}
package develhope.exercise2;

public class User {

    public String nome;

    public String provincia;

    public String saluto;

    public User(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = returnSaluto(nome, provincia);
    }

    public String returnSaluto(String nome, String provincia){
        return "Ciao " +nome +", com'è il tempo in " +provincia +"?";
    }
}

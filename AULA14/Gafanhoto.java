public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    

    public Gafanhoto(String nome, int idade, String sexo, float experiencia, String login, int totAssistido) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = 0;
    }
    //Getters e Setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Garfanhoto [" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + "]";
    }

    

    
}

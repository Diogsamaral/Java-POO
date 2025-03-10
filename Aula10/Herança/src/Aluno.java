//Usar a palavra extends em uma classe é a representação de herança
public class Aluno extends Pessoa {
    private int matr;
    private String curso;

    //Metodos
    public void cancelarMatr(){
        System.out.println("Matricula será cancelada!");
    }


    //Getters e setters
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

   

    
}

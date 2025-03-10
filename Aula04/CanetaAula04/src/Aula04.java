public class Aula04 {
    public static void main(String[] args) {
        CanetaAula04 c1 = new CanetaAula04("MONT BLANC", "Preta", 0.5f);
        //Ambos os metodos são usados, porem o atributo ponta é protegido
        //c1.setModelo("BIC");   
        //c1.setPonta(0.5f);    
        c1.status();
    }
}
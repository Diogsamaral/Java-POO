public class Aula03 {
    public static void main(String[] args) {
        //Instaciando Caneta
        CanetaAula03 c1 = new CanetaAula03();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        //nao é possivel alterar o atributo ponta pois esta privado
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampar();
        c1.status();
        
    }
    
}

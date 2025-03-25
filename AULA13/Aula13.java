public class Aula13 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.reagir("vai apanhar");
        c.reagir(11, 45);
        //é o dono
        c.reagir(true);
        //é o dono
        c.reagir(false);
        c.reagir(6, 12.5f);
    }

}

public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        //Utilizandos os controles da interface
        c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}

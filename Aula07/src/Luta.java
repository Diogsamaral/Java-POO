import java.util.Random;

public class Luta {
    private Lutador desafiando;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    //Metodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);  
            this.setDesafiando(l1); 
            this.setDesafiado(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiando(null);
            this.setDesafiado(null);
        }

    }

    public void lutar(){
        if(this.isAprovada()){
            System.out.println("####DESAFIANDO###");
            this.getDesafiando().apresentar();
            System.out.println("###DESAFIADO###");
            this.getDesafiado().apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiando.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                
                case 1: //Vitoria desafiando
                    System.out.println("Vitória do " + this.desafiando.getNome());
                    this.desafiando.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
 
                case 2: //Vitoria desafiado
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiando.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
            
                default:
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }


    //Getters e Setters
    public Lutador getDesafiando() {
        return desafiando;
    }

    public void setDesafiando(Lutador desafiando) {
        this.desafiando = desafiando;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

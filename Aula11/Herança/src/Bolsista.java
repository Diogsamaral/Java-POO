public class Bolsista extends Aluno {
    private float bolsa;

    public void RonovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override
    public void PgMensal(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    
}

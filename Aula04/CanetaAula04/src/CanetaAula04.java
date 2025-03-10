public class CanetaAula04 {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    //Esse metodo é o construtor
    //Coloquei 3 parametros: modelo, cor e ponta
    //Esses paramentos são passado na hora de construir o objeto
    public CanetaAula04(String m, String c, float p){
        this.tampar();
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Cor:" + this.cor);
        System.out.println("Tampada:" + this.tampada);
    }

    public String getModelo(){
        return this.modelo;
    }

    public float getPonta(){
        return this.ponta;
    }

    public String getCor(){
        return this.cor;
    }

    public boolean isTampada(){
        return tampada;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void setCor(String c){
        this.cor = c;
    }

    public void setTampada(boolean tampada){
        this.tampada = tampada;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}

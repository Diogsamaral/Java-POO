public class Caneta {
    public String modelo;
    private float ponta;
    
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Ponta:" + this.ponta);
    }

    public String getModelo(){
        return this.modelo;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public void setPonta(float p){
        this.ponta = p;
    }
}

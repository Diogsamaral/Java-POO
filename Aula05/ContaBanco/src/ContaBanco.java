//EXEMPLO PRATICO COM OBJETOS

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("----------------");
        System.out.println("Conta:" + this.getNumConta());
        System.out.println("Tipo:" + this.getTipo());
        System.out.println("Dono:" + this.getDono());
        System.out.println("Saldo:" + this.getSaldo());
        System.out.println("Status:" + this.isStatus());
    }

    //Construtor 
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    //Metodos Personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.setSaldo(50);;
        } else if(t == "CP") {
            this.setSaldo(150);;
        }
        System.out.println("Conta Aberta com sucesso!");
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro!");
        } else if(this.getSaldo() < 0) {
            System.out.println("Conta em debito!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    } 

    public void depositar(float v){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta " + this.getDono());
        } else {
            System.out.println("Impossível depositar, conta fechada!");
        }
    }

    public void sacar(float v){
        if(this.isStatus()){
            if(this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta " + getDono());
            } else {
                System.out.println("Saldo insulficiente!");
            }
        } else {
            System.out.println("Impossível sacar, conta fechada!");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        } else if(this.getTipo() == "CP") {
            v = 20; 
        }
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar, conta fechada!");
        }

    }

    //Metodos Especiais
    //Getters
    public int getNumConta(){
        return this.numConta;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getDono(){
        return this.dono;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public boolean isStatus(){
        return this.status;
    }

    //Setters
    public void setNumConta(int n){
        this.numConta = n;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

}

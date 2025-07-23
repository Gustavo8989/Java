
public class Main{
    public static void main(String[] args){
        Carro meu_carro = new Carro("Fusca");
        System.out.println(meu_carro);
    }
}

class Carro {
    String modelo;
    public Carro(String modelo){
        this.modelo = modelo;
    }
    private void acelerar(){
        System.out.println("Acelerando o carro\n" + "Modelo do carro:" + this.modelo);
    }
    public void teste_private(){
        Carro meu_carro = new Carro("Ford Ka");
        meu_carro.acelerar();
    }
}
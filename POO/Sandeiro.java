public class Sandeiro implements Carro {
    final int limite_velocidade = 150;
    public int velocidade_atual = 0;
    @Override
    public void acelerar(){
        this.velocidade_atual += 10;
        System.out.println("Acelerando");
        System.out.println("Velocidade atual: " + this.velocidade_atual);
    }
    @Override
    public void frear(){
        System.out.println("Freando");
    }
    @Override
    public void parar(){
        System.out.println("Parando");
    }
}

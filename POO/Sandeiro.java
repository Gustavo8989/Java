public class Sandeiro implements Carro {
    @Override
    public void acelerar(){
        System.out.println("Acelerando");
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

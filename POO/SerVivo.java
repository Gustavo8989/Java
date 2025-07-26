public abstract class SerVivo {
    protected int idade;
    public SerVivo(int idade){
        this.idade = idade;
    }
    public abstract void respirar();
    public void dormindo(){
        System.out.println("Dormindo!!! ");
    }
}

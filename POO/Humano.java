public class Humano extends SerVivo {
    public Humano(){
        super(19);
    }
    @Override
    public void respirar(){
        System.out.println(this.idade);
        System.out.println("Respirando"); 
    }
}

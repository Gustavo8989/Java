import java.util.Scanner; 

public class Main {

    String welconMessage = "Olá mundo"; // Variavel global 
    
    public static void main(String[] args){
        // Teste comentario 
        var Scanner scanner = new Scanner(System.in); 
        System.out.println("Informe seu nome: ");
        var String name = scanner.next();
        System.out.println("Informe sua idade: ");
        var int age = scanner.nextInt();
        System.out.println("Olá " + name + " Sua idade é " + age);
        System.out.printf("Olá %s sua idade é %s \n", name,age);
        
    }
}

import java.util.Scanner;

public class ItemMenu{
    private String name_cliente;
    private int cep;

    public ItemMenu(String name_cliente, int cep){
        this.name_cliente = name_cliente;
        this.cep = cep;
    }

    public void Prato(){
        String x_tudo = "X-Tudo";
        String x_salada = "X-Salada";
        String hotdog = "Hot-Dog";
        String pastal = "Pastel";
        System.out.println("Digite qual Prato você quer: ");
        System.out.println("X-Tudo\nX-Salada\nHot-Dog\nPastel ");
    }

    public void bebidas(){
        System.out.println("Digite qual bebida você quer: ");
        System.out.println("Cerveja\nRefrigerante\nSuco\nChá ");
    }

}
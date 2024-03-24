public class Cappuccino extends Bebida {
    
    @Override
    void prepararBebida() {
        System.out.println("Preparando o cappuccino");
    }
    
    @Override
    void adicionarCondimentos() {
        System.out.println("Adicionando canela");
    }
}
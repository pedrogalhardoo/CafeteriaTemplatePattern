public class Cafe extends Bebida {
    
    @Override
    void prepararBebida() {
        System.out.println("Preparando o café");
    }
    
    @Override
    void adicionarCondimentos() {
        System.out.println("Adicionando açúcar e leite");
    }
}
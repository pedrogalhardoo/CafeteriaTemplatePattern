public class Cha extends Bebida {
    
    @Override
    void prepararBebida() {
        System.out.println("Preparando o chá");
    }
    
    @Override
    void adicionarCondimentos() {
        System.out.println("Adicionando limão");
    }
}
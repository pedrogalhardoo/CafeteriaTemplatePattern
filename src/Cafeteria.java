public class Cafeteria {
    
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        Bebida cappuccino = new Cappuccino();
        Bebida cha = new Cha();
        
        System.out.println("Preparando café:");
        cafe.prepararReceita();
        
        System.out.println("\nPreparando cappuccino:");
        cappuccino.prepararReceita();
        
        System.out.println("\nPreparando chá:");
        cha.prepararReceita();
    }
}

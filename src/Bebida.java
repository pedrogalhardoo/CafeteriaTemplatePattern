public abstract class Bebida {
    
    // Método template final que define a sequência de preparação da bebida
    public final void prepararReceita() {
        aquecerAgua();
        prepararBebida();
        colocarNaXicara();
        adicionarCondimentos();
    }
    
    // Métodos abstratos para serem implementados pelas subclasses
    abstract void prepararBebida();
    abstract void adicionarCondimentos();
    
    // Métodos concretos que são iguais para todas as subclasses
    void aquecerAgua() {
        System.out.println("Aquecendo a água");
    }
    
    void colocarNaXicara() {
        System.out.println("Colocando na xícara");
    }
}

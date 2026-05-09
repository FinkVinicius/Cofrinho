public abstract class Moeda {
    
    // Atributo que so as classes filhas podem usar
    protected double valor;
    public Moeda(double valor) {
        this.valor = valor;
    }
    //obriga as filhas a ter essas classes
    public abstract void info();
    public abstract double converter();
}
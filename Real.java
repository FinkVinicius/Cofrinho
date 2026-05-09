public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }
    @Override
    //dados impressos na lista
    public void info() {
        System.out.println("Tipo: Real / Valor: R$" + valor);
    }
    @Override
    public double converter() {
        //retorna so o proprio valor, n precisa ser convertido
        return this.valor;
    }
}
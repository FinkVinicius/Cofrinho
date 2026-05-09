public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }
    @Override
    //dados impressos na lista
    public void info() {
        System.out.println("Tipo: Dolar / Valor: U$" + valor);
    }
    @Override
    public double converter() {
        //retorna para o metodo de valor total o valor * a cotação
        return this.valor * 5.00;
    }
}
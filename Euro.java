public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }
    @Override
    //dados impressos na lista
    public void info() {
        System.out.println("Tipo: Euro / Valor: €" + valor);    
    }
    @Override
    public double converter() {
        //retorna para o metodo de valor total o valor * a cotação
        return this.valor * 5.40;
    }
}
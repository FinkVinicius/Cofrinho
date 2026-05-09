import java.util.ArrayList;

public class Cofrinho {

    // armazena as moedas
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();
    public Cofrinho() {
        
    }

    // Metodo para adicionar uma moeda ao cofrinho
    public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }

    // Metodo para remover a moeda
    public void remover(int cod) {
        //verifico se o codigo existe na lista, se ela existir removo o indice se n diz  q n existe
        if (cod >= 0 && cod < listaMoedas.size()) {
            this.listaMoedas.remove(cod);
            System.out.println("Moeda removida");
        } else {
            System.out.println("Moeda inexistente");
        }
}

    // exibe a losta de moedas, se ela n estiver vazia
    public void listagemMoedas() {
        if (this.listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio");
            return;
        }    
        //aqui mostro esse cod na frente pra quando o usuario for excluir saber que o numero do lado é o indice da moeda e o info me tras da classe da moeda o nomedela
        for (int i = 0; i < this.listaMoedas.size(); i++) {
            System.out.print("cod: " + i + "/"); 
            this.listaMoedas.get(i).info();
        }
}

    // Calcula o valor total em R$ somando os valores depois de converter cada uma em sua classe
    public double totalConvertido() {
        double valorTotal = 0;
        for (Moeda moeda : this.listaMoedas) {
            // Soma o valor convertido de cada moeda
            valorTotal += moeda.converter(); 
        }

        return valorTotal;
    }
}
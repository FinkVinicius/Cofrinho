//importacao do scaner
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Scanner do teclado
        Scanner teclado = new Scanner(System.in);
        
        // Instanciando o cofrinho
        Cofrinho cofrinho = new Cofrinho(); 
        int opcao;

        // Loop infinito do menu 0
        do {           
            System.out.println("COFRINHO");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Calcular total em Real");
            System.out.println("0 - Encerrar");
            
            //Leio a opcao              
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    //peço o tipo de moeda e armazeno
                    System.out.println("Escolha o tipo:");
                    System.out.println("1-Real");
                    System.out.println("2-Dolar");
                    System.out.println("3-Euro");

                    int tipo = teclado.nextInt();
                    //peço o valor e armazeno
                    System.out.println("Digite o valor que você deseja adicionar:");
                    double valor = teclado.nextDouble();
                    
                    // Inicializa como null
                    Moeda moeda = null;
                    
                    //compara o tipo e manda pra classe criar o objeto, e salva 
                    if (tipo == 1) {
                        moeda = new Real(valor);
                        cofrinho.adicionar(moeda);
                        System.out.println("Moeda salva no cofrinho!");
                    } else if (tipo == 2) {
                        moeda = new Dolar(valor);
                        cofrinho.adicionar(moeda);
                        System.out.println("Moeda salva no cofrinho!");
                    } else if (tipo == 3) {
                        moeda = new Euro(valor);
                        cofrinho.adicionar(moeda);
                        System.out.println("Moeda salva no cofrinho!");
                    }
                    else {
                        System.out.println("Opção de moeda errada.");
                    }
                    break;

                case 2:
                     //chama o metodo de listagem,e  se retornar true ele exibe e pede pra remover chamado o meto de remoção
                    if (cofrinho.listagemMoedas()) { 
                        System.out.println("Digite o código da moeda que deseja remover:");
                        int cod = teclado.nextInt();
                        cofrinho.remover(cod);
                    }
                    break;
                  
                case 3:
                    // chamo o metodo de listagem
                    cofrinho.listagemMoedas();
                    break;

                case 4:
                    //chamo metodo de conversão
                    double total = cofrinho.totalConvertido();
                    System.out.println("Total R$:" + total);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opçao inexistente");
                    break;
            }
        } while(opcao != 0);

        // Fecho o teclado
        teclado.close();
    }
}
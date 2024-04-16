import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        while (opcao != 11) {
            System.out.println("""
                    ********************************************************************
                    Seja bem-vindo/a ao Conversor de Moeda =]
                                    
                    1) Dólar =>> Peso argentino
                    2) Peso argentino =>> Dólar 
                    3) Dólar =>> Real brasileiro
                    4) Real brasileiro =>> Dólar
                    5) Dólar =>> Peso colombiano 
                    6) Peso colombiano =>> Dólar 
                    7) Dólar =>> Colombiano colombiano 
                    8) Colombiano colombiano =>> Dólar 
                    9) Dólar =>> Peso chileno 
                    10) Peso chileno =>> Dólar               
                    11) Sair
                    
                    Escolha uma opção válida:
                    ********************************************************************
                                    
                    """);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    RealizarConversao.realizarConversao("USD", "ARS", scanner);
                    break;
                case 2:
                    RealizarConversao.realizarConversao("ARS", "USD", scanner);
                    break;
                case 3:
                    RealizarConversao.realizarConversao("USD", "BRL", scanner);
                    break;
                case 4:
                    RealizarConversao.realizarConversao("BRL", "USD", scanner);
                    break;
                case 5:
                    RealizarConversao.realizarConversao("USD", "COP", scanner);
                    break;
                case 6:
                    RealizarConversao.realizarConversao("COP", "USD", scanner);
                    break;
                case 7:
                    RealizarConversao.realizarConversao("USD", "BOB", scanner);
                    break;
                case 8:
                    RealizarConversao.realizarConversao("BOB", "USD", scanner);
                    break;
                case 9:
                    RealizarConversao.realizarConversao("USD", "CLP", scanner);
                    break;
                case 10:
                    RealizarConversao.realizarConversao("CLP", "USD", scanner);
                    break;
                case 11:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
        scanner.close();
    }
}
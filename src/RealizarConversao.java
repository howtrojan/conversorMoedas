import java.util.Scanner;

public class RealizarConversao {
    public static void realizarConversao(String moedaOrigem, String moedaDestino, Scanner scanner) {
        ValoresMoedas valoresMoedas = API.obterValoresMoedas(moedaOrigem);

        System.out.println("Digite o valor em " + moedaOrigem + ":");
        double valor = scanner.nextDouble();

        double taxaConversao = 0.0;
        switch (moedaDestino) {
            case "ARS":
                taxaConversao = valoresMoedas.conversion_rates().ARS();
                break;
            case "BRL":
                taxaConversao = valoresMoedas.conversion_rates().BRL();
                break;
            case "COP":
                taxaConversao = valoresMoedas.conversion_rates().COP();
                break;
            case "USD":
                taxaConversao = valoresMoedas.conversion_rates().USD();
                break;
            case "BOB":
                taxaConversao = valoresMoedas.conversion_rates().BOB();
                break;
            case "CLP":
                taxaConversao = valoresMoedas.conversion_rates().CLP();
                System.out.println(taxaConversao);
                break;
        }

        double valorConvertido = valor * taxaConversao;
        System.out.println("Valor em " + moedaDestino + ": " + valorConvertido);
    }
}


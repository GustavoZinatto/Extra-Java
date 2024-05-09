//Exemplo de sistema feito pelo Chat GPT

import java.util.Scanner;

public class Matriz_03 {
    //declaração fora da classe main
    private static char[][] mapaAssentos; // Matriz para armazenar o mapa de assentos
    private static final int NUM_FILEIRAS = 5; // Número de fileiras no cinema
    private static final int ASSENTOS_POR_FILEIRA = 10; // Número de assentos por fileira

    public static void main(String[] args) {
        inicializarMapaAssentos(); // Inicializa o mapa de assentos
        exibirMapaAssentos(); // Exibe o mapa de assentos inicial

        Scanner scanner = new Scanner(System.in);

        // Loop principal do sistema
        while (true) {
            System.out.println("\nDigite 'r' para reservar um assento ou 's' para sair:");
            String opcao = scanner.nextLine();

            if (opcao.equals("r")) {
                reservarAssento(scanner); // Chama a função para reservar um assento
                exibirMapaAssentos(); // Exibe o mapa de assentos atualizado após a reserva
            } else if (opcao.equals("s")) {
                System.out.println("Saindo do sistema de reserva de assentos...");
                break; // Sai do loop se o usuário escolher sair
            } else {
                System.out.println("Opção inválida! Digite 'r' para reservar ou 's' para sair.");
            }
        }

        scanner.close();
    }

    // Inicializa o mapa de assentos com todos os assentos disponíveis
    private static void inicializarMapaAssentos() {
        mapaAssentos = new char[NUM_FILEIRAS][ASSENTOS_POR_FILEIRA];
        for (int i = 0; i < NUM_FILEIRAS; i++) {
            for (int j = 0; j < ASSENTOS_POR_FILEIRA; j++) {
                mapaAssentos[i][j] = 'O'; // 'O' representa assento disponível
            }
        }
    }

    // Exibe o mapa de assentos atual, mostrando os assentos disponíveis e reservados
    private static void exibirMapaAssentos() {
        System.out.println("\nMapa de Assentos:");
        System.out.print("  ");
        for (int i = 1; i <= ASSENTOS_POR_FILEIRA; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < NUM_FILEIRAS; i++) {
            System.out.print((char) ('A' + i) + " ");
            for (int j = 0; j < ASSENTOS_POR_FILEIRA; j++) {
                System.out.print(mapaAssentos[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Função para reservar um assento específico
    private static void reservarAssento(Scanner scanner) {
        System.out.println("\nDigite a fileira (A-E) e o número do assento (1-10) desejado:");
        String entrada = scanner.nextLine();
        char fileira = entrada.charAt(0);
        int numeroAssento = Integer.parseInt(entrada.substring(1)) - 1;

        int indiceFileira = fileira - 'A';

        // Verifica se a fileira e o número do assento são válidos
        if (indiceFileira < 0 || indiceFileira >= NUM_FILEIRAS || numeroAssento < 0 || numeroAssento >= ASSENTOS_POR_FILEIRA) {
            System.out.println("Assento inválido!");
            return;
        }

        // Verifica se o assento já está reservado
        if (mapaAssentos[indiceFileira][numeroAssento] == 'X') {
            System.out.println("Este assento já está reservado!");
        } else {
            mapaAssentos[indiceFileira][numeroAssento] = 'X'; // 'X' representa assento reservado
            System.out.println("Assento reservado com sucesso!");
        }
    }
}

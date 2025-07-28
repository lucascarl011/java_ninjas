package NivelBasico.Array;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {

            System.out.println("======= Menu Ninja =======");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja: ");
                        String nomeNinja = sc.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("A lista já está cheia! Impossivel cadastrar um ninja");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja econtrado!");
                    } else {
                        System.out.println("=========== Ninjas Cadastrados ============ ");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Programa finalizado com sucesso!");
                    break;

                    default:
                        System.out.println("Opção incorreta! Digite uma opção válida.");
                        break;
            }
        }
    }
}

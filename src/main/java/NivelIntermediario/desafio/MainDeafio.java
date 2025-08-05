package NivelIntermediario.desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDeafio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<UchihaDesafio> ninjas = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("-------- Escolha uma opção ---------");
            System.out.println("1 - Cadastrar ninja");
            System.out.println("2 - mostrar todos os ninjas");
            System.out.println("3 - Atualizar habilidades especiais");
            System.out.println("0 - Sair do programa");
            System.out.print("Opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                UchihaDesafio ninja = new UchihaDesafio();

                System.out.println("Digite o nome do ninja: ");
                ninja.nome = sc.nextLine();

                System.out.print("Digite a idade: ");
                ninja.idade = sc.nextInt();
                sc.nextLine();

                System.out.print("Digite a missão: ");
                ninja.missao = sc.nextLine();

                System.out.print("Digite o nível de dificuldade: ");
                ninja.nivelDeDificuldade = sc.nextLine();

                System.out.print("Digite o status da missão: ");
                ninja.statusDaMissao = sc.nextLine();

                System.out.print("Digite a habilidade especial: ");
                ninja.habilidadeEspecial = sc.nextLine();

                ninjas.add(ninja);

                System.out.println("Ninja Cadastrado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("=== Lista de ninjas cadastrados ===");
                for (UchihaDesafio n : ninjas) {
                    n.mostrarInformacoes();
                    System.out.println("------------------------");
                }

            } else if (opcao == 3) {
                System.out.print("Digite o nome do ninja para atualizar habilidade: ");
                String nomeBusca = sc.nextLine();

                boolean encontrado = false;
                for (UchihaDesafio n : ninjas) {
                    if (n.nome.equalsIgnoreCase(nomeBusca)) {
                        System.out.print("Digite a nova habilidade especial: ");
                        n.habilidadeEspecial = sc.nextLine();
                        System.out.println("Habilidade atualizada!");
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Ninja não encontrado.");
                }
            }
        }
        sc.close();
        System.out.println("Programa encerrado.");

    }
}

package NivelBasico.condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um Personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int personagemEscolhido = sc.nextInt();

        System.out.println("Você digitou o número: " + personagemEscolhido);

        switch (personagemEscolhido) {
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Você não digitou uma opção válida!");
        }

        sc.close();
    }
}

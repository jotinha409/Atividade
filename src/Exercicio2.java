import java.util.Scanner;

public class Exercicio2 {
    public void executarExercicio2(Scanner input){
        int opt,P1,P2,P3;
        double N1,N2,N3,mediaa;

        System.out.println("Iniciando a execução do exercício 2 -- MÉDIA");

        do {
        System.out.println("MENU DE OPÇÕES");
        System.out.println("Selecione uma das opções a seguir: ");
        System.out.println("1 -- MÉDIA ARITMÉTICA");
        System.out.println("2 -- MÉDIA PONDERADA");
        System.out.println("3 -- SAIR -- ");
        opt = input.nextInt();

        switch (opt){
            case 3:
                System.out.println("Programa finalizado com sucesso!");
                break;
            case 1:
                    System.out.println("CALCULO DE DUAS NOTAS -- MÉDIA ARITMÉTICA");
                    System.out.println("Digite o valor da primeira nota");
                    N1 = input.nextDouble();
                    System.out.println("Digite o valor da segunda nota");
                    N2 = input.nextDouble();

                    mediaa =  (N1 + N2) / 2;

                    System.out.printf("A MÉDIA DAS DUAS  NOTAS É: %.2f  ", mediaa);
                break;
            case 2:
                System.out.println("CALCULO DE TRÊS NOTAS -- MÉDIA PONDERADA ");
                System.out.println("Digite o valor da primeira nota");
                N1 = input.nextDouble();
                System.out.println("Digite o peso da primeira nota");
                P1 = input.nextInt();
                System.out.println("Digite o valor da segunda nota");
                N2 = input.nextDouble();
                System.out.println("Digite o peso da segunda nota");
                P2 = input.nextInt();
                System.out.println("Digite o valor da terceira nota");
                N3 = input.nextDouble();
                System.out.println("Digite o peso da terceira nota");
                P3 = input.nextInt();

                mediaa = (N1 * P1 + N2 * P2 + N3 * P3) / (P1 + P2 + P3);


                System.out.printf("A MÉDIA DAS TRÊS NOTAS É: %.2f  ", mediaa);
                break;

            default:
                System.out.println("Digite uma valor válido");
        }
        } while (opt != 3);

    }
}
import java.util.Scanner;

public class Exercicio1 {
    public void executarExercicio1(Scanner input) {
        int canal,canal4 = 0,canal5 = 0,canal7 = 0,canal12 =0,totalPessoas;

        System.out.println("Número 1 identificado\n");
        System.out.println("Iniciando execução Exercicio 1 -- PESQUISA DE AUDIÊNCIA DE CANAL DE TV");

        do {
            System.out.println(" -- PARA SAIR DIGITE 0 -- ");
        System.out.println("Digite o canal que estava sendo assitido no momento pelo telespectador");
        System.out.println(" Possiveis Canais (4, 5, 7, 12)");
        canal = input.nextInt();

        if (canal == 4){
            System.out.println("Digite o número de telespectadores naquele momento");
            canal4 = input.nextInt();

        }else if (canal == 5){
                System.out.println("Digite o número de telespectadores naquele momento");
            canal5 = input.nextInt();

            }else if (canal == 7){
                System.out.println("Digite o número de telespectadores naquele momento");
            canal7 = input.nextInt();

            }else if (canal == 12){
                System.out.println("Digite o número de telespectadores naquele momento");
            canal12 = input.nextInt();

            }else{
            System.out.println("Digite um valor de canal valido!!");
        }

        System.out.println("Porcentagem de audiencia nos canais (4, 5, 7, 12)");

        totalPessoas = canal4 + canal5 + canal7 + canal12;

            double percCanal4 = (canal4 * 100.0) / totalPessoas;
            double percCanal5 = (canal5 * 100.0) / totalPessoas;
            double percCanal7 = (canal7 * 100.0) / totalPessoas;
            double percCanal12 = (canal12 * 100.0) / totalPessoas;

            System.out.printf("Canal 4: %.2f%%\n", percCanal4);
            System.out.printf("Canal 4: %.2f%%\n", percCanal5);
            System.out.printf("Canal 4: %.2f%%\n", percCanal7);
            System.out.printf("Canal 4: %.2f%%\n", percCanal12);
        }while (canal != 0);
    }
}

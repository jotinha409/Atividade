import java.util.Scanner;

public class Main {

    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int opt;

        System.out.println(" -- Iniciando execução da 2º atividade de repetição -- ");

        do {

        System.out.println("Selecione um exercício para ser execultado");
        System.out.println("\tDigite 1 -- Exercício 1 -- PESQUISA DE AUDIÊNCIA DE CANAL DE TV ");
        System.out.println("\tDigite 2 -- Exercício 2 -- MÉDIA ARITMÉTICA E PONDERADA");
        System.out.println("\tDigite 3 -- Exercício 3 -- IDADE, PESO E ALTURA");
        System.out.println("\tDigite 4 -- Exercício 4 -- SOMA DOS PRIMEIROS 50 NÚMEROS");
        System.out.println("\tDigite 5 -- Exercício 5 -- USO ARRAYLIST MÉDICOS");
        System.out.println("\tDigite 6 -- Exercício 6 -- ARRAYLIST CADASTRO SISTEMA");
        System.out.println("\tDigite 7 -- Exercício 7 -- EM DESENVOLVIMENTO");
        System.out.println("\tDigite 0 -- SAIR --");
        opt = input.nextInt();

        switch (opt){

            case 0:
                System.out.println(" -- Sistema finalizado com sucesso!! -- ");
                break;

            case 1:
                Exercicio1 exercicio1 = new Exercicio1();
                exercicio1.executarExercicio1(input);
                break;
                case 2:
                Exercicio2 exercicio2 = new Exercicio2();
                exercicio2.executarExercicio2(input);
                break;
            case 3:
                Exercicio3 exercicio3 = new Exercicio3();
                exercicio3.executarExercicio3(input);
                break;
            case 4:
                Exercicio4 exercicio4 = new Exercicio4();
                exercicio4.executarExercicio4();
                break;
            case 5:
                Exercicio5 exercicio5 = new Exercicio5();
                exercicio5.executarExercicio5(input);
                break;
            case 6:
                Exercicio6 exercicio6 = new Exercicio6();
                exercicio6.executarExercicio6(input);
                break;
            case 7:
                Exercicio7 exercicio7 = new Exercicio7();
                exercicio7.executarExercicio7(input);
            default:
                    System.out.println("Digite um valor valido!!");
        }
        } while (opt != 0);

    }
}
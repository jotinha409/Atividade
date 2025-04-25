import java.util.Scanner;

public class Exercicio3 {
    public void executarExercicio3(Scanner input){
        System.out.println("Iniciando execução Exercicio3 -- IDADE, PESO E ALTURA");
        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[10];
        double[] pesos = new double[10];
        double[] alturas = new double[10];

        double somaIdades = 0;
        int contPesoAltura = 0;
        int contAlturaAlta = 0;
        int contIdadeAlturaAlta = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");

            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            somaIdades += idades[i];

            System.out.print("Peso (kg): ");
            pesos[i] = scanner.nextDouble();

            System.out.print("Altura (m): ");
            alturas[i] = scanner.nextDouble();

            if (pesos[i] > 90 && alturas[i] < 1.50) {
                contPesoAltura++;
            }

            if (alturas[i] > 1.90) {
                contAlturaAlta++;
                if (idades[i] >= 10 && idades[i] <= 30) {
                    contIdadeAlturaAlta++;
                }
            }
        }

        double mediaIdades = somaIdades / 10;
        double porcentagemIdadeAlturaAlta = 0;
        if (contAlturaAlta > 0) {
            porcentagemIdadeAlturaAlta = (contIdadeAlturaAlta * 100.0) / contAlturaAlta;
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Média das idades: " + mediaIdades);
        System.out.println("Total com peso > 90kg e altura < 1.50m: " + contPesoAltura);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as que medem mais de 1,90m: "
                + porcentagemIdadeAlturaAlta + "%");

        System.out.println("\n--- Dados coletados ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Pessoa " + (i + 1) + ": Idade = " + idades[i] +
                    ", Peso = " + pesos[i] + " kg, Altura = " + alturas[i] + " m");
        }
    }
}

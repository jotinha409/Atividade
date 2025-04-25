import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio6 {
    public void executarExercicio6 (Scanner input){

                ArrayList<String> nomes = new ArrayList<>();
                ArrayList<Integer> idades = new ArrayList<>();
                ArrayList<String> cpfs = new ArrayList<>();

                System.out.println("Quantos pacientes deseja cadastrar?");
                int quantidade = input.nextInt();
                input.nextLine();

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("Digite o nome do paciente:");
                    String nome = input.nextLine();
                    nomes.add(nome);

                    System.out.println("Digite a idade do paciente:");
                    int idade = input.nextInt();
                    input.nextLine(); // limpa o buffer
                    idades.add(idade);

                    System.out.println("Digite o CPF do paciente:");
                    String cpf = input.nextLine();
                    cpfs.add(cpf);
                }

                System.out.println("\nPacientes cadastrados:");
                for (int i = 0; i < nomes.size(); i++) {
                    System.out.println("Nome: " + nomes.get(i));
                    System.out.println("Idade: " + idades.get(i));
                    System.out.println("CPF: " + cpfs.get(i));
                    System.out.println("----------------------");
                }

    }
}


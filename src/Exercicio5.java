import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio5 {
    public void executarExercicio5 (Scanner input){

                ArrayList<String> nomes = new ArrayList<>();
                ArrayList<String> especialidades = new ArrayList<>();
                ArrayList<Integer> crms = new ArrayList<>();

                System.out.println("Quantos médicos você deseja cadastrar?");
                int quantidade = input.nextInt();
                input.nextLine();

                for (int i = 0; i < quantidade; i++) {
                    System.out.println("Digite o nome do médico:");
                    String nome = input.nextLine();
                    nomes.add(nome);

                    System.out.println("Digite a especialidade:");
                    String esp = input.nextLine();
                    especialidades.add(esp);

                    System.out.println("Digite o CRM:");
                    int crm = input.nextInt();
                    input.nextLine();
                    crms.add(crm);
                }

                System.out.println("\nMédicos cadastrados:");
                for (int i = 0; i < nomes.size(); i++) {
                    System.out.println("Nome: " + nomes.get(i));
                    System.out.println("Especialidade: " + especialidades.get(i));
                    System.out.println("CRM: " + crms.get(i));
                    System.out.println("--------------------");
                }
    }
}

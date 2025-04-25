public class Exercicio4 {
    public void executarExercicio4() {

                double soma = 0;
                int numerador = 1000;

                for (int i = 1; i <= 50; i++) {
                    double termo = (double) numerador / i;

                    if (i % 2 == 0) {
                        soma -= termo;
                    } else {
                        soma += termo;
                    }

                    numerador -= 3;
                }

                System.out.printf("A soma dos 50 primeiros termos da série é: %.2f\n", soma);
    }
}




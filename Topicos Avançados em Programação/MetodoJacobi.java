import java.util.Scanner;

public class MetodoJacobi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de variáveis: ");
        int n = sc.nextInt();

        double[][] A = new double[n][n];
        double[] b = new double[n];

        // Lendo a matriz A
        System.out.println("Digite os coeficientes da matriz A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("A[%d][%d] = ", i + 1, j + 1);
                A[i][j] = sc.nextDouble();
            }
        }

        // Lendo o vetor b
        System.out.println("Digite os termos independentes do vetor b:");
        for (int i = 0; i < n; i++) {
            System.out.printf("b[%d] = ", i + 1);
            b[i] = sc.nextDouble();
        }

        // Configurações do método
        double[] x = new double[n];  // chute inicial (0,0,...,0)
        double[] prox = new double[n];
        double tol = 1e-6;          // tolerância
        int maxIter = 100;          // número máximo de iterações

        System.out.println("\n--- Iniciando método de Jacobi ---");

        for (int iter = 0; iter < maxIter; iter++) {
            for (int i = 0; i < n; i++) {
                double soma = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        soma -= A[i][j] * x[j];
                    }
                }
                prox[i] = soma / A[i][i];
            }

            // verificar critério de parada (norma da diferença)
            double erro = 0;
            for (int i = 0; i < n; i++) {
                erro += Math.pow(prox[i] - x[i], 2);
                x[i] = prox[i];
            }
            erro = Math.sqrt(erro);

            System.out.printf("Iteração %d: ", iter + 1);
            for (double xi : x) {
                System.out.printf("%.6f ", xi);
            }
            System.out.printf(" | Erro: %.6e\n", erro);

            if (erro < tol) {
                System.out.println("Convergência atingida!");
                break;
            }
        }

        System.out.println("\n--- Solução aproximada ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("x[%d] = %.6f\n", i + 1, x[i]);
        }

        sc.close();
    }
}

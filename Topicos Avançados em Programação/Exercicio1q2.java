import java.util.Scanner;

public class Exercicio1q2 {



    public static void main(String[] args) {

        double salario;
        double indice;
        double saljustado;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu salário atual: ");
        salario = sc.nextDouble();

        System.out.print("Insira o Indice de reajuste salarial(somente números): ");
        indice = sc.nextDouble();

        saljustado = salario +  (salario * indice/100);

        System.out.print("O salário ajustado é R$:" + saljustado);

    }
}

import java.util.Scanner;

public class Exercicio1q4 {

    public static void main(String[] args) {
        int idade;
        int max = 18;
        String sexo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Digite o sexo: M para masculino e F para feminino ");
        sexo = sc.next();
        if(sexo.equals("M") && idade == 18){
            System.out.println("Voce deve se alistar no exército");
        }
    }
}

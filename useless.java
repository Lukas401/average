import java.util.Scanner;

public class useless {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");

        float nota1 = input.nextFloat();

        System.out.print("Digite a primeira nota: ");

        float nota2 = input.nextFloat();

        float media = (nota1 + nota2) / 2;
        System.out.println("A média é " + media);

        if (media >= 9 && media <= 10) {
            System.out.println("Conceito A");
        } else {
            if (media >= 8 && media < 9)
                System.out.println("Conceito B");
            else {
                if (media >= 6 && media < 8)
                    System.out.println("Conceito C");
                else {
                    if (media >= 5 && media < 6)
                        System.out.println("Conceito D");
                    else {
                        System.out.println("Reprovado");

                        input.close();
                    }
                }
            }
        }
    }
}

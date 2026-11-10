import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Condicional Simples
        /*float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();

        float media = (n1 + n2) / 2;
        System.out.println("A média é: " + media);

        if (media >= 8) {
            System.out.println("Parabéns! Ótima média!");
        }*/

        //Condicional Composta

        System.out.print("====== Descubra se você é maior de idade ======");
        System.out.print("\nDigite sua data de nascimento: ");
        int nascimento = scanner.nextInt();
        int idade = 2026 - nascimento;

        if (idade >= 18) {
            System.out.println("Sua idade é " + idade + ". Você é maior de idade!");
        } else {
            System.out.println("Sua idade é " + idade + ". Você ainda é menor de idade!");
        }
    }
}

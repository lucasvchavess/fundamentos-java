import java.util.Scanner;

public class OperadoresLogicos{
    public static void main(String[] args) {
       /*  int a = 5;
        int b = 10;
        int c = 15;
        boolean resultado = !(a < b) ? true : false; 
        System.out.println("O resultado da operação lógica é: " + resultado);*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        boolean res = (idade >= 16 && idade < 18) || (idade > 70);
        if (res) {
            System.out.println("Você pode votar, mas é opcional.");
        } else if (idade >= 18 && idade <= 70) {
            System.out.println("Você é obrigado a votar.");
        } else {
            System.out.println("Você não pode votar.");
        }
}

}  
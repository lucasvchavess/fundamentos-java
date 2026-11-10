import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {

        System.out.print("===== Descubra se você pode votar =====\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = scanner.nextInt();
        int idade = 2026 - anoNascimento;

        if (idade < 16) {
            System.out.println("Você ainda não tem idade para votar!");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Você tem idade para votar, mas é opcional!");
        } else if (idade >= 18 && idade < 70) {
            System.out.println("Você tem idade para votar e é obrigatório!");
        } else {
            System.out.println("Você tem idade para votar, mas é opcional!");
        }
        
    }

} 

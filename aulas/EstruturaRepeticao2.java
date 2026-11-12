import java.util.Scanner;

public class EstruturaRepeticao2 {
    public static void main(String[] args) {

       /*  int n, s = 0;
        String resp;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite um número: ");
            n = scanner.nextInt();
            s += n;

            System.out.print("Quer continuar? [S/N] ");
            resp = scanner.next();
        } while (resp.equals("s"));

        System.out.println("A soma dos números digitados é: " + s);
    } */

        int x;
        int c = 0;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();

        while (c < 6) {

            if (x % 2 != 0) {
                System.out.println(x);
                c++;
            }

            x++;
        }

        
        
        

        
        
        
    }
}

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         
        Scanner scanner = new Scanner(System.in);
        
        int codigo = scanner.nextInt();
        double preco = 0;
        
        switch (codigo) {
            case 1:
                
                preco = 4.00;
                break;
            case 2:
                
                preco = 4.50;
                break;
            case 3:
                
                preco = 5.00;
                break;
            case 4:
                
                preco = 2.00;
                break;
            case 5:
                
                preco = 1.50;
                break;
            default:
                System.out.print("Não existe essa opção");
                break;

    }
    
    int quantidade = scanner.nextInt();
    
    double total = preco * quantidade;
    
    System.out.printf("Total: R$ %.2f\n" , total);
 
}
}
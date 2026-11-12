import java.util.Scanner;

public class teste{
    public static void Main(String[] args){
        int N;
        int M;
        
        
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        
        for (int i = 1; i <= 10; i++){
           M = i * N;
           System.out.println(i + " x " +  N + " = " + M);
        }
    }
}
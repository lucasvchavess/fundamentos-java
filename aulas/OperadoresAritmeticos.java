import java.io.IOException;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        //Exercício 1 - Operadores Aritméticos

        /*int n1 = 503;
        int n2 = 31;
        float div = (float) n1 / n2;
        float resto = n1 % n2;

        System.out.println("A divisão é igual a " + div);
        System.out.println("O resto da divisão é igual a " + resto); */

        //Exercício 2 - Incremento e Decremento (Operadores Unários)
        /*int numero = -5;
        numero++;
        System.out.println("O valor de numero é " + numero);*/

        //Exercício 3 - Operadores de Atribuição
       /* int x = 4;
        x /= 2;
        System.out.println("O valor de x é " + x); */

        //Exercício 4 - Arredondamento de valores
        /*float v = 3.4f;
        int ar = (int) Math.round(v);
        System.out.println("O valor de ar é " + ar);*/

        /*double aleatorio = Math.random();
        int n = (int) (15 + aleatorio * (50 - 15));
        System.out.println("O valor de n é " + n);*/


    float raio = 2f;
    double n = Math.PI;
    double a = n * Math.pow(raio,2);
    
    System.out.printf("A=%.4f\n", a);
    }
 
}
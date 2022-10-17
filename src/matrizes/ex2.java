/*Declare uma matriz 5 x 5.
Preencha com 1 a diagonal
principal e com 0 os demais elementos. Escreva
ao final a matriz obtida.*/

package matrizes;
import java.util.Scanner;

public class ex2 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz={{1,0,0,0,0},{0,1,0,0,0},{0,0,1,0,0},{0,0,0,1,0},{0,0,0,0,1}};
        for (int l=0;l<5;l++){
            System.out.println("");
            for (int c=0;c<5;c++){
                System.out.print(matriz[l][c]+"  ");
            }
        }
    }
}

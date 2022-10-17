/*Gerar uma matriz quadrada aleatoriamente
de 10x10 e imprimir a diagonal desta matriz
 */

package matrizes;

import java.util.Random;

public class ex7 {
    public static Random aleatorio = new Random();
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j]=aleatorio.nextInt(10);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i==j) {
                    System.out.print(matriz[i][j] + "  ");
                }
                else{
                    System.out.print("-  ");
                }
            }
            System.out.println("");
        }
    }
}

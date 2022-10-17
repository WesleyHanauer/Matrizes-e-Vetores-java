/*Ler uma matriz 4x4 de números inteiros,
multiplicar os elementos da diagonal principal
por um número inteiro também lido e escrever a matriz resultante.*/
package matrizes;
import java.util.Scanner;
public class ex6 {
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int contLinha=1;
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe valores para a linha "+contLinha);
            contLinha++;
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
        int multiplicacao = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j==i){
                    multiplicacao*=matriz[i][j];
                }
            }
        }
        System.out.println(multiplicacao);







      /*for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println("");
        }*/
    }
}

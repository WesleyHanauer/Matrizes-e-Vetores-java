/*Leia uma matriz de 5x5 elementos.
Calcule a soma dos elementos que estão acima da diagonal principal.
Leia uma matriz de 5x5 elementos.
Calcule a soma dos elementos que estão abaixo da diagonal principal.
 */

package matrizes;

import java.util.Scanner;

public class ex9 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int contLinha=1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe valores para a linha "+contLinha);
            contLinha++;
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("");
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==j && i<4){
                    soma+=matriz[i][j+1];
                }
            }
        }
        System.out.println(soma);
        System.out.println("");
        soma=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==j && i<4){
                    soma+=matriz[i+1][j];
                }
            }
        }
        System.out.println(soma);
    }
}

/*Leia uma matriz de 5x5 elementos.
Calcule a soma dos elementos que estão na diagonal principal.*/

package matrizes;

import java.util.Scanner;

public class ex8 {
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
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==i){
                    soma+=matriz[i][j];
                }
            }
        }
        System.out.println(soma);
    }
}

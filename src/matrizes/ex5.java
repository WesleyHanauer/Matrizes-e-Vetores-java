/*5 - Ler duas matrizes, A 4x6 e B 4x6, e criar:
a) uma matriz S que seja a soma de A e B (A+B)
b) uma matriz D que seja a diferença de A e B (A-B)
 Escrever as matrizes S e D.
*/

package matrizes;

import java.util.Scanner;

public class ex5 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] A = new int[4][6];
        int[][] B = new int[4][6];
        int contLinha=1;
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe valores para a linha "+contLinha);
            contLinha++;
            for (int j = 0; j < 6; j++) {
                A[i][j] = ler.nextInt();
            }
        }
        contLinha=1;
        for (int i = 0; i < 4; i++) {
            System.out.println("Informe valores para a linha "+contLinha);
            contLinha++;
            for (int j = 0; j < 6; j++) {
                B[i][j] = ler.nextInt();
            }
        }
        int[][] S = new int[4][6];
        int[][] D = new int[4][6];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                S[i][j]=A[i][j]+B[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(S[i][j]+"  ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                D[i][j]=A[i][j]-B[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(D[i][j]+"  ");
            }
            System.out.println("");
        }

        //a) uma matriz S que seja a soma de A e B (A+B)
        //b) uma matriz D que seja a diferença de A e B (A-B)
        /*for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println("");
        }*/
    }
}

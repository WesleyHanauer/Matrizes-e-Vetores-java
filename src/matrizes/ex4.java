/*Ler uma matriz G 3x3 e criar 2 vetores,
SL e SC, de 3 elementos cada, contendo
respectivamente as somas das linhas e das
colunas de G. Escrever os vetores criados.
 */

package matrizes;
import java.util.Scanner;

public class ex4 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetorMat = new int[9];

        int[] SL = new int[3];
        int[] SC = new int[3];
        int cont = 1;
        for (int i = 0; i < vetorMat.length; i++) {
            System.out.println("Informe um valor para a posicao "+cont+" da matriz.");
            vetorMat[i] = ler.nextInt();
            cont++;
        }
        int[][] G={{vetorMat[0],vetorMat[1],vetorMat[2]},{vetorMat[3],vetorMat[4], vetorMat[5]},{vetorMat[6],vetorMat[7],vetorMat[8]}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(G[i][j]+"  ");
            }
            System.out.println("");
        }
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                SL[l]+=G[l][c];
            }
        }
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                SC[c]+=G[l][c];
            }
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.print(SL[i]);
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.print(SC[i]);
        }
    }
}

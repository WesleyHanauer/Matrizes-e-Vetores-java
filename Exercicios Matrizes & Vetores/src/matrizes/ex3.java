/*Carregar uma matriz SOMA 4x4,
calcular e escrever as seguintes somas:
a) da linha 3
b) da coluna 2
c) de todos os elementos da matriz
*/

package matrizes;
import java.util.Scanner;

public class ex3 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int soma = 0;
        int[][] matriz={{1,2,3,4,},{4,3,2,1,},{5,6,7,8,},{8,7,6,5,}};
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i=2;i<3;i++){
            for (int j=0;j<4;j++){
                soma+=matriz[i][j];
            }
        }System.out.println(soma);soma=0;
        System.out.println("");
        for (int i=0;i<4;i++){
            for (int j=1;j<2;j++){
                soma+=matriz[i][j];
            }
        }System.out.println(soma);soma=0;
        System.out.println("");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                soma+=matriz[i][j];
            }
        }System.out.println(soma);soma=0;
    }
}

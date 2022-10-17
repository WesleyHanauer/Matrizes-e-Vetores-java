/*Leia uma matriz 5 x 5. Leia também um valor X.
O programa deverá fazer uma busca desse valor na
matriz e, ao final, escrever a localização (linha e coluna)
ou uma mensagem de “não encontrado”.*/

package matrizes;

import java.util.Scanner;

public class ex10 {
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
        System.out.println("Digite o valor que deseja proucurar na matriz.");
        int x = ler.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j]!=x){
                    encontrado=false;
                } else if (matriz[i][j]==x) {
                    encontrado=true;
                    System.out.println("O valor esta na linha "+(i+1)+", coluna "+(j+1));
                    break;
                }
            }
        }
        if (!encontrado){
            System.out.println("O numero nao foi encontrado!");
        }
        System.out.println("");
        if (encontrado){
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(matriz[i][j]+"  ");
                }
                System.out.println("");
            }
        }
    }
}
/*Faça um programa que deverá permitir
que o usuário entre com os valores dos
elementos de uma matriz quadrada de
ordem 4 e possibilite o usuário realizar
as seguintes funcionalidades:

a) Imprimir todos os elementos da matriz;
b) Somar os quadrados de todos os elementos da primeira coluna;
c) Somar todos os elementos da terceira linha;
d) Somar os elementos da diagonal principal; e
e) Somar todos os elementos de índice par da segunda linha.
*/
package matrizes;
import java.util.Scanner;

public class ex11 {
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
        System.out.println("");
        System.out.println("Digite 1 para imprimir a matriz.");
        System.out.println("Digite 2 para somar os quadrados dos numeros da primeira coluna.");
        System.out.println("Digite 3 para somar todos os elementos da terceira linha.");
        System.out.println("Digite 4 para somar os elementos da diagonal principal.");
        System.out.println("Digite 5 para somar todos os elementos pares da segunda linha.");
        int escolha=ler.nextInt();
        if (escolha==1){
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matriz[i][j]+"  ");
                }
                System.out.println("");
            }
        } else if (escolha==2) {
            System.out.println("Os quadrados da primeira coluna sao: ");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 1; j++) {
                    System.out.println((matriz[i][j]*matriz[i][j])+"  ");
                }
            }
        } else if (escolha==3) {
            int soma=0;
            for (int i = 2; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    soma+=matriz[i][j];
                }
            }
            System.out.println("A soma dos elementos da terceira linha e: "+soma);
        } else if (escolha==4) {
            int soma=0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i==j){
                        soma += matriz[i][j];
                    }
                }
            }
            System.out.println("A soma da diagonal principal e: "+soma);
        } else if (escolha==5) {
            int soma=0;
            for (int i = 1; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    if (matriz[i][j]%2==0){
                        soma+=matriz[i][j];
                    }
                }
            }
            System.out.println("A soma dos elementos pares da segunda linha e: "+soma);
        }
    }
}

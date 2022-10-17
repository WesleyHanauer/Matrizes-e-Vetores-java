/*Declarar um vetor números com 20 elementos,
gerar valores inteiros para ele aleatoriamente.
Declare outros dois vetores, par e impar.
No vetor par armazenar todos os elementos pares do vetor números.
o vetor ímpar armazenar todos os elementos ímpares de números.
Imprima os dois vetores. */

package vetores;
import java.util.*;

public class ex5 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor1 = new int[20];
        int cont=1;
        Random aleatorio = new Random();
        for (int i=0;i<20;i++){
            vetor1[i]=aleatorio.nextInt(10);
            cont++;
        }
        System.out.println("Numeros pares: ");
        for (int i=0;i<20;i++){
            if (vetor1[i]%2==0){
                System.out.print(vetor1[i]+" ");
            }
        }
        System.out.println(" ");
        System.out.println("Numeros impares: ");
        for (int i=0;i<20;i++){
            if (vetor1[i]%2!=0){
                System.out.print(vetor1[i]+" ");
            }
        }
    }
}

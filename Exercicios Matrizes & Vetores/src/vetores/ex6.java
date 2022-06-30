/* Ler um vetor C de 10 nomes de pessoas,
após pedir que o usuário digite um nome qualquer de pessoa.
Escrever a mensagem ACHEI, se o nome estiver armazenado
no vetor C ou NÃO ACHEI caso contrário.*/

package vetores;
import java.util.*;

public class ex6 {
    public static Scanner ler = new Scanner(System.in);
    public static String verifica=null;
    public static void main(String[] args) {
        String[] nomes = new String[10];
        int cont=1;
        for (int i=0;i<10;i++){
            System.out.println("Informe um nome para a pessoa "+cont+":");
            nomes[i] = ler.next();
            cont++;
        }
        System.out.println("Digite um nome: ");
        String nome = ler.next();
        for(int i=0;i<10;i++){
            if (nome.equals(nomes[i])){
                verifica="Achei!";
            }
            else {
                verifica="nao achei!";
            }
        }
        System.out.println(verifica);
    }
}

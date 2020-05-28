import java.util.Scanner;
public class Uri1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        /*Escreva um programa que leia um valor inteiro N (1 < N < 1000). 
        Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.
        O arquivo de entrada contém um número inteiro positivo N.*/

        int N, val;

        N = teclado.nextInt();

        if(N > 1 && N < 1000){
            for( val=1 ; val <= N ; val++){
            System.out.println(val + " " + val*val + " " + val*val*val);
            }
        }

    }
}

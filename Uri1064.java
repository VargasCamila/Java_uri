import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float num, media, soma = 0 ;
        int qnt = 1, posit = 0; 

        while (qnt <= 6){
            qnt++;
            num = teclado.nextFloat();
            if (num > 0){
                soma = num + soma;
                posit = posit + 1;

            }
        }
        media = soma/posit;
        System.out.println(posit+ " valores positivos");
        System.out.printf("%.1f\n",media);

    }
}
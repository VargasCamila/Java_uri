import java.util.Scanner;
public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float num;
        int qnt = 1, par = 0;

        
        
        while (qnt <=5){
            qnt++;
            num = teclado.nextFloat();
            if (num % 2 == 0){
                par = par + 1;
            }
        }
        System.out.println(par+ " valores pares");
    }
}
import java.util.Scanner;
public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int inicio ;
        inicio = teclado.nextInt();

        if (inicio %2 == 0){
            inicio = inicio-1;
        }

        while (inicio >= 1 && inicio <=1000){
            System.out.println(inicio);
            inicio = inicio - 2;
            
        }
    }
}
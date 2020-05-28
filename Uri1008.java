import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int num,qnt;
        float valorhora;
        float total;
        num = teclado.nextInt();
        qnt = teclado.nextInt();
        valorhora = teclado.nextFloat();

        total = valorhora * qnt;

        System.out.println("NUMBER = " +num);
        System.out.printf("SALARY = U$ %.2f\n",total);
    }
}
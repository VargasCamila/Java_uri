import java.util.Scanner;
public class Uri1011{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double R;
        double Volume;
        double raiocubo;
        double pi = 3.14159;

        R = teclado.nextDouble();
        raiocubo = R*R*R;
        Volume = (4.0/3)*pi*raiocubo;

        System.out.printf("VOLUME = %.3f\n",Volume);

    }
}
import java.util.Scanner;
public class Uri1012{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double A,B,C;
        A = teclado.nextDouble();
        B =  teclado.nextDouble();
        C =  teclado.nextDouble();

        

        System.out.printf("TRIANGULO: %.3f\n",A*C/2);
        System.out.printf("CIRCULO: %.3f\n",C*C*3.14159);
        System.out.printf("TRAPEZIO: %.3f\n",(A+B)*C/2);
        System.out.printf("QUADRADO: %.3f\n",B*B);
        System.out.printf("RETANGULO: %.3f\n",A*B);
    }
}
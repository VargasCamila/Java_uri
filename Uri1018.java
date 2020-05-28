import java.util.Scanner;
public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int valor;
        int a, b, c, d, e, f, g, resto;

        

        valor = teclado.nextInt();

        System.out.println(valor);
        System.out.print(valor/100);
        System.out.println(" notas(s) de R$ 100,00");
        System.out.print(valor/50);
        System.out.println(" notas(s) de R$ 50,00");
        System.out.print(valor/20);
        System.out.println(" notas(s) de R$ 20,00");
        System.out.print(valor/10);
        System.out.println(" notas(s) de R$ 10,00");
        System.out.print(valor/5);
        System.out.println(" notas(s) de R$ 5,00");
        System.out.print(valor/2);
        System.out.println(" notas(s) de R$ 2,00");
        System.out.print(valor/1);
        System.out.println(" notas(s) de R$ 1,00");

    }
}


import java.util.Scanner;
public class Uri1144{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int N, val;

        N = teclado.nextInt();

        for( val=1 ; val <= N ; val++){
            System.out.println(val + " " + val*val + " " + val*val*val);
            System.out.println(val + " " + (val*val+ 1) + " " + (val*val*val+1));
        }

    }
}
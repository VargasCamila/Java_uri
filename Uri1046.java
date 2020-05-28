import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int h1, h2;
        int hora1, hora2; 

        h1 = teclado.nextInt();
        h2 = teclado.nextInt();

        if ( h1 == h2){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
            else if ( h1 > h2){
                hora1 = (24-h1) + h2;
                System.out.println("O JOGO DUROU "+hora1+" HORA(S)");

            }
            else if (h1 < h2){
                hora2 = (h2-h1);
                System.out.println("O JOGO DUROU "+hora2+" HORA(S)");
            }
    }
}
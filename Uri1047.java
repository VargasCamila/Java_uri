import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hi, hf, mi, mf;
        int horai, horaf;
        int hora;
        int ht, mt;

        hi = teclado.nextInt();
        mi = teclado.nextInt();
        hf = teclado.nextInt();
        mf = teclado.nextInt();

        horai = hi * 60 + mi;
        horaf = hf * 60 + mf;

        if (horai > horaf){
            hora = (1400-horai) + horaf;
            ht = hora/60;
            mt = hora % 60; 
            System.out.println("O JOGO DUROU " +ht+ " HORA(S) E " +mt+ " MINUTO(S)");
        }
            else if(horai == horaf){
                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            }
            else if(horai < horaf){
                hora = (horaf - horai);
                ht = hora/60;
                mt = hora % 60; 
                System.out.println("O JOGO DUROU " +ht+ " HORA(S) E " +mt+ " MINUTO(S)");
            }
    }
}    
import java.util.Scanner;
public class Ex20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int sexo;
        String txtaltura;
        Float altura, PesoIdeal;

        System.out.println("Digite sua altura.");
        txtaltura = teclado.nextLine();
        altura = Float.parseFloat(txtaltura);
        System.out.println("Digite seu sexo. 1 para Homeme | 2 para Mulher");
        sexo = teclado.nextInt();

        if ( sexo == 1){
            PesoIdeal = (72.7f * altura) - 58;
            System.out.println("Peso Ideal: " +PesoIdeal);

        }
        else{
            PesoIdeal = (62.1f * altura) - 44.7f;
            System.out.println("Peso Ideal: " +PesoIdeal);
        }
    }
}
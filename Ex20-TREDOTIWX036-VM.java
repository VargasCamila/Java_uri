import java.util.Scanner;
public class Exercicio20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        String sexo;
        String Mulher;
        String Homem;
        String txtaltura;
        Float altura, PesoIdeal;


        Sistem.out.println("Digite sua altura");
        txtaltura = teclado.nextLine();
        altura = Integer.parseFloat(txtaltura);
        Sistem.out.println("Digite seu sexo");
        sexo = teclado.nextLine();

    }
}
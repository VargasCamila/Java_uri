import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int pedido, quantidade;
        float valor1, valor2, valor3, valor4, valor5;
        double total;


        pedido = teclado.nextInt();
        quantidade = teclado.nextInt();

        valor1 = 4.00f;
        valor2 = 4.50f;
        valor3 = 5.00f;
        valor4 = 2.00f;
        valor5 = 1.50f;


        if (pedido == 1){
            total = (quantidade * valor1);
            System.out.printf("Total: R$ %.2f\n",total);
        }
        else
            if (pedido == 2){
            total = (quantidade * valor2);
            System.out.printf("Total: R$ %.2f\n",total);
            }
                else
                    if (pedido == 3){
                    total = (quantidade * valor3);
                    System.out.printf("Total: R$ %.2f\n",total);
                    }
                    else
                        if (pedido == 4){
                        total = (quantidade * valor4);
                        System.out.printf("Total: R$ %.2f\n",total);
                        }    
                        else
                            if (pedido == 5){
                            total = (quantidade * valor5);
                            System.out.printf("Total: R$ %.2f\n",total);
                            }    
    
    }
}

import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double renda;
        double resto;
        double imposto1;

        renda = teclado.nextDouble();

        if (renda <= 2000.00d){
            System.out.println("Isento");
        }
            else
                if(renda > 2000.00d && renda <= 3000.00d){
                    resto = renda - 2000;
                    imposto1 = (resto * 0.08d);
                    System.out.printf("R$ %.2f\n",imposto1);
                } 
                else
                    if(renda > 3000.00d && renda <= 4500.00d){
                        resto = renda - 3000;
                        imposto1 = (80 + resto * 0.18d);
                        System.out.printf("R$ %.2f\n",imposto1);
                    } 
                    else
                        if(renda > 4500.00d){
                            resto = renda - 4500;
                            imposto1 = (350 + resto * 0.28d);
                            System.out.printf("R$ %.2f\n",imposto1);
                    } 

    }
}
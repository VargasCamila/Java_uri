import java.util.Scanner;
public class Uri1042{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
    
        int A, B, C;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();

        if (A < B && A < C ){
            System.out.println(A);

            if(B < C){
                System.out.println(B);
                System.out.println(C);
            }
            else
                System.out.println(C);
                System.out.println(B);
        }  
        else if(B < A && B < C){
            System.out.println(B);

            if(A < C){
                System.out.println(A);
                System.out.println(C);
            }
            else
                System.out.println(C);
                System.out.println(A);
        } 
        else if(C < A && C < B){
            System.out.println(C);

            if(A < B){
                System.out.println(A);
                System.out.println(B);
            }
            else
                System.out.println(B);
                System.out.println(A);
        } 

    }
}

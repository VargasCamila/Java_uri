import java.util.Scanner;
public class Uri1049{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String classe1, classe2, classe3;

        classe1 = teclado.nextLine();
        classe2 = teclado.nextLine();
        classe3 = teclado.nextLine();


        if(classe1.equals("vertebrado")){
            if(classe2.equals("ave")){
                if(classe3.equals("carnivoro")){
                    System.out.println("aguia");
                }
                else if(classe3.equals("onivoro")){
                        System.out.println("pomba");
                    }
            }
            else if(classe2.equals("mamifero")){
                    if(classe3.equals("onivoro")){
                        System.out.println("homem");
                    }              
                    else if(classe3.equals("herbivoro")){
                        System.out.println("vaca");
                    }
                }

        }
        else if(classe1.equals("invertebrado")){
            if(classe2.equals("inseto")){
                if(classe3.equals("hematofago")){
                    System.out.println("pulga");
                }
                else if(classe3.equals("herbivoro")){
                        System.out.println("lagarta");
                    }
            }
            else if(classe2.equals("anelideo")){
                    if(classe3.equals("hematofago")){
                        System.out.println("sanguessuga");
                    }              
                    else if(classe3.equals("onivoro")){
                        System.out.println("minhoca");
                    }
                }
            }
    }
}
import java.util.Scanner;
public class Exercicio04_LetraI_Lista

//Resto da divis�o por 7.

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      int num, rest_div;
      
      System.out.println("Digite um n�mero: " + "\n");
      num=leia.nextInt();    
   
      rest_div = num % 7;
      
      System.out.println("\nO resto resto da divis�o do seu n�mero por 7 �: " + rest_div);
   
          
      System.out.println("\n---------------------------------------------------------");
      System.out.println("------------------PROGRAMA FINALIZADO----------------------");
      System.out.printf("%s%n%n","---------------------------------------------------------");
   
   }

}
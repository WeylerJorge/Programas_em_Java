import java.util.Scanner;
public class Exercicio04_LetraI_Lista

//Resto da divisão por 7.

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      int num, rest_div;
      
      System.out.println("Digite um número: " + "\n");
      num=leia.nextInt();    
   
      rest_div = num % 7;
      
      System.out.println("\nO resto resto da divisão do seu número por 7 é: " + rest_div);
   
          
      System.out.println("\n---------------------------------------------------------");
      System.out.println("------------------PROGRAMA FINALIZADO----------------------");
      System.out.printf("%s%n%n","---------------------------------------------------------");
   
   }

}
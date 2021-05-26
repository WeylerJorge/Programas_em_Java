import java.util.Scanner;
public class Exercicio04_LetraB_Lista

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      int num1, num2, num3, num4, media;
      
         System.out.println("Digite o primeiro numero: ");
      num1=leia.nextInt();       
      System.out.printf("%s","Ok, seu primeiro número é: " + num1 + "\n\n");
      
         System.out.println("Digite o segundo numero: ");
      num2=leia.nextInt();       
      System.out.println("Ok, seu segundo número é: " + num2 + "\n\n");
      
            System.out.println("Digite o terceiro numero: ");
      num3=leia.nextInt();       
      System.out.println("Ok, seu terceiro número é: " + num3 + "\n\n");
      
            System.out.println("Digite o quarto numero: ");
      num4=leia.nextInt();       
      System.out.println("Ok, seu quarto número é: " + num4 + "\n\n");

      media = (num1 + num2 + num3 + num4)/4;
      
      System.out.println("A média aritmética dos seus numeros é: " + media);
   
          
      System.out.println("\n---------------------------------------------------------");
      System.out.println("PROGRAMA FINALIZADO");
      System.out.printf("%s%n%n","---------------------------------------------------------");
 
   }

}
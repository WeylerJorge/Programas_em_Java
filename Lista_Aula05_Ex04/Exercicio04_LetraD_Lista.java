import java.util.Scanner;
public class Exercicio04_LetraD_Lista

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      double c, f, result, comp;
      
         System.out.println("Digite a quantidade de graus Celsius: ");
      c=leia.nextInt();       

      f = (c + 32) * 9/5;
      
      System.out.println("\nFórmula de conversão: F = 9/5 * c + 32 \n\n");
		System.out.println("Valor em celsius: "+ c + "\n\n");
		System.out.println("F = (9/5) * ("+ c + " + 32)" + "\n");
      
      comp = c + 32;
      
      System.out.println("\nLogo teremos: "+"F = (9/5 * )"+ comp+"\n\n");
      System.out.println("A média aritmética dos seus numeros é: " + f + "\n\n");
   
          
      System.out.println("\n---------------------------------------------------------");
      System.out.println("PROGRAMA FINALIZADO");
      System.out.printf("%s%n%n","---------------------------------------------------------");
 
   }

}
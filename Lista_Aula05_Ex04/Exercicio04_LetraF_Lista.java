import java.util.Scanner;
public class Exercicio04_LetraF_Lista

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      double area, base, altura;
      
      System.out.println("Digite a base do tri�ngulo: " + "\n");
      base=leia.nextInt();   
      System.out.println("\nDigite a altura do tri�ngulo: " + "\n");
      altura=leia.nextInt();    
   
      area = (base * altura) /2;
      
      System.out.println("\nA �rea do tri�ngulo �: " + area + "\n\n");
   
          
      System.out.println("\n---------------------------------------------------------");
      System.out.println("PROGRAMA FINALIZADO");
      System.out.printf("%s%n%n","---------------------------------------------------------");
   
   }

}
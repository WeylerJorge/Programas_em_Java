import java.util.Scanner;
public class Exercicio04_Lista

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      int sucessor, antecessor, num;
      
      System.out.println("Digite um numero: ");
      num=leia.nextInt(); 
      sucessor = num + 1;
      antecessor = num - 1;
      
      System.out.println("Seu numero: " + num);
      System.out.println("O sucessor do seu numero é: " + sucessor);
      System.out.println("O antecessor do seu numero é: " + antecessor);
   
          
      System.out.println("\n---------------------------------------------------------");
      System.out.println("PROGRAMA FINALIZADO");
      System.out.printf("%s%n%n","---------------------------------------------------------");
 
   }

}
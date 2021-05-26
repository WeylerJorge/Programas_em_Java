import java.util.Scanner;
public class Exercicio04_LetraC_Lista

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      int nota1, nota2, nota3, peso1, peso2, peso3, mp, cal;
      
         System.out.println("Digite a primeira nota: ");
      nota1=leia.nextInt();       
               System.out.println("Digite o peso da primeira nota: ");
      peso1=leia.nextInt();       
      
         System.out.println("Digite a segunda nota: ");
      nota1=leia.nextInt();       
               System.out.println("Digite o peso da segunda nota: ");
      peso1=leia.nextInt();  
      
         System.out.println("Digite a terceira nota: ");
      nota1=leia.nextInt();       
               System.out.println("Digite o peso da terceira nota: ");
      peso1=leia.nextInt();  

      cal = (nota1 * peso1) + (nota2 + peso2) + (nota3 + peso3)
      mp = (peso1 + peso2 + peso3)/cal;
      
      System.out.println("A média aritmética dos seus numeros é: " + mp);
   
          
      System.out.println("\n---------------------------------------------------------");
      System.out.println("PROGRAMA FINALIZADO");
      System.out.printf("%s%n%n","---------------------------------------------------------");
 
   }

}
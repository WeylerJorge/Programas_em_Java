import java.util.Scanner;
public class exercicio3
{  
   public static void main (String[] args)
   {        
   
      Scanner leia = new Scanner (System.in);
   
      int num, aux, cal=1;
      
      System.out.println("\n" + "Escreva um número: " + "\n");
      num=leia.nextInt();
      
      for (aux = 1; num >= aux; aux++)
      {
         System.out.println(aux);
         cal=cal*(aux);   
      }
      System.out.println("\n"+ "!" + num + " = " + cal +"\n");
   }
}

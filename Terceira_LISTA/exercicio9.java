import java.util.Random;
import java.util.Scanner;

public class exercicio9
{  
   public static void main (String[] args)
   {               
      Random gerador = new Random();
   
      Scanner leia = new Scanner (System.in);
   
      int i=0,meu_palpite=0, palpite_pc=0;
      
      System.out.println("Digite 0 para cara ou 1 para coroa: ");
      meu_palpite=leia.nextInt();
      
      for(i = 0; i < 10; i++)
      {
         palpite_pc = gerador.nextInt(2);
      }
      if (meu_palpite==palpite_pc)
      {
         System.out.println("Você ganhou!");
      }
      else
      {
         System.out.println("Você perdeu!");
      }
   }      
}
import java.util.Scanner;

public class Exercicio6

{  
   public static void main (String[] args)
   {
   
      Scanner leia = new Scanner (System.in);         
   
      //declarando variaveis
      int i, num;
      System.out.print("Digite um valor inteiro para verificar seus divisores: ");
      num=leia.nextInt();
            
      //repeticao1
      for(i = 1; i <= num;i++)
      {  
      
         if(num%i==0)
         {  
            System.out.println(i);  
         }     
      }
   }
}
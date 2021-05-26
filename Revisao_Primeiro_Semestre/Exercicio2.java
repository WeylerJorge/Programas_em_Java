import java.util.Scanner;

public class Exercicio2

{  
   public static void main (String[] args)
   {
   
      Scanner leia = new Scanner (System.in);
    
      //declarando variaveis
      int soma=0, i;
      
      //repeticao1
      for(i = 1; i<=10;i++)
      {
         System.out.print(soma+"+"+i+"=");
         soma=soma+i;
         System.out.print(soma+"\n");
      }
         
   }
}
import java.util.Scanner;

public class Exercicio5

{  
   public static void main (String[] args)
   {
   
      Scanner leia = new Scanner (System.in);         
   
      //declarando variaveis
      int i, num1, num2, qtde=0;
      System.out.print("Digite o valor de A: ");
      num1=leia.nextInt();
      System.out.print("Digite o valor de B: ");
      num2=leia.nextInt();
            
      //repeticao1
      for(i = 1; i<=1000;i++)
      {
         if(i%num1==0 && i%num2==0)
         {
         
         System.out.println(i);
         qtde++;
         
         }
      }
         System.out.println(qtde+" números são divisiveis por A e B ao mesmo tempo.");
   }
}
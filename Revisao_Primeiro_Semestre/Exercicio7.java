import java.util.Scanner;

public class Exercicio7

{  
   public static void main (String[] args)
   {
   
      Scanner leia = new Scanner (System.in);         
   
      //declarando variaveis
      int i, num1, num2;
      System.out.print("Digite um valor inteiro para verificar seus divisores: ");
      num1=leia.nextInt();
      System.out.print("Digite outro valor inteiro para verificar seus divisores: ");
      num2=leia.nextInt(); 
        
      System.out.print("Os divisores do primeiro valor são: \n");
      //repeticao1
      for(i = num2; i<=num1; i++)
      {  
         if(num1%i==0)
         {  
            System.out.print("Seu divisor é: " + i + "\n");  
         }     
      }
      
      System.out.print("Os divisores do segundo valor são: \n");
            //repeticao2
      for(i = num2; i <= num1; i++)
      {  
         if(num2%i==0)
         {  
            System.out.print("Seu divisor é: " + i + "\n");  
         }     
      }
   }
}
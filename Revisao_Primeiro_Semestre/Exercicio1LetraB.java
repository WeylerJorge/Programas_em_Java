import java.util.*;
import java.util.Scanner;

public class Exercicio1LetraB

{  
   public static void main (String[] args)
   {
   
   Scanner leia = new Scanner (System.in);
   
   //declarando variaveis
      int num1, num2, i;
      
    System.out.print("Digite o primeiro numero inteiro: ");
    num1=leia.nextInt();
    System.out.print("Digite o segundo numero inteiro maior do que o primeiro: ");
    num2=leia.nextInt();
     
     if(num2 > num1)
     {
      //repeticao
      for(i = num1; i<=num2;i++)
      {
       System.out.println(i);
      }
      
     }else
     {
     System.out.print("Digite um valor válido/Primeiro número maior que o segundo: ");
     }      
   }//fim main()
}//fim classe
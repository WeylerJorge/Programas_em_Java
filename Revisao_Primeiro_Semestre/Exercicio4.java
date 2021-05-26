import java.util.Scanner;

public class Exercicio4

{  
   public static void main (String[] args)
   {
   
      Scanner leia = new Scanner (System.in);         
   
      //declarando variaveis
      int soma=0, i, num1, num2;
      System.out.print("Digite o primeiro numero inteiro: ");
      num1=leia.nextInt();
      System.out.print("Digite o segundo numero inteiro: ");
      num2=leia.nextInt();
            
      //repeticao1
      for(i = num1; i<=num2;i++)
      {
         if(i%2==1 && i%3==0)
         {
         System.out.println(i);
         soma=soma+i;
         }
      }
         System.out.println("A soma dos número impares e multiplos de 3 do intervalo é= " + soma);
   }
}
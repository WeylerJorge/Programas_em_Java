import java.util.Scanner;
public class Exercicio02_Condicao_Se_Nao

//Exercicio02

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      //variáveis atribuidas
      int num;
      
      //solicitando um numero para verificação
      System.out.println("Digite um número: " + "\n");
      num=leia.nextInt();    
      
      //condição para verificar se é impar ou par
      if (num%2==0)
      {
      System.out.println("Seu número é par!" + "\n");
      }
      if (num%2!=0)
      {
      System.out.println("Seu número é ímpar!" + "\n");
      }
      
   
   }

}
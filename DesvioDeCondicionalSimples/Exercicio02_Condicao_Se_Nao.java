import java.util.Scanner;
public class Exercicio02_Condicao_Se_Nao

//Exercicio02

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      //vari�veis atribuidas
      int num;
      
      //solicitando um numero para verifica��o
      System.out.println("Digite um n�mero: " + "\n");
      num=leia.nextInt();    
      
      //condi��o para verificar se � impar ou par
      if (num%2==0)
      {
      System.out.println("Seu n�mero � par!" + "\n");
      }
      if (num%2!=0)
      {
      System.out.println("Seu n�mero � �mpar!" + "\n");
      }
      
   
   }

}
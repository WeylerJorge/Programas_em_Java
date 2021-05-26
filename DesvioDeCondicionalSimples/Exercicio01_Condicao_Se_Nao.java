import java.util.Scanner;
public class Exercicio01_Condicao_Se_Nao

//Exercicio01 - Com Else IF

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      //variavel utilizada
      int idade;
      
      //solicitando a idade
      System.out.println("Digite sua idade: " + "\n");
      idade=leia.nextInt();    
      
      //condicao para verificar a idade
      if (idade >=18)
      {
      System.out.println("Você é maior de idade!" + "\n");
      }
      else if (idade < 18)
      {
      System.out.println("Você não é maior de idade!" + "\n");
      }
      else
      {
      System.out.println("Insira um valor válido!" + "\n");
      }
   
   }

}
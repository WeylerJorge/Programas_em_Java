import java.util.Scanner;
public class exercicio1

{  
   public static void main (String[] args)
   {        
   
      Scanner leia = new Scanner (System.in);
   
      //declarando variaveis
      int qpares,qimpares,num;
        
      System.out.println("Digite um valor(digite 9999 para finalizar a leitura): \n");
      num=leia.nextInt(); 
      qimpares=0;
      qpares=0;
      //repeticao1
      while (num!=9999)
      {  
         System.out.println("Digite um valor(digite 9999 para finalizar a leitura): \n");
         num=leia.nextInt();
           
         if(num%2==0)
         {
            qpares++;
         }
         else
         {
            qimpares++;
         }           
      }
      System.out.println("Quantidade de número ímpares: " + qimpares + "\n");
      System.out.println("Quantidade de número pares: " + qpares + "\n");
   }
}
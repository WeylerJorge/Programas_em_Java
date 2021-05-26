import java.util.Scanner;
public class Exercicio04_LetraJ_Lista

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      int sn,n,a1,a2,an,r;
      
      //an = a1+(n-1).r
      
      System.out.println("Digite o primeiro termo: " + "\n");
      a1=leia.nextInt();    
      System.out.println("Digite o segundo termo: " + "\n");
      a2=leia.nextInt(); 
      System.out.println("Digite o numero de termos: " + "\n");
      n=leia.nextInt();     
   
      r = a2 - a1;
      an = a1+(n-1)*r;
      sn = n * (a1+an)/2;
      
      System.out.println("\nA soma dos termos desta P.A. é: " + sn);
   
          
      System.out.println("\n---------------------------------------------------------");
      System.out.println("------------------PROGRAMA FINALIZADO----------------------");
      System.out.printf("%s%n%n","---------------------------------------------------------");
   
   }

}
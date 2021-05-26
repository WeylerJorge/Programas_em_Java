import java.util.Scanner;

public class exercicio6
{  
   public static void main (String[] args)
   {        
   
      Scanner leia = new Scanner (System.in);
   
      int i, num, denom, aux, numerador,sinal;
      double fracao, s;
      
      System.out.println("\n" + "Escreva a quantidade de termos: " + "\n");
      num=leia.nextInt();
      numerador=1;
      denom=num;
      sinal=+1;
      s=0;
      for (i = 1; i<=num; i++)
      {
         fracao=sinal*numerador/denom;
         System.out.println(i+" : " + sinal + " " +numerador + " " + denom);
         s=s+fracao;
         numerador=numerador+1;
         denom=denom-1;
         sinal=sinal*(-1);
      }
      System.out.println("S = "+s);
   }
}

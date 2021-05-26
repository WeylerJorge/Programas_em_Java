import java.util.Scanner;

public class exercicio4
{  
   public static void main (String[] args)
   {        
   
      Scanner leia = new Scanner (System.in);
   
      int i, num, denom, aux, numerador,sinal;
      double fracao, s;
      
      System.out.println("\n" + "Escreva a quantidade de termos: " + "\n");
      num=leia.nextInt();
      numerador=1;
      denom=1;
      sinal=+1;
      s=0;
      for (i = 1; i<=num; i++)
      {
         fracao=sinal*numerador/(Math.pow(denom,3));
         System.out.println(i+" : " + sinal + " " +numerador + " " + denom);
         s=s+fracao;
         numerador=1;
         denom=denom+2;
         sinal=sinal*(-1);
      }
      System.out.println("S= "+s);
   }
}

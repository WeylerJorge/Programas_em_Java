import java.util.Scanner;

public class Ex01
{  
   public static void main (String[] args)
   {
    calculo();
   }
   public static void calculo()
   {
      Scanner leia = new Scanner (System.in);
   
      int ano, mes, dia, soma;
    
      System.out.println("Informe sua idade em anos: ");
      ano=leia.nextInt();
      System.out.println("Informe sua idade em meses: ");
      mes=leia.nextInt();
      System.out.println("Informe sua idade em dias: ");
      dia=leia.nextInt();
      
      soma = (dia+(ano*365)+(mes*30));
    
      System.out.println("Sua idade em dias: " + soma);
   }
}
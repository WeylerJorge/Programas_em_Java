import java.util.Scanner;

public class Ex02
{  
   public static void main (String[] args)
   {
    calculo();
   }
   public static void calculo()
   {
      Scanner leia = new Scanner (System.in);
   
      int ano, mes, dia;
    
      System.out.println("Informe sua idade em dias: ");
      dia=leia.nextInt();
      
      mes = dia / 12;
      
      ano = dia / 365;
    
      System.out.println("Sua idade em anos: " + ano + ", sua idade em meses: " + mes + ", sua idade em dias: " + dia);
   }
}
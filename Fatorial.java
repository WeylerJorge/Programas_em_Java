import java.util.Scanner;
public class Fatorial
{ static int fat, n;
   public static void main (String[] args){
      n=0;
      Scanner leia = new Scanner (System.in);
      System.out.println("\n" + "Escreva um número: " + "\n");
      n = leia.nextInt();
      fatorial();
      System.out.println("Valor do Fatorial = " + fat);
      fatorial();
      System.out.println("Valor do Fatorial = " + fat);
   }
   public static void fatorial(){
      int aux;
      fat = 1;
      for (aux = 1; n >= aux; aux++)
      {
         fat=fat*(aux);   
      }
   }
}
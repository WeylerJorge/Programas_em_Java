import java.util.Scanner;
public class Exercicio04_LetraE_Lista

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      double salario, percent, cal, total;
      
      System.out.println("Digite o valor do seu sal�rio: " + "\n");
      salario=leia.nextInt();   
      System.out.println("\nDigite a porcentagem que voc� ter� de aumento: " + "\n");
      percent=leia.nextInt();    
   
      cal = (percent / 100) * salario;
      
      total = salario + cal;
      
      System.out.println("\nSeu novo sal�rio �: R$" + total + "\n\n");
   
          
      System.out.println("\n---------------------------------------------------------");
      System.out.println("PROGRAMA FINALIZADO");
      System.out.printf("%s%n%n","---------------------------------------------------------");
   
   }

}
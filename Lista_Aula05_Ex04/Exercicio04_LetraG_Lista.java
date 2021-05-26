import java.util.Scanner;
public class Exercicio04_LetraG_Lista

{
   public static void main (String [] args)
   {
      Scanner leia = new Scanner (System.in);
      
      double peso_saco, quant_gato1, quant_gato2, result, result_dias, rest_dias;
      
      System.out.println("Digite o peso do Saco de ração: " + "\n");
      peso_saco=leia.nextInt();   
      System.out.println("\nDigite a quantidade de ração para o gato 1 em gramas: " + "\n");
      quant_gato1=leia.nextInt();    
      System.out.println("\nDigite a quantidade de ração para o gato 2 em gramas: " + "\n");
      quant_gato2=leia.nextInt();   
   
      result = peso_saco * 1000;
      
      System.out.println("\nO peso do saco de ração em gramas é: " + result + "g" +"\n");
      
      result_dias = (quant_gato1 + quant_gato2) * 5;
      
      rest_dias = result - result_dias;
      
      System.out.println("\nA quantidade de ração que irá restar após 5 dias é de: " + rest_dias + "g");
   
          
      System.out.println("\n---------------------------------------------------------");
      System.out.println("------------------PROGRAMA FINALIZADO----------------------");
      System.out.printf("%s%n%n","---------------------------------------------------------");
   
   }

}
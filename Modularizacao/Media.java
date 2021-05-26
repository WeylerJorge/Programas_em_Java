import java.util.Scanner;

public class Media
{ static double media;
   
   public static void main (String[] args){
      procedimento();
      System.out.printf("\n Valor da média: %1.2f.%n" ,media);
   }
   public static void procedimento(){
   
      Scanner leia = new Scanner (System.in);
      
      int val, qnt=0, soma=0;
      
      System.out.println("\n Digite um valor positivo(digite qualquer valor negativo para finalizar a leitura): \n");
      val=leia.nextInt();  
      
      
      while (val >= 0)
      {  
      
         soma+=val;
         qnt=qnt+1;
      
         System.out.println("\n Digite um valor positivo(digite qualquer valor negativo para finalizar a leitura): \n");
         val=leia.nextInt();    
       
      }
      
      media = (double)soma/qnt; 
   }
}
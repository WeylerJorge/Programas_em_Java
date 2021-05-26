import java.util.Scanner;
public class exercicio2

{  
   public static void main (String[] args)
   {        
   
      Scanner leia = new Scanner (System.in);
   
      //declarando variaveis
      int menor,maior,num, quant,soma;
      double media;
        
      System.out.println("Digite um valor(digite qualquer valor negativo para finalizar a leitura): \n");
      num=leia.nextInt();
      maior=num;
      menor=num;
      soma=0;
      quant=0;
      //repeticao1
      while (num >= 0)
      {  
      soma=soma+num;
      quant=quant+1;
         System.out.println("Digite um valor positivo(digite qualquer valor negativo para finalizar a leitura): \n");
         num=leia.nextInt();        
      }
      media=(double)soma/quant;
      System.out.println("Maior valor da sequencia: " + maior + "\n");
      System.out.println("Maior valor da sequencia: " + menor + "\n");
      System.out.println("Soma dos valores da sequencia: " + soma + "\n");
      System.out.println("Media da sequencia: " + media + "\n");
   }
}
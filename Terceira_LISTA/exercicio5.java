import java.util.Scanner;

public class exercicio5
{  
   public static void main (String[] args)
   {         
      Scanner leia = new Scanner (System.in);
      
      //Declarando as variáveis.
      int aux1, aux2,aux3,num,cont,soma;
      //Atribuindo os valores.
      aux1 = 1;
      aux2 = 1;
      soma = 0;
      
      System.out.println("Digite um numero maior que 2");
      num=leia.nextInt();
      if(2<num)
      {
         System.out.println(aux1);
         System.out.println(aux2);
         cont = 2;
         
         for(cont=1; cont<num; cont++){
            aux3=aux1+aux2;
            System.out.println(aux3);
            aux1 = aux2;
            aux2 = aux3;
            soma=soma+num;
         }
         System.out.println("A soma dos termos é: " + soma);
      }
      else{
         System.out.println("Insira um valor maior que 2.");
      }   
   }
}
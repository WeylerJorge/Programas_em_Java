import java.util.*;
public class exercicio10
{
   public static void main(String[] args)
   {
      Scanner leia = new Scanner(System.in);
      int numero, men=0, mai=1023, tentativas=0;
      char referencial;
   
      System.out.print("Digite um número entre 1 e 1023 para o programa adivinhar: ");
      numero=leia.nextInt();
      
      // Mediana entre 0 e 1023 é: 511
      numero = Math.round(1023/2);
      
      do
      {
         tentativas++;
         System.out.printf("Informe se o número é =, > ou < que %d: ", numero);
         referencial = leia.next().charAt(0);
         
         // é MAIOR
         if (referencial == '>')
         {
            men = numero;
            numero=(mai+men)/2;
         } 
         
         // é MENOR
         else
         {
            if (referencial == '<')
            {
               mai = numero;
               numero=(mai+men)/2;
            }
            
            // é IGUAL
            else
            {
               if (referencial != '=')
               {
                  System.out.println("Seu número é "+numero);
               }
            }
         }
      } while(referencial != '=');
     
      System.out.println("\nNúmero de tentativas: "+tentativas);
      System.out.println("Seu número é: "+numero);
   }
}
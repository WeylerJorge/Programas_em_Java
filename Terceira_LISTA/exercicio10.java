import java.util.*;
public class exercicio10
{
   public static void main(String[] args)
   {
      Scanner leia = new Scanner(System.in);
      int numero, men=0, mai=1023, tentativas=0;
      char referencial;
   
      System.out.print("Digite um n�mero entre 1 e 1023 para o programa adivinhar: ");
      numero=leia.nextInt();
      
      // Mediana entre 0 e 1023 �: 511
      numero = Math.round(1023/2);
      
      do
      {
         tentativas++;
         System.out.printf("Informe se o n�mero � =, > ou < que %d: ", numero);
         referencial = leia.next().charAt(0);
         
         // � MAIOR
         if (referencial == '>')
         {
            men = numero;
            numero=(mai+men)/2;
         } 
         
         // � MENOR
         else
         {
            if (referencial == '<')
            {
               mai = numero;
               numero=(mai+men)/2;
            }
            
            // � IGUAL
            else
            {
               if (referencial != '=')
               {
                  System.out.println("Seu n�mero � "+numero);
               }
            }
         }
      } while(referencial != '=');
     
      System.out.println("\nN�mero de tentativas: "+tentativas);
      System.out.println("Seu n�mero �: "+numero);
   }
}
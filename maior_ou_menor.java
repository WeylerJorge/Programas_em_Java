import java.util.Scanner;
class maior_ou_menor
{
      public static void main(String[] args)
      {
         Scanner leia = new Scanner(System.in);
         
         //Declaracao de variaveis
         int x,y;
         
         //leitura dos numeros
         System.out.print("Digite o primeiro valor inteiro : ");
         x = leia.nextInt();
         System.out.print("Digite o segundo valor inteiro : ");
         y = leia.nextInt();
         // Verificar qual � o maior valor 
         if (x > y)
         {
            System.out.println("O maior valor � : " + x);
         }
         else if( y > x )
         {
            System.out.println("O maior valor � : " + y);
         }
         else
         {
            System.out.println("Os valores s�o iguais! ");

         }
      }
 }

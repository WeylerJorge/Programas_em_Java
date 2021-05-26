import java.util.Scanner;
 class Main {
   public static void main(String []args) {
   
   Scanner teclado = new Scanner(System.in);
   int num, result;
   
   System.out.print("Digite um número: ");
   num = teclado.nextInt();
   
   result = (num % 7);
   
   System.out.println("Resultado: "+result);
   
   }
 }
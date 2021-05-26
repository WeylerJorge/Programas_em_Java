//sucessor de um número 

import java.util.Scanner;
 class Main {
   public static void main(String []args) {
   
   Scanner teclado = new Scanner(System.in); 
   int num, sucess;
   
   System.out.print("Digite um número: ");
   num = teclado.nextInt();
   
   sucess = (num + 1);
   
   System.out.println("O sucessor do número digitado é: "+sucess);
   }
  }
//sucessor de um n�mero 

import java.util.Scanner;
 class Main {
   public static void main(String []args) {
   
   Scanner teclado = new Scanner(System.in); 
   int num, sucess;
   
   System.out.print("Digite um n�mero: ");
   num = teclado.nextInt();
   
   sucess = (num + 1);
   
   System.out.println("O sucessor do n�mero digitado �: "+sucess);
   }
  }
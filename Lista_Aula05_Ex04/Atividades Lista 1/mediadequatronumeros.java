//media de quatro numeros números 

import java.util.Scanner;
 class Main {
   public static void main(String []args) {
   
   Scanner teclado = new Scanner(System.in); 
   int num1, num2, num3, num4, media;
   
   System.out.print("Digite um número inteiro: ");
   num1 = teclado.nextInt();
   System.out.print("Digite um número inteiro: ");
   num2 = teclado.nextInt();
   System.out.print("Digite um número inteiro: ");
   num3 = teclado.nextInt();
   System.out.print("Digite um número inteiro: ");
   num4 = teclado.nextInt();
   
   media = (num1 + num2 + num3 + num4 / 4);
   System.out.println("A média é: "+media);
   
   }
  }
   
// Quantidade de ra��o consumida em 5 dias 

import java.util.Scanner;
 class Main {
   public static void main(String []args) {
   
   Scanner teclado = new Scanner(System.in);
   double saco = 1, sacogm, gato1, gato2, restogm, restokg, total;
   
   System.out.print("Digite a quantidade de ra��o que o gato 1 come por dia: ");
   gato1 = teclado.nextDouble();
   System.out.print("Digite a quantidade de ra��o que o gato 2 come por dia: ");
   gato2 = teclado.nextDouble();
   
   sacogm = saco * 1000;
   total = (gato1 + gato2) * 5;
   restogm = sacogm - total;
   restokg = restogm / 1000;
   
   System.out.print("A quantidade em gramas restante �: "+restogm);
   System.out.print("A quantidade em Kg restante �: "+restokg);
   
   }
  }
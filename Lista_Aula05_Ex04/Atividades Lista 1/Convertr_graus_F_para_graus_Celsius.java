// a conversão de graus Fahrenheit para graus Centígrados é obtida por
// C = 5/9*(F - 32)
// Fazer um programa que leia um valor de temperatura em graus Fahrenheint e 
//escreva o seu correspondente em graus Centígraods.
import java.util.Scanner;
class Convertr_graus_F_para_graus_Celsius {
   public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     double F, C;
     System.out.print("Digite um valor de temperatura em graus Fahrenheit: ");
     F = teclado.nextDouble();
     C = 5.0/9.0 * (F - 32);
     System.out.println("Valor da temperatura em graus Celsius: " + C);
    
     teclado.close();
     }
  }
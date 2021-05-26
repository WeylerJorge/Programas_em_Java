// Programa para cálculo da área de um triângulo 
import java.util.Scanner;
 class Calcula_area_do_triangulo {
   public static void main(String []args) {
       
     Scanner teclado = new Scanner(System.in); 
       
     float base, altura, area;
     
     System.out.print("Digite um valor para a base: ");
     base = teclado.nextFloat();
     System.out.print("Digite um valor para a altura: ");
     altura = teclado.nextFloat();
      
     area = base * altura / 2;
     
     System.out.println("Área do triângulo : "+area);
     
     }
   }
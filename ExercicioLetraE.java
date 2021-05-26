import java.util.Scanner;

public class ExercicioLetraE

{  
   public static void main (String[] args)
   {
   
    //scanner
   Scanner leia = new Scanner (System.in);
  
   //declarando variaveis
    double b,a,c,resultado,resultadofinal;
    
      System.out.println("Insira o valor de A");
      a=leia.nextInt();
    System.out.print("\n---------------------------------------------");
      System.out.println("Insira o valor de B");
      b=leia.nextInt();
    System.out.print("\n---------------------------------------------");
      System.out.println("Insira o valor de C");
      c=leia.nextInt();
    System.out.print("\n---------------------------------------------");
    
    resultado= -b+(Math.pow(b,2)-4*a*c);
    resultadofinal= Math.pow(resultado,0.5)/2*a;

    System.out.printf("\nO resultado é %2d e %2d%5.2f\n",resultado);

    
   }//fim main()
}//fim classe
import java.util.Scanner;//classe para ler o teclado

public class ExercicioLetraD

{  
   public static void main (String[] args)
   {
   
      Scanner leia = new Scanner (System.in);
   
   //declarando variaveis
      double x,y,A,resultado1,resultado2,resultado3;
    
      System.out.println("Insira o valor de X");
      x=leia.nextInt();
      System.out.println("Insira o valor de Y");
      y=leia.nextInt();
      System.out.println("Insira o valor de A");
      A=leia.nextInt();
     
      resultado1=Math.pow(x,2);
      resultado2=Math.pow(y,3);
      resultado3=Math.pow(x,(A+4));
     
      System.out.println(".");
     
      if (resultado1>resultado2){
         System.out.println("Verdade");
      }
      else{
         System.out.println("A questão é falsa");
      }
     
      System.out.println("*");
      System.out.println("*");
      System.out.println("*");
      System.out.println("*");
      System.out.print("\n---------------------------------------------");
      System.out.println("PRESSIONE ENTER PARA CONTINUAR PARA A PROXIMA OPERACAO");
      leia.nextLine();
      System.out.print("\n---------------------------------------------");
      System.out.println("*");
      System.out.println("*");
      System.out.println("*");
      System.out.println("*");
     
      if(A<5){
         System.out.println("A é menor que 5");
      }
      else{
         System.out.println("A afirmação é falsa");
      }
   
    
   }//fim main()
}//fim classe
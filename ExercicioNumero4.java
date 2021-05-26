import java.util.Scanner;

public class ExercicioNumero4

{  
   public static void main (String[] args)
   {
   
      Scanner leia = new Scanner (System.in);
   
   //declarando variaveis
      double x1,y1,x2,y2,resultado;
    
      System.out.println("\n---------------------------------------------------------");
      System.out.println("CALCULANDO A DISTANCIA ENTRE DOIS PONTOS EM UMA RETA");
      System.out.printf("%s%n%n%n","---------------------------------------------------------");
    
      System.out.println("Insira o valor de X do ponto A");
      x1=leia.nextInt();
      System.out.println("Insira o valor de Y do ponto A");
      y1=leia.nextInt();
      System.out.println("Insira o valor de X do ponto B");
      x2=leia.nextInt();
      System.out.println("Insira o valor de Y do ponto B");
      y2=leia.nextInt();
      
      //tira a diferença.
      resultado = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
      //compara o resultado da diferença.
   
       //aperte enter para continuar(OPERAÇÕES)
      System.out.println("\n---------------------------------------------------------");
      System.out.println("PRESSIONE ENTER PARA CONTINUAR PARA AS PROXIMAS OPERACOES");
      System.out.printf("%s%n%n%n","---------------------------------------------------------");
      leia.nextLine();
          
      System.out.printf("\nA distância entre os dois pontos é: %2d%2.0f\n", +resultado);
   
    
   }//fim main()
}//fim classe
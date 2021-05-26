import java.util.Scanner;

public class ExemploMediaProcedimento
{  
   public static void main (String[] args)
   {
      mediaValores();
   }//fim main()
   
   public static void mediaValores(){
      Scanner leia = new Scanner (System.in);
   //declarando variaveis
      int a,b;
      double m;
    //entrada de dados
      System.out.println("Digite o primeiro valor: ");
      a=leia.nextInt();
      System.out.println("Digite o segundo valor: ");
      b=leia.nextInt();
      m=(a+b)/2.0;
    //saida de dados
      System.out.printf("A media de "+a+" e "+b+" igual a "+m);
   }
}//fim classe
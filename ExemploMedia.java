import java.util.*;
/*
   Autor:
   Data:
   Programa para calcular a media entre dois valores
*/
public class ExemploMedia
{  
   public static void main (String[] args)
   {
   Scanner leia = new Scanner (System.in);
   //declarando variaveis
    int a,b;
    double m;
    //entrada de dados
    System.out.print("Digite o valor para a:");
    a=leia.nextInt();
    System.out.print("Digite o valor para b:");
    b=leia.nextInt();
    m=(a+b)/2.0;
    //saida de dados
    System.out.printf("A media de "+a+" e "+b+" igual a "+m);
    System.out.printf("\nA media de %d e %d igual a %4.2f\n",a,b,m);
    
   }//fim main()
}//fim classe